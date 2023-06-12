public class Main {
    public static void main(String[] args) {
        MyClass b = new MyClass(12,32);
        MyClass m = new MyClass();
        m.setNum(2);
        m.setNumber(90);
        System.out.println(m.create(b));
    }
}