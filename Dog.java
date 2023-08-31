public class Dog {

    private String name;
    private int age;
    private String color;
    private String hairType;
    private double weight;

    public Dog(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }


    // Main method
    public static void main(String[] args) {
        Dog myDog1 = new Dog("Coco", 12, "brown", 20.6);
        myDog1.bark();
        myDog1.sleep();
        myDog1.eat();

        System.out.println("Name: " + myDog1.getName());
        System.out.println("Age: " + myDog1.getAge());
        System.out.println("Color: " + myDog1.getColor());
        System.out.println("Weight: " + myDog1.getWeight() + " lbs.");

    }
}