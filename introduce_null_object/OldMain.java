package introduce_null_object;

public class OldMain {

    Customer customer = site.getCustomer();

    String customerName;

    if (customer == null) {
        customerName = "N/A";
    } else {
        customerName = customer.getName();
    }


    BillingPlan plan;

    if (customer == null) {
        plan = BillingPlan.basic();
    } else {
        plan = customer.getPlan();
    }

    int weeksDeliquent;

    if (customer == null) {
        weeksDeliquent = 0;
    } else {
        weeksDeliquent = customer.getHistory().getWeeksDelinquentInLastYear();
    }
}

class Company {

    private Customer customer;
    public Customer getCustomer() {
        return this.customer;
    }

}


class Customer {

    public String getName() {

    }

    public BillingPlan getPlan() {

    }

    public PaymentHistory getHistory() {

    }

}

class PaymentHistory {
    public int getWeeksDelinquentInLastYear() {

    }
}
