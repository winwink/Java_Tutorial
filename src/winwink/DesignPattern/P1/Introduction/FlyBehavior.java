package winwink.DesignPattern.P1.Introduction;

public interface FlyBehavior {
    void fly();
}

class FlyWithWings implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}