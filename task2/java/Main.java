public class Main {
    public static void main(String[] args) {
        Weight a = new Weight(10,12,15,432);
        Weight b = new Weight(5,7,8,76);
        System.out.println(a.volume());
        System.out.println(b.volume());
        System.out.println(a.ro());
        System.out.println(a.create(b).toString());
    }

}