package replace_nested_conditional_with_guard_clauses;

public class Main {

}

public class Payout {
    double getPayAmount() {

        if (isDead) {
            return deadAmount();
        }

        if (isSeparated()) {
            return separatedAmount();
        }

        if (isRetired) {
            return retiredAmount();
        }

        return normalPayAmount();
    }
}