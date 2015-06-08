package be.vdab.calculator;

/**
 * Created by jeansmits on 08/06/15.
 */
public class Calculator {
    public static int add(String s) {

        s = replaceWhitespace(s);

        if (s.equals("")) {
            return 0;
        } else if (s.length()==1) {
            return Integer.parseInt(s);
        } else {
            String[] chars = getValues(s);
            int result = 0;
            for (int i=0 ; i<chars.length ; i++) {
                result += Integer.parseInt(chars[i]);
            }
            return result;

        }
    }

    public static String[] getValues(String s) {
        String[] chars = s.split(",");
        return chars;

    }

    public static String replaceWhitespace(String s) {
        return s.replaceAll("\\s", ",");
    }
}
