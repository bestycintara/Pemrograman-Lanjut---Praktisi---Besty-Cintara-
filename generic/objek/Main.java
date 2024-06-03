import java.util.*;

public class Main {
    public static void main(String[] args) {

        generic <String> data = new generic<> ("Besty");

        // get data dr constructor
        System.out.println("Data yang dimasukkan pada constructor : " + data.getData());

        //memasukkan data 
        data.setData("Cintara");
        System.out.println("Data setelah di input method : " + data.getData());
    }
}