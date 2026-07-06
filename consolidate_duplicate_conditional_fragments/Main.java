package consolidate_duplicate_conditional_fragments;

public class Main {

    double sendEmailPromotion() {
        validateEmailAddress();

        if (isSpecialDeal()) {
            total = price * 0.95;

        } else {
            total = price * 0.98;
        }
        sendEmail();
    }
}
