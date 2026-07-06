package rename_method;

public class Main {
    public static void main(String[] args) {

        Person phone = new Person();

        phone = employee.getOfficeTelephoneNumber();
    }
}

class Person {

    public String getOfficeTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
}