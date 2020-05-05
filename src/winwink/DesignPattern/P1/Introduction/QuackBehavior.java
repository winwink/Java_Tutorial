package winwink.DesignPattern.P1.Introduction;

public interface QuackBehavior {
    void quack();
}

class Quack implements  QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack");
    }
}