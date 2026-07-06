package parametrize_method;

public class Main {
    if (employee.yearsOfExperience > 5) {
        if (employee.clients.size() > 10) {
            employee.promoteToManager();
        } else {
            employee.raise(0.05);
        }
    }
}

class Employee {
    public void promoteToManager() {
        type = Employee.MANAGER();
        raise(0.5);
    }

    public void raise(double percent) {
        salary *= (1 + percent);
    }
}