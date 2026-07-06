package replace_error_code_with_execption;

public class Main {
    public static void main(String[] args) {
        try {
            account.withdraw(amount);
            doTheUsualThing();
        } catch (BalanceException e) {
            handleOverdrawn();
        }
    }
}

class BalanceException extends Exception {
    BalanceException(String errorResponse) {
        super(errorResponse);
    }
}

class Account {
    private int balance;

    public int withdraw(int amount) throws BalanceException {
        if (amount > balance) {
            throw new BalanceException("Você não tem saldo suficiente para essa coleta");
        }

        balance -= amount;
        return 0;
    }
}
