package introduce_parameter_object;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    Account account = new Account();

    double flow = account.getFlowBetween(new DateRange(startDate, endDate));
}

class Account {
    private Vector transaction = new Vector<>();

    public double getFlowBetween(DateRange dateRange) {
        double result = 0;
        Enumeration e = transaction.elements();

        while (e.hasMoreElements()) {
            Transaction each = (Transaction) e.nextElement();
            if (dateRange.includes(each.getDate())) {
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

class DateRange {
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public boolean includes(Date arg) {
        return (arg.compareTo(start) >= 0 && arg.compareTo(end) <= 0);
    }
}