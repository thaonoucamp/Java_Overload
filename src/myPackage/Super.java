package myPackage;

public class Super {
     public int sum(int a, int b) {
         return a + b;
     }

     public long sum(int a, long b) {
         return a + b;
     }

     public float sum(float a) {
         return a + 10;
     }

    public static void main(String[] args) {
        Super sup = new Super();

        System.out.println("1: " + sup.sum(5, 5));
        System.out.println("2: " + sup.sum(5, 10l));
        System.out.println("3: " + sup.sum(15));

    }
    // Viet lai cac (Ham) co ten giong nhau nhung cac doi so truyen vao la khac nhau;
    // Ko quan tam kieu du lieu cua doi so;
    // Ko quan tam kieu du lieu tra ve;
}
