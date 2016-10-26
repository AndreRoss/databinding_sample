package de.check24.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.check24.databinding.bindings.ViewBindings;
import de.check24.databinding.databinding.ActivityMainStep3Binding;
import de.check24.databinding.model.Person;
import de.check24.databinding.viewModel.PersonViewModel;

/**
 * Data binding step 3: Introduce view model (@link {@link PersonViewModel})
 * and custom binding adapter for visibility ({@link ViewBindings}). Advantages:
 * <p>
 * 1) No complex logic in xml
 * 2) Unit-Testable
 * 3) Debuggable
 */
public class MainActivityStep3 extends AppCompatActivity {

    // view binding that contains all views
    private ActivityMainStep3Binding view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // use generated binding object
        view = ActivityMainStep3Binding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        setData();
    }

    private void setData() {
        // set view model
        view.setVariable(BR.viewModel, new PersonViewModel(Person.getTestPerson()));
        // update view
        view.executePendingBindings();
    }
}
