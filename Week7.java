
class Addition {
    public double add(int a, int b) { // int add(int, int)
        return a + b;
    } 

    public double add(int a, float b) { //add(10, 12, 10)
        return a + b + c;// double cannot go from double to int
    }

    public double add(float b, int c)

    public double add(int a, double b, float c) { // add(10, 12, 10)
        return a +b + c;
    }
}

interface Movable {
    int speed = 2; // static final int
    public void move();
} 

class Animal implements Movable {
    public void makeSound() {
        System.out.println ("I am an animal I make sound:");
    }
    public void move() {
        System.out.println("I am an animal, I just move");
    }
}

class Cat extends Animal {
    public void makeSound() {
        super.makeSound();
        System.out.println("I am an animal I make cat's sound");
    }
    public void move() {
        super.move();
        System.out.println(" I walk");
    }
}

class Bird extends Animal {
    public void makeSound() {
        super.makeSound();
        System.out.println(" I make Bird's sound");
    }

    public void move() {
        super.move();
        System.out.println(" I fly");
    }
}



public class Week7 {
    public static void main(String[] args) {
        System.out.println("In test class");
       /* Addition a = new Addition();
        double result = a.add(10, 12d, 10);
        System.out.println("Result is " + result);
        */
        Animal[]  animals = {new Bird(), new Cat()};
        /*ArrayList<Animal> animalsList =  new ArrayList<Animal>();
        animalsList.add(new Cat());
        animalsList.add(new Pig());*/

        for(int i = 0; i < 2; i++ ) {
            System.out.println("Iteration Number " + (i + 1));
            animals[i].makeSound();
            animals[i].move();
        }

    }
}
