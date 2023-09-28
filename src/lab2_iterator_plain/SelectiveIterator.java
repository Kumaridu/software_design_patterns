package lab2_iterator_plain;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SelectiveIterator implements Iterator<Swimmer> {
    List<Swimmer> list;
    Predicate<Integer> predicate;
    int currentIndex;

    public SelectiveIterator(List<Swimmer> list, Predicate<Integer> predicate) {
        this.list = list;
        this.predicate = predicate;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        for (int i = currentIndex; i < list.size(); i++) {
            Swimmer swimmer = list.get(currentIndex);
            if (!predicate.test(swimmer.getAge()))
                currentIndex = i + 1;
            else {
                break;
            }
        }
        return currentIndex < list.size() ? true : false;
    }

    @Override
    public Swimmer next() {
        Swimmer swimmer = list.get(currentIndex);
        currentIndex++;
        return swimmer;
    }
}
