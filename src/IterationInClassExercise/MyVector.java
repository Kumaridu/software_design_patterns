package IterationInClassExercise;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVector<T> extends Vector<T> {

    public <T> void doAll(Functor<T> functor) {
        Iterator iterator = this.iterator();

        while (iterator.hasNext()) {
            T element = (T) iterator.next();
            functor.compute(element);
        }
    }


    public Iterator<T> iterator(Predicate<T> predicate) {
        Vector<T> vector = new Vector<>();
        Iterator<T> defaultIterator = this.iterator();

        while(defaultIterator.hasNext()) {
            if(predicate.test(defaultIterator.next())) {
                vector.add(defaultIterator.next());
            }
        }
        return vector.iterator();
    }
}
