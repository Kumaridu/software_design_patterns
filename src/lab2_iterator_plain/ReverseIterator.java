package lab2_iterator_plain;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ReverseIterator<T> implements Iterator<T> {
    List<T> list;
    int currentIndex;

    public ReverseIterator(List<T> list) {
        this.list = list;
        currentIndex = list.size();
    }

    @Override
    public boolean hasNext() {
        currentIndex--;
        return currentIndex >= 0;
    }

    @Override
    public T next() {
        return list.get(currentIndex);
    }
}
