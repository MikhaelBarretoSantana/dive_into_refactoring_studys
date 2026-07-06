package replace_conditional_with_polymorphism;

public class OldMain {

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
        switch (getTypeCode()) {
            case EmployeeType.ENGINEER:
                return mounthlySalary;

            case EmployeeType.SALESMAN:
                return mounthlySalary + comission;

            case EmployeeType.MANAGER:
                return mounthlySalary + bonus;
            default:
                throw new RuntimeException("Incorrect Employee Code");
        }
    }
}

abstract class EmployeeType {
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    abstract public int getTypeCode();

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
}

class Salesman extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}

class Manager extends EmployeeType {
    @Override
    public int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}