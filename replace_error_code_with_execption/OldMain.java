package replace_error_code_with_execption;

public class OldMain {
    if (account.withdraw(amount) == -1) {
        handleOverdrawn();
    } else {
        doTheUsualThing();
    }
}

class Account {
    private int balance;

    public int withdraw(int amount) {
        if ( amount > balance ) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}
