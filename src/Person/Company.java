package Person;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        List<Person> workers = new ArrayList<>();

        Person manager = new Person("Gui Adrian", 42, "manager");
        Person welder = new Person("Maghiu Viorel", 37, "welder");
        Person carpenter = new Person("Trif Sorin", 47, "carpenter");
        Person carpenter1 = new Person("Morar Vlad", 33, "carpenter");
        Person plumber = new Person("Grecu Benone", 40, "plumber");

        workers.add(manager);
        workers.add(welder);
        workers.add(carpenter);
        workers.add(carpenter1);
        workers.add(plumber);

        System.out.println("Company members are: ");
        roster(workers);
        System.out.println(getManager(workers));
        System.out.println(getPersons(workers, "carpenter"));
        System.out.println(getPersonsOlder(workers, 40));
        System.out.println(getPerson(workers, "Morar Vlad"));
        employ(workers, new Person("Dragos Alin", 29, "tehnician"));
        System.out.println("Company members are: ");
        roster(workers);
    }

    private static Person getManager(List<Person> list) {
        for (Person x : list) {
            if (x.getPosition().equals("manager")) {
                return x;
            }
        }
        return null;
    }

    private static List<Person> getPersons(List<Person> list, String profession) {
        List<Person> professionList = new ArrayList<>();
        for (Person x : list) {
            if (x.getPosition().equals(profession)) {
                professionList.add(x);
            }
        }
        return professionList;
    }

    private static List<Person> getPersonsOlder(List<Person> list, int age) {
        List<Person> olderList = new ArrayList<>();
        for (Person x : list) {
            if (x.getAge() > age) {
                olderList.add(x);
            }
        }
        return olderList;
    }

    private static List<Person> getPerson(List<Person> list, String filterName) {
        List<Person> nameList = new ArrayList<>();
        for (Person person : list) {
            if (person.getName().equals(filterName)) {
                nameList.add(person);
            }
        }
        return nameList;
    }

    private static void employ(List<Person> list, Person person) {
        if (list.contains(person)) {
            System.out.println("Already in company!");
        } else {
            list.add(person);
            System.out.println(person + " is now hired.");
        }
    }

    private static void roster(List<Person> list) {
        list.forEach(person -> System.out.println(person.getName() + ", " +
                person.getAge() + " years old, is a " + person.getPosition()));
    }
}