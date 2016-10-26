package de.check24.databinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import de.check24.databinding.model.Person;

/**
 * Main activity without using data binding.
 */
public class MainActivityWithoutDatabinding extends AppCompatActivity {

    private TextView name;
    private TextView street;
    private TextView city;
    private TextView phone;
    private TextView mobile;
    private TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_without_databinding);
        initViews();
        setData();
    }

    private void initViews() {
        name = (TextView) findViewById(R.id.name);
        street = (TextView) findViewById(R.id.street);
        city = (TextView) findViewById(R.id.city);
        phone = (TextView) findViewById(R.id.phone);
        mobile = (TextView) findViewById(R.id.mobile);
        email = (TextView) findViewById(R.id.email);
    }

    private void setData() {
        Person person = Person.getTestPerson();
        name.setText(person.firstName + " " + person.lastName);
        street.setText(person.street + " " + person.houseNumber);
        city.setText(person.postalCode + " " + person.city);
        phone.setText(person.phone);
        if (person.mobile != null) {
            mobile.setVisibility(View.VISIBLE);
            mobile.setText(person.mobile);
        } else {
            mobile.setVisibility(View.GONE);
        }
        if (person.email != null) {
            email.setVisibility(View.VISIBLE);
            email.setText(person.email);
        } else {
            email.setVisibility(View.GONE);
        }
    }
}
