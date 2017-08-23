package cc.before30.java.round00;

/**
 * Created by before30 on 23/08/2017.
 */
public class LookAndSay {

    public static String lookAndSaySequence(int n) {
        String prevLine = "1";
        for (int i=0; i<n; i++) {

            char head = prevLine.charAt(0);
            int count = 1;
            StringBuffer line = new StringBuffer();

            for (int j=1; j<prevLine.length(); j++) {
                if (head == prevLine.charAt(j)) {
                    count++;
                } else {
                    line.append(head);
                    line.append(count);
                    head = prevLine.charAt(j);
                    count = 1;
                }

            }
            line.append(head);
            line.append(count);
            prevLine = line.toString();

        }

        return prevLine;
    }

    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            System.out.println(lookAndSaySequence(i));
        }
    }
}
