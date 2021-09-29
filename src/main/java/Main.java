import Persons.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Люди");

        Person mom = new PersonBuilder()
                .setFirstName("Анна")
                .setLastName("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setFirstName("Антошка")
                .build();

        Person maria = new PersonBuilder()
                .setFirstName("Маша")
                .setLastName("Максимова")
                .build();

        System.out.println("У " + mom + " есть сын, " + son);

        son.happyBirthday();
        System.out.println(son);
        System.out.println(maria);

        // in test
        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }

    }
}
