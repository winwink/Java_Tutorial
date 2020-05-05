package winwink.DesignPattern.P1.Introduction;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void performQuack(){
        quackBehavior.quack();
    }

    void swim(){

    }

    void display(){

    }

    void performFly(){
        flyBehavior.fly();
    }
}
