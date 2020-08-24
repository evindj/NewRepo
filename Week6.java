
class Owner {

   private int age;
   private String name;// data members, properties, member variables

   public Owner() { // No arguments constructor.
    // Initializes member variables to Good default values.
       this.age = 10;
       this.name = "John Doe";
   }
   
   public Owner(int age, String name) { // parameterized constructor because it takes arguments(parameters)
    // it will allow the user of the class to provide their own values when instantiating objects.   
    this.age = age;
    this.name = name;
   }

   @Override
    public String toString() {
        super.toString();
        return name;
    }

}

class Bicycle {
    private int gear; // prop,member
    private int speed;
    private Owner owner; // aggregation

    public Bicycle() { // No arg constructor
        super(); // calls the constructor of the parent class(Object)
        System.out.println("Bicycle");
    }

    public Bicycle(int gear, int speed) { // parameterized constructor 
        this.gear = gear;//tmpObj.gear = 1
        this.speed = speed;//tmpObj.speed = 1
        System.out.println("Just constructed a bicyle with gear "
         + gear + " speed " + speed + " the value on the object is " + this.speed);
         this.owner = new Owner();
    }

    public void applyBrake(int decrement) { // passed by value
        // is it acceptable for speed to be negative
        this.speed -= decrement;// this.speed = this.speed - decrement
    }

    public void speedUp(int increment) {
        this.speed += increment; // this.speed = this.speed + increment;
    }

    @Override
    public String toString() {
        return  " gear " 
        + this.gear + " speed " + this.speed + " My owner is " + owner.toString(); 
    }


}

class MountainBike extends Bicycle {
    private int startHeight;
    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.startHeight = startHeight;
    }
    @Override
    public String toString() {
        return "I am a mountain bike" + super.toString() + " startHeight " + startHeight;
    }
}

class Week6 {
    public static void main(String[] args) {
        int i = 20;
        Bicycle slow = new Bicycle(10,10);
        slow.applyBrake(2);
        // System.out.println( "Bicyle: " + slow);// slow.toString();
        MountainBike bike = new MountainBike(10, 10, 23);
        System.out.println(bike);
        Owner one = new Owner(10, "John Doe");
    }
}