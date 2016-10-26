package de.check24.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.check24.databinding.databinding.ActivityMainStep2Binding;
import de.check24.databinding.model.Person;

/**
 * Data binding step 2: Set data object to view. Advantages:
 * <p>
 * 1) No (ugly) view preparation from outside
 * 2) Readability
 */
public class MainActivityStep2 extends AppCompatActivity {

    // view binding that contains all views
    private ActivityMainStep2Binding view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = ActivityMainStep2Binding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        setData();
    }

    private void setData() {
        // set model
        view.setPerson(Person.getTestPerson());
        // update view
        view.executePendingBindings();
    }
}
