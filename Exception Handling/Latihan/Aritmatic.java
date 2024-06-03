package Latihan;

public class Aritmatic {
    public static void main(String[] args) {
        int a = 12; 
        int b = 0; 
        try{ 
            System.out.println(a/b); 
        } catch(ArithmaticException e){ 
            System.out.println("\nTerjadi kesalahan : " + e);
        } finally {
            System.out.println("\nini adalah Final dari try-catch Artihmatic Exception");
        }
    }
}