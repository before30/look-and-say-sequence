package cc.before30.java.round01;

/**
 * Created by before30 on 24/08/2017.
 */
public class LookAndSay {

    public static String ant(int n) {
        String s = "1";
        for (int i=0; i<n; i++) {
            s = next(s);
        }

        return s;
    }

    public static String next(String pLine) {

        char head = pLine.charAt(0);
        int count = 1;
        StringBuffer line = new StringBuffer();

        for (int i=1; i<pLine.length(); i++) {
            if (head == pLine.charAt(i)) {
                count++;
            } else {
                line.append(head).append(count);
                head = pLine.charAt(i);
                count = 1;
            }
        }

        line.append(head);
        line.append(count);

        return line.toString();
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(ant(i));
        }
    }
}
