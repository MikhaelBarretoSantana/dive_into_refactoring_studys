package decompose_conditional;

import java.util.Date;

public class Main {

}

class Stadium {
    public double summerRate;
    public double winterRate;
    public double winterServiceCharge;

    public double getTicketPrice(Date date, int quantity) {
        double charge;

        if (isSummer(date)) {
            charge = summerCharge(quantity);
        } else {
            charge = winterCharge(quantity);
        }

        return charge;
    }

    private boolean isSummer(Date date) {
        return date.before(WINTER_START) || date.after(WINTER_END);
    }

    private double summerCharge(int quantity) {
        return quantity * summerRate;
    }

    private double winterCharge(int quantity) {
        return quantity * winterRate + winterServiceCharge;
    }
}