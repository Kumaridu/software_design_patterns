package proxyExercise;

public class bThing implements Thing {

    private String name;

    public bThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String argString) {
        System.out.println(argString + ": " + name);
    }
}
