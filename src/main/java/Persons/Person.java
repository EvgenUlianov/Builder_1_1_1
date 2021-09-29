package Persons;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Integer age;
    protected boolean ageInitiated;
    protected String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person happyBirthday() {
        if(ageInitiated)
            age++;
        return this;
    }

    public boolean hasAge() {
        return (age != null);
    }

    protected Person() {
        this.ageInitiated = false;
    }

    public PersonBuilder newChildBuilder(){
        PersonBuilder childBuilder = new PersonBuilder();
        childBuilder.setLastName(this.lastName);
        childBuilder.setAge(0);
        return childBuilder;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder()
                .append("Person{")
                .append(firstName)
                .append(" ")
                .append(lastName);
        if (age != null)
            if (age == 0)
                stringBuilder.append(" (has born only)");
            else
                stringBuilder.append(" (").append(age).append(" age)");
        if (address != null)
            stringBuilder.append(" (from ").append(address).append(")");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
