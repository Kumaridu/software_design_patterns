package IterationInClassExercise;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = List.of(1,2,3,4,5,6,7,8,9,10);
        MyVector<Integer> myVector = new MyVector<>();
        myVector.addAll(array);
//
//        //internal complete (sum)
//        SumFunctor sumFunctor = new SumFunctor();
//        myVector.doAll(sumFunctor);
//        System.out.println(sumFunctor.getValue());
//
//        //internal complete (avg)
//        AvgFunctor avgFunctor = new AvgFunctor();
//        myVector.doAll(avgFunctor);
//        System.out.println(avgFunctor.getValue());
//
//        //external selective (sum)
//        Iterator<Integer> iterator1 = myVector.iterator(x -> x > 2);
//        int sum = 0;
//        while(iterator1.hasNext()) {
//            sum += iterator1.next();
//        }
//        System.out.println(sum);
//
//
//        //external selective (avg)
//        Iterator<Integer> iterator2 = myVector.iterator(x -> x > 2);
//        sum = 0;
//        int count = 0;
//        while (iterator2.hasNext()) {
//            sum += iterator2.next();
//            count++;
//        }
//        System.out.println(sum / count);


        // external selective + iterable
        MyVectorIterable<Integer> vectorIterable = new MyVectorIterable<>(myVector, x -> x > 2);
        for(Integer x : vectorIterable) {
            System.out.println(x);
        }
    }
}
