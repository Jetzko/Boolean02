public class Start {
    public static void main(String[] args) {
        boolean b1 = (55 != 55) && (false ^ true);
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';
        boolean b2 = (!a || !b) || (c == d);
        boolean b3 = false && true || false && !false;
        boolean b4 = (false && true) || (false || true);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

    }
}
