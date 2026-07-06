package remove_setting_method;

public class Main {
    
}

class Account {
    private String id;

    public Account(String id) {
        initializeId(id);
    }

    protected void initializeId(String id) {
        this.id = "ID" + id;
    }
}

class InterestAccount extends Account {
    private double interestRate;
    
    public InterestAccount(String id, double interestRate) {
        super(id);
        this.interestRate = interestRate;
    }
}