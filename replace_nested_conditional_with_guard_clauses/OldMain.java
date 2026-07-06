package replace_nested_conditional_with_guard_clauses;

public class OldMain {

}

public class Payout {

    double getPayAmount() {
        double result = 0;

        if (isDead) {
            result = deadAmount();
        } else {
            if (isSeparated()) {
                result = separatedAmount();
            } else {
                if (isRetired) {
                    result = retiredAmount();
                } else {
                    result = normalPayAmount();
                }
            }
        }

        return result;
    }
}