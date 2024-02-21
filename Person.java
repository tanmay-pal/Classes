public class Person {
    private String name;
    private int age;
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Rahul";
        person1.age = 25;
        person1.displayInfo();

        Person person2 = new Person("Rohit", 30);
        person2.displayInfo();

        Person person3 = createPerson("Singh", 40);
        person3.displayInfo();
    }

    public static Person createPerson(String name, int age) {
        Person person = new Person();
        person.name = name;
        person.age = age;
        return person;
    }
}

