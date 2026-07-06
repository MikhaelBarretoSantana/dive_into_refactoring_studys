package replace_constructor_with_factory_method;

public class OldMain {
    Employee eng = new Employee(Employee.ENGINEER);
}

class Employee {

    private int type;
    
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    public Employee(int type) {
        this.type= type;
    }
}