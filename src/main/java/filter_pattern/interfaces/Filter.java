package filter_pattern.interfaces;

import java.util.ArrayList;

public interface Filter<E> {
    ArrayList<E> meetCondition(ArrayList<E> source);
}
