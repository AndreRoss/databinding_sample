package de.check24.databinding.viewModel;

import de.check24.databinding.model.Person;

/**
 * View model that acts between model {@link Person} and view and contains
 * the display logic.
 */
public class PersonViewModel {

    public Person person;

    public PersonViewModel(Person person) {
        this.person = person;
    }

    public String getName() {
        return person.firstName + " " + person.lastName;
    }

    public String getStreet() {
        return person.street + " " + person.houseNumber;
    }

    public String getCity() {
        return person.postalCode + " " + person.city;
    }

    public String getPhone() {
        return person.phone;
    }

    public String getMobile() {
        return person.mobile;
    }

    public String getEmail() {
        return person.email;
    }

    public boolean isMobileVisible() {
        return person.mobile != null;
    }

    public boolean isEmailVisible() {
        return person.email != null;
    }
}

