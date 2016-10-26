package de.check24.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import de.check24.databinding.databinding.ActivityMainStep1Binding;
import de.check24.databinding.model.Person;

/**
 * Data binding step 1: Use generated binding object.
 * <p>
 * 1)  no of view members
 * 2)  no findViewById with cast
 */
public class MainActivityStep1 extends AppCompatActivity {

    // view binding that contains all views
    private ActivityMainStep1Binding view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view = ActivityMainStep1Binding.inflate(getLayoutInflater());
        setContentView(view.getRoot());
        setData();
    }

    private void setData() {
        Person person = Person.getTestPerson();
        view.name.setText(person.firstName + " " + person.lastName);
        view.street.setText(person.street + " " + person.houseNumber);
        view.city.setText(person.postalCode + " " + person.city);
        view.phone.setText(person.phone);
        if (person.mobile != null) {
            view.mobile.setVisibility(View.VISIBLE);
            view.mobile.setText(person.mobile);
        } else {
            view.mobile.setVisibility(View.GONE);
        }
        if (person.email != null) {
            view.email.setVisibility(View.VISIBLE);
            view.email.setText(person.email);
        } else {
            view.email.setVisibility(View.GONE);
        }
    }
}
