package de.check24.databinding.model;

/**
 * Person dao.
 */
public class Person {

    public String firstName;
    public String lastName;
    public String street;
    public String houseNumber;
    public String postalCode;
    public String city;
    public String phone;
    public String mobile;
    public String email;

    public static Person getTestPerson() {
        final Person person = new Person();
        person.firstName = "André";
        person.lastName = "Roß";
        person.street = "Musterstraße";
        person.houseNumber = "10";
        person.postalCode = "48155";
        person.city = "Münster";
        person.phone = "1234";
        person.mobile = "12345";
        person.email = "andre.ross@check24.de";
        return person;
    }
}
