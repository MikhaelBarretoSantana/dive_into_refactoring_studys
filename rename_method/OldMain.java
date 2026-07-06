package rename_method;

public class OldMain {
        public static void main(String[] args) {

        Person phone = new Person();

        phone = employee.getTelephoneNumber();
    }
}

class Person {

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }
}