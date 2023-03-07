public class Duck {
    IDisplayBehaviour displayBehaviour;
    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck (IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.displayBehaviour = displayBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

    public void display() {
        this.displayBehaviour.display();
    }

    public void quack() {
        this.quackBehaviour.quack();
    }
}