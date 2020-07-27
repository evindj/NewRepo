
class Person {
    String firstName;
    String lastName;
    int grade;
    int age;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        grade = 10;
        age = 12;
    }

    public boolean isBrilliantKid() {
        // grade > 15
        // age < 20
        System.out.println("Age " + age + "  grade " + grade);
        if((grade > 15) && (age < 20)) {
            return true;
        }
        return false;
        
    }

    @Override
    public String toString() {
        return "I am a a person, my name is " + firstName + "  " + lastName + grade;
    }

    
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
        Person t = new Teacher("Dorine", "K.");

        System.out.println(person.toString());
        System.out.println(t.toString());

       Person steve = new Person("Steve", "Sounke");
         if(t.isBrilliantKid()) {
            System.out.println(t + " Is brilliant ");
         }
         else {
            System.out.println(t + " Is NOT brilliant ");
         }

         int num1 = 11;  
         int num2 = 22;  
         int result = 0;
    
         result = num1 & num2;  // 10 
         System.out.println("num1 & num2: "+result);
        
    }
    

    /*
    static int MAX_ODD = 21;
    public static void writeOdds() {
        // print each odd number
        for (int count = 1; count <= MAX_ODD; count++) {
            if(count % 2 == 1) {
                System.out.print(count + " ");
            }    
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        // write all odds up to 21
        System.out.println(" all odds numbers up to 21");
        writeOdds();
        // now, write all odds up to 11
        System.out.println(" all odds numbers up to 11");
        MAX_ODD = 11;
        writeOdds();
    }
    */
}