package extract_superclass;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Main {

}

abstract class Party {
    protected String name;

    protected Party(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract public int getAnnualCost();

    abstract public int getHeadCount();
}

class Employee extends Party {
    private int annualCost;
    private String id;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }

    @Override
    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }

    @Override
    public int getHeadCount() {
        return 1;
    }
}

class Department extends Party {
    private Vector items = new Vector<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public int getAnnualCost() {
        int result = 0;
        Iterator i = items.iterator();
        while (i.hasNext()) {
            Party each = (Party) i.next();
            result += each.getAnnualCost();
        }
        return result;
    }

    @Override
    public int getHeadCount() {
        int headCount = 0;

        Iterator i = items.iterator();
        while (i.hasNext()) {
            Party each = (Party) i.next();
            headCount += each.getHeadCount();
        }
        return headCount;
    }

    public Enumeration getItems() {
        return items.elements();
    }

    public void addStaff(Employee arg) {
        items.addElement(arg);
    }
}