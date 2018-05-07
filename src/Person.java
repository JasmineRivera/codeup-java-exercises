public class Person {
    private String name;
    public Person(String name) {
        setName(name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) System.out.println("That is invalid!");
        else this.name = name;
    }
    public void sayHello() {
        System.out.printf("Hello %s!%n", name);
    }

    public static void main(String[] args) {
        Person person = new Person("Mira");
        System.out.println(person.getName());
        person.setName("Mira Fawn");
        person.sayHello();
    }
}
