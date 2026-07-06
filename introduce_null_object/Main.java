package introduce_null_object;

public class Main {
    Customer customer = site.getCustomer();

    String customerName = customer.getName();

    BillingPlan plan = customer.getPlan();

    int weeksDeliquent = customer.getHistory().getWeeksDelinquentInLastYear();
}

class Company {
    private Customer customer;

    public Customer getCustomer() {
        return (customer == null) ? Customer.newNull() : customer;
    }
}

class Customer {
    public static Customer newNull() {
        return new NullCustomer();
    }

    public boolean isNull() {
        return false;
    }

    public String getName() {

    }

    public BillingPlan getPlan() {

    }

    public PaymentHistory getHistory() {

    }
}

class NullCustomer extends Customer {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "N/A";
    }

    @Override
    public BillingPlan getPlan() {
        return BillingPlan.basic();
    }

    @Override
    public PaymentHistory getHistory() {
        return PaymentHistory.newNull();
    }
}

public class NullPaymentHistory extends PaymentHistory {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public int getWeeksDelinquentInLastYear() {
        return 0;
    }
}

class PaymentHistory {
    public boolean isNull() {
        return false;
    }

    public static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }

    public int getWeeksDelinquentInLastYear() {

    }
}
