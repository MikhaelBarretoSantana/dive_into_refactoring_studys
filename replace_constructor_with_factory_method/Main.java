package replace_constructor_with_factory_method;

public class Main {
    Employee eng = Employee.create(EmployeeType.ENGINEER);

}

enum EmployeeType {
    ENGINEER, SALESMAN, MANAGER
}

abstract class Employee {
    Employee() {
    }

    public static Employee create(EmployeeType employeeType) {
        return switch (employeeType) {
            case ENGINEER -> new Engineer();
            case SALESMAN -> new Salesman();
            case MANAGER -> new Manager();
            default -> throw new IllegalArgumentException("Não foi encontrado nenhum tipo de Empregado com esse tipo");
        };
    }

    public abstract int getPaymentAmount();
}

class Engineer extends Employee {
    public Engineer() {
    }

    @Override
    public int getPaymentAmount() {
        return 5000;
    }
}

class Salesman extends Employee {
    @Override
    public int getPaymentAmount() {
        return 3000 + 1500;
    }
}

class Manager extends Employee {
    @Override
    public int getPaymentAmount() {
        return 8000;
    }
}