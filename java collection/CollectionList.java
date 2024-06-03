package latihan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionList {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();

        // menambah data collection
        names.add("Besty");
        names.add("Cintara");
        names.addAll(Arrays.asList("Vian", "Sinaga"));
        
        // menghapus data collection
        names.remove("Sinaga");

        //mengecek data collection
        System.out.println(names.contains("Besty"));
        
        for(var name: names) {
            System.out.println(name);
        }
    }
}