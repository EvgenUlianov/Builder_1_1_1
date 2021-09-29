package Persons;

public class PersonBuilder {

    protected Person person;

    public PersonBuilder setFirstName(String firstName) { person.firstName = firstName; return this; }
    public PersonBuilder setLastName(String lastName) { person.lastName = lastName; return this; }
    public PersonBuilder setAge(int age)  throws IllegalArgumentException  {
        if (age < 0)
            throw new IllegalArgumentException ("возраст не может быть меньше нуля");
        person.age = age;
        person.ageInitiated = true;
        return this; }
    public PersonBuilder setAddress(String address) { person.address = address; return this; }

    public PersonBuilder() {
        person = new Person();
    }

    public Person build() throws IllegalStateException {
        if ((person.firstName == null || person.firstName.isEmpty())
                && (person.lastName == null || person.lastName.isEmpty()))
            throw new IllegalStateException ("не указаны имя и фамилия");
        else if (person.firstName == null || person.firstName.isEmpty())
            throw new IllegalStateException ("не указано имя");
        else if (person.lastName == null || person.lastName.isEmpty())
            throw new IllegalStateException ("не указана фамилия");

        return person;

    }
}
