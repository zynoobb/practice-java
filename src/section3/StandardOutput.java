package section3;

public class StandardOutput {
    public void println(boolean b) {
        System.out.println(b);
    }

    public void println(int i) {
        System.out.println(i);
    }

    public void println(double d) {
        System.out.println(d);
    }

    public void println(String s) {
        System.out.println(s);
    }

    // java StandardOutput
    public static void main(String[] args) {
        StandardOutput output = new StandardOutput();
        output.println(true);
        output.println(100);
        output.println("Hello");
        output.println(10.5);
    }
}
