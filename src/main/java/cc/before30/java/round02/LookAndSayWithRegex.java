package cc.before30.java.round02;

import java.util.function.Function;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by before30 on 24/08/2017.
 */
public class LookAndSayWithRegex {


    public static String ant(int n) {
        String s = "1";
        for (int i=0; i<n; i++) {
            s = next(s);
        }

        return s;
    }


    private static String next(String s) {
        return replace(s, "(.)\\1*", m -> m.group(1) + m.group().length());
    }

    private static String replace(String s, String regex, Function<MatchResult, String> fn) {
        Matcher m = Pattern.compile(regex).matcher(s);

        StringBuffer line = new StringBuffer();
        while(m.find()) {
            line.append(fn.apply(m));
        }
        return line.toString();
    }
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("cat");
//        Matcher m = p.matcher("one cat two cats in the yard");
//        StringBuffer sb = new StringBuffer();
//        while (m.find()) {
//
//            m.appendReplacement(sb, "dog");
//        }
//        m.appendTail(sb);
//        System.out.println(sb.toString());

        for (int i=0; i<10; i++) {
            System.out.println(ant(i));
        }
    }
}
