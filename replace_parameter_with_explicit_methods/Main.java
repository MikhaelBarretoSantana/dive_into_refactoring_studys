package replace_parameter_with_explicit_methods;

public class Main {
    if (weekend) {
        order.applyFixedDiscount(10);
    }

    if (order.items.size() > 5) {
        order.applyPercentDiscount(0.2);
    }
}

class Order {    
    public void applyFixedDiscount(double discount) {
        price -= discount;
    }

        public void applyPercentDiscount(double discount) {
        price *= discount;
    }
}