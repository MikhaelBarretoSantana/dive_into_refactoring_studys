package replace_conditional_with_polymorphism;

public class Main {

}

class Employee {
    private EmployeeType type;

    public int getTypeCode() {
        return type.getTypeCode();
    }

    public int mounthlySalary;
    public int comission;
    public int bonus;

    public int payAmount() {
        return type.payAmount(this);
    }
}

abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract public int getTypeCode();

    abstract public int payAmount(Employee employee);

    public static EmployeeType newType(int code) {
        switch (code) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("Incorrect Employee Code");
        }
    }

}

class Engineer extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.mounthlySalary;
    }
}

class Salesman extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.mounthlySalary + employee.comission;

    }
}

class Manager extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.MANAGER;
    }

    @Override
    public int payAmount(Employee employee) {
        return employee.mounthlySalary + employee.bonus;
    }
}