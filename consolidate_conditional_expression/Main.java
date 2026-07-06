package consolidate_conditional_expression;

public class Main {

}

class Payout {
    public int seniority;
    public int mounthsDisabled;
    public boolean isPartTime;

    public double disabilityAmount() {
        if (isNotEligibleForDisabiltyAmount()) {
            return 0;
        }
    }

    private boolean isNotEligibleForDisabiltyAmount() {
        if (seniority < 2 || mounthsDisabled > 12 || isPartTime) {
            return true;
        } else {
            return false;
        }
    }

    public double vacationAmount() {
        return (onVaction() && lenghtOfService() > 10) ?  1 :  0.5;
    }
}