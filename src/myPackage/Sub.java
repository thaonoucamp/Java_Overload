package myPackage;

public class Sub extends Super{
    @Override
    public int sum(int a, int b) {
        System.out.println(super.sum(a, b));
        return this.sum(a, b);
    }

    @Override
    public long sum(int a, long b) {
        return a * b;
    }

    @Override
    public float sum(float a) {
        return a + 20;
    }

    public static void main(String[] args) {
        Sub sub = new Sub();

        System.out.println("1. " + sub.sum(5, 10l));
        System.out.println("2. " + sub.sum(10f));

        Super sup = new Super();
        System.out.println("3. " + sup.sum(5, 10));

    }
    // 0. @Overide(key) Nhan dang Ham goi lai cua cha;
    // 1. Viet lai Ham cua lop cha;
    // 2. Dung kieu du lieu tra ve;
    // 3. Dung so luong tham so;
    // 4. Doi so truyen vao kem kieu du lieu de nhan dang Ham duoc goi;
    // 5. Super de tra ve (value) cua Ham cha;

}
