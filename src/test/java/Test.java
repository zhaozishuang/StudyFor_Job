import java.util.Arrays;
import java.util.Scanner;

public class Test {
    int count = 21;
    public void count() {
        System.out.println(count++);
        System.out.println(++count);
    }
    public static void main(String args[]) {
        new Test().count();
        new Test().count();
    }
}
