package proxyExerciseHomework.no1;

public class Main {

    public static void main(String[] args) {
        Thing t = new Thing();
        t.compute("Hello");


        pThing p = new pThing(t);
        p.compute("Hello");

    }
}
