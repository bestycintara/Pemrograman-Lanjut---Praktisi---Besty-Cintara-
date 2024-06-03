package latihan;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueList {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Besty");
        stack.offerLast("Cintara");

        for(var item = stack.pollLast(); item != null; item = stack.pollLast()){
            System.out.println(item);
        }
    }
    
}