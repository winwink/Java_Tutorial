package winwink.DesignPattern.P1.Introduction;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
    }

}
