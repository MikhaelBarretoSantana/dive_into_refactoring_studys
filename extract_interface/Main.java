package extract_interface;

public class Main {

}

class TimeSheet {
    public double charge(Billable employee, int days) {
        double base = employee.getRate() * days;

        if (employee.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }
}

interface Billable {
    public int getRate();

    public boolean hasSpecialSkill();
}

class Employee implements Billable {

    @Override
    public int getRate() {

    }

    @Override
    public boolean hasSpecialSkill() {

    }
}