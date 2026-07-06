package pull_up_constructor_body;

public class OldMain {
    
}

class Employee {
    protected String name;
    protected String id;
}

class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}