package separate_query_from_modifier;

public class Main {
    
}

class Guard {

    public void checkSecurity(String[] people) {
        doSendAlert(people);
        String found = findCriminal(people);
        someLaterCode(found);
    }

    public void doSendAlert(String[] people) {
        if (!findCriminal(people).isEmpty()) {
            sendAlert();
        }
    }

    public String findCriminal(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return  "Don";
            }

            if (people[i].equals("John")) {
                return "John";
            }
        }

        return "";
    }
}