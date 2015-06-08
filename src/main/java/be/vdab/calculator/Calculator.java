package be.vdab.calculator;

/**
 * Created by jeansmits on 08/06/15.
 */
public class Calculator {
    public static int add(String s) {
        if (s.equals("")) {
            return 0;
        } else if (s.length()==1) {
            return Integer.parseInt(s);
        } else {
            String[] chars = getValues(s);
            return Integer.parseInt(chars[0])+Integer.parseInt(chars[1]);
        }
    }

    public static String[] getValues(String s) {
        String[] chars = s.split(",");
        return chars;

    }
}
