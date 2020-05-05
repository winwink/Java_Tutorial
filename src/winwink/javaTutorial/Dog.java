package winwink.javaTutorial;

public class Dog {
    String breed;
    int age;
    String color;
    String name;

    public Dog(String name) {
        this.name = name;
    }

    void barking() {
        System.out.println("dog " + name + " barking");
    }

    void hungry() {
        System.out.println("dog hungry");
    }

    void sleeping() {
        System.out.println("dog sleeping");
    }

}
