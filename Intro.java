
class Person {
    String firstName;
    String lastName;
    Person(String one, String last) {
        firstName = one;
        lastName = last;
        grade = 10;
    }

    @Override
    public String toString() {
        return "I am a a person, my name is " + firstName + "  " + lastName + grade;
    }

    private int grade;
}

class Teacher extends Person {
    Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }
    String subject;

    @Override
    public String toString() {
        return "Teacher " +firstName + "  " + lastName;
    }
}

class Intro {
    static int someStatic = 12;
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        System.out.println(args[0] + " + " + args[1] + " + " + third  + " = " + (first + second + third));
        Person person = new Person("Innocent", "Djiofack");
        System.out.println(person);
       Person steve = new Person("Steve", "Sounke");
       Teacher t = new Teacher("Dorine", "K.");
       String perString = person.toString();
        System.out.println(perString);
         System.out.println(t);
        
    }
}