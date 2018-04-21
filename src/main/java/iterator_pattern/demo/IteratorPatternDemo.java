package iterator_pattern.demo;

import iterator_pattern.entity_classes.NameRepository;
import iterator_pattern.interfaces.Interator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
      for (Interator interator = nameRepository.getIterator();interator.hasNext();){
            String name = (String) interator.next();
          System.out.println("Name:" + name);
      }

    }
}
