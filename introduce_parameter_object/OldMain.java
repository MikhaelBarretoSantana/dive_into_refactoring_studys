package introduce_parameter_object;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class OldMain {
    Account account = new Account();
    
    double flow = account.getFlowBetween(startDate, endDate);
}

class Account {
    private Vector transaction = new Vector<>();

    public double getFlowBetween(Date start, Date end) {
        double result = 0;
        Enumeration e = transaction.elements();
        
        while (e.hasMoreElements()) {
            Transaction each = (Transaction) e.nextElement();
            if (each.getDate().compareTo(start) >= 0 && each.getDate().compareTo(end) <= 0) {
                result += each.getValue();
            }
        }
        return result;
    }
}

class Transaction {
    private Date chargeDate;
    private double value;

    public Transaction(double value, Date chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    public Date getDate() {
        return chargeDate;
    }

    public double getValue() {
        return value;
    }
}