package LiskovBirds;

public class Animal {
    public void learnToFly(FlyingBird flyBird){
        flyBird.fly();
    }
}