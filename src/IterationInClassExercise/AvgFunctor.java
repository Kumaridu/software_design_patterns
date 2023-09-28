package IterationInClassExercise;


public class AvgFunctor implements Functor<Integer> {
    int sum, count = 0;

    @Override
    public void compute(Integer element) {
        sum += element;
        count++;
    }

    @Override
    public Integer getValue() {
        return sum / count;
    }
}
