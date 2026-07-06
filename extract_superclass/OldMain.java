package extract_superclass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class OldMain {

}

class Employee {
    private String name;
    private int annualCost;
    private String id;

    public Employee(String name, String id, int annualCost) {
        this.name = name;
        this.id = id;
        this.annualCost = annualCost;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private Vector staff = new Vector<>();

    public Department(String name) {
        this.name = name;
    }

    public int getTotalAnnualCost() {
        int result = 0;
        Iterator i = staff.iterator();
        while (i.hasNext()) {
            Employee each = (Employee) i.next();
            result += each.getAnnualCost();
        }
        return result;
    }

    public int getHeadCount() {
        return staff.size();
    }

    public Enumeration getStaff() {
        return staff.elements();
    }

    public void addStaff(Employee arg) {
        staff.addElement(arg);
    }

    public String getName() {
        return name;
    }
}