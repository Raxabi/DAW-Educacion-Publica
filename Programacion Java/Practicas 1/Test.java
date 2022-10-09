public class Test {
    public static void main(String[] args) {
        int u = 80;
        int v = 90;

        System.out.println("u " + u +  "v " + v);

        u ^= v;
        v ^= u;
        u ^= v;

        System.out.println("u " + u + " v " + v);
    }
}
