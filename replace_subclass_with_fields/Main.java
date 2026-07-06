package replace_subclass_with_fields;

public class Main {
    public static void main(String[] args) {
        Person kent = Person.createMale();

        System.out.println("Person's gender is: " + kent.getCode());
    }
}

class Person {
    private final boolean isMale;
    private final char code;

    protected Person(boolean isMale, char code) {
        this.code = code;
        this.isMale = isMale;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }

    public boolean isMale() {
        return this.isMale;
    };

    public char getCode() {
        return this.code;
    };
}
