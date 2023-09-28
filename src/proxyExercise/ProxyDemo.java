package proxyExercise;

public class ProxyDemo {

    public static void main(String[] args) {

        // output
        // Hello: A
        // Hello: A
        // Hello: B
        // Hello: B

        //a
        Thing t = new aThing("A");

        //b
        t.compute("Hello");

        //c
        LogProxy logProxy = new LogProxy(t);

        //d
        t.compute("Hello");

        //e
        t = new bThing("B");

        t.compute("Hello");
        LogProxy logProxyB = new LogProxy(t);
        t.compute("Hello");


    }
}
