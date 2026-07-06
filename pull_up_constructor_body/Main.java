package pull_up_constructor_body;

public class Main {

}

class Employee {
    private String name;
    private String id;

    protected Employee(String name, String id) {
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }
}