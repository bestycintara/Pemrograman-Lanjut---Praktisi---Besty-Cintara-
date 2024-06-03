package latihan;

import java.util.List;
import java.util.Iterator;

public class IterableList {
    public static void main(String[] args) {
        Iterable <String> names = List.of("Besty");

        for(var name: names){
            System.out.println(name);
        }
        
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }  
    }
}
