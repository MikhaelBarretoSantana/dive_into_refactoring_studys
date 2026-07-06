package consolidate_conditional_expression;

public class OldMain {
    
}

class Payout {
    public int seniority;
    public int mounthsDisabled;
    public boolean isPartTime;

    public double disabilityAmount() {
        if (seniority < 2) {
            return 0;
        }

        if (mounthsDisabled > 12) {
            return 0;
        }

        if (isPartTime) {
            return 0;
        }
    }

    public double vacationAmount() {
        if (onVaction()) {
            if (lenghtOfService() > 10) {
                return 1;
            }
        }
        
        return 0.5;
    }
}