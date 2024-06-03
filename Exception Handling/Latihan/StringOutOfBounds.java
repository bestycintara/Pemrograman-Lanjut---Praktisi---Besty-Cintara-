package Latihan;

public class StringOutofBounds {
    public static void main(String[] args) {
        try { 
            String nama = "besty";
            char huruf = nama.charAt(25);
            System.out.println(huruf); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("\nTerjadi keslahan : " + e);
        } finally {
            System.out.println("\nini adalah Final dari String Index Out Of Bounds Exception");
        }
    }
}