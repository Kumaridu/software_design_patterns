package IterationInClassExercise;


import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

public class MyVectorIterable<T> implements Iterable<T> {

    private Vector<T> vector;
    private Predicate<T> predicate;

    public MyVectorIterable(Vector<T> vector, Predicate<T> predicate) {
        this.vector = vector;
        this.predicate = predicate;
    }


    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }


    class MyIterator implements Iterator<T> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            for(int i = currentIndex; i < vector.size(); i++) {
                if(predicate.test(vector.get(i))) {
                    currentIndex = i;
                    return true;
                }
            }

            return false;
//            return !(++currentIndex > vector.size());
        }

        @Override
        public T next() {
            return vector.get(currentIndex++);
        }
    }
}
