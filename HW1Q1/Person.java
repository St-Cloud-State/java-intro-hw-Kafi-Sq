public class Person {
    private String firstName;
    private String lastName;
    public String id;

    public Person(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getID() {
        return id;
    }

    public String toString() {
        return firstName + lastName + id;
    }

    Person person1 = new Person("Hassen", "Hassen", "1");
    public void run() {
        System.out.println(person1.toString());
    }
}


