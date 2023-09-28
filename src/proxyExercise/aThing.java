package proxyExercise;

public class aThing implements Thing {
    private String name;

    public aThing(String name) {
        this.name = name;
    }

    @Override
    public void compute(String argString) {
        System.out.println(argString + ": " + name);
    }
}
