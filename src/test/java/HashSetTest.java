import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Character> hashSet=new HashSet<Character>();
        hashSet.add('a');
        hashSet.add('b');
        hashSet.add('A');
        hashSet.add('b');
        hashSet.add('c');
        hashSet.add('B');
        char[] c=hashSet.toString().toCharArray();
        for (int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }



        //System.out.println(hashSet.toString());


    }
}
