package replace_parameter_with_explicit_methods;

public class OldMain {
    if (weekend) {
        order.applyDiscount(Order.FIXED_DISCOUNT, 10);
    }

    if (order.items.size() > 5) {
        order.applyDiscount(Order.PERCENT_DISCOUNT, 0.2);
    }
}

class Order {
    public static final int FIXED_DISCOUNT = 0;
    public static final int PERCENT_DISCOUNT = 1;

    public void applyDiscount(int type, double discount) {
        switch (type) {
            case FIXED_DISCOUNT:
                price -= discount;
                break;
        
            case PERCENT_DISCOUNT:
                price *= discount;
                break;
            default:
                throw new IllegalArgumentException("Invalid discount type");
        }
    }
    
}