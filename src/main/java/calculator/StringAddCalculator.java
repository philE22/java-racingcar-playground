package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String input) {
        int result = 0;
        if (input == null || input.isEmpty()) {
            return result;
        }
        String[] split = splitWords(input);

        for (String word : split) {
            checkMinusNumber(word);
            result += Integer.parseInt(word);
        }
        return result;
    }

    private static String[] splitWords(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        String[] split = input.split(",|:");

        if (m.find()) {
            String delimiter = m.group(1);
            split = m.group(2).split(delimiter);
        }
        return split;
    }

    private static void checkMinusNumber(String word) {
        if (word.startsWith("-")) {
            throw new RuntimeException();
        }
    }
}
