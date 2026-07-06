package consolidate_duplicate_conditional_fragments;

public class OldMain {
    
    double sendEmailPromotion() {
        if (isSpecialDeal()) {
            total = price * 0.95;
            validateEmailAddress();
            sendEmail();
        } else {
            validateEmailAddress();
            total = price * 0.98;
            sendEmail();
        }
    }
}
