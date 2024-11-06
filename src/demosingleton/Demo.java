package demosingleton;

public class Demo {
    public static void main(String[] args) {
        Giamdoc a= Giamdoc.getInstance(1, "KA");
        System.out.println(a);

        Giamdoc b = Giamdoc.getInstance(2, "VKA");
        System.out.println(b);
    }
}
