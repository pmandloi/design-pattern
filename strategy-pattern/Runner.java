
public class Runner {

    public static void main(String[] args) {
        Duck duck = new Duck(new DisplayBehaviour(), new NoFlyBehaviour(), new QuackBehaviour() );
        duck.fly();
        duck.quack();
        duck.display();
    }
}