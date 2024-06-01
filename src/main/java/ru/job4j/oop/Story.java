package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Wolf wolf = new Wolf();
        Hare hare = new Hare();
        Fox fox = new Fox();
        wolf.tryEat(ball);
        ball.tryRun(true);
        hare.tryEat(ball);
        ball.tryRun(true);
        fox.tryEat(ball);
        ball.tryRun(false);
    }
}
