package IterationInClassExercise;


public class SumFunctor implements Functor<Integer>{
    int sum = 0;

    @Override
    public void compute(Integer element) {
        sum += element;
    }

    @Override
    public Integer getValue() {
        return sum;
    }
}
