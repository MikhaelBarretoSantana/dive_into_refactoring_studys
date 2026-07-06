package parametrize_method;

public class OldMain {
    if (employee.yearsOfExperience > 5) {
        if (employee.clients.size() > 10) {
            employee.promoteToManager();
        } else {
            employee.fivePercentRaise();
        }
    }
}

class Employee {

    public void promoteToManager() {
        type = Employee.MANAGER();
        salary *= 1.5;
    }

    public void tenPercentRaise() {
        salary *= 1.1;
    }

    public void fivePercentRaise() {
        salary *= 1.05;
    }
}