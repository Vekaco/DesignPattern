package iterator_pattern.entity_classes;

import iterator_pattern.interfaces.Container;
import iterator_pattern.interfaces.Interator;

public class NameRepository implements Container{
    public static final String[] names = new String[] {"Tom","Jerry","Steve","Julia"};

    public Interator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Interator{

        private int index;

        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        public Object next() {
            if(this.hasNext()) {
                return names[index++];
            }
            return null;
        }

    }
}

