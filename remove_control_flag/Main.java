package remove_control_flag;

public class Main {

    void checkSecurity(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (foundSuspectedPeople(people[i])) {
                sendAlert();
                break;
            }
        }
    }

    private boolean foundSuspectedPeople(String people) {
        return (people.equals("Don") || people.equals("John"));
    }
}
