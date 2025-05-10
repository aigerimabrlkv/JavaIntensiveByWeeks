package TextFormatting;

import java.text.Normalizer;

public class TextProcessor {
    public static String process(String input, Formatter[] formatters){
        String result = input;
        for (Formatter formatter : formatters) {
                result = formatter.format(result);

        }
        return result;
    }

    public static void main(String[] args){
        String text = "this is a test string";
        Formatter[] formatters = {
                FormatterFactory.getFormatter("UppercaseFormatter"),
                FormatterFactory.getFormatter("DashFormatter")
        };
        String formattedText = process(text, formatters);
        System.out.println(formattedText);

        Formatter[] anotherChain = {
                FormatterFactory.getFormatter("LowercaseFormatter"),
                FormatterFactory.getFormatter("ReverseFormatter")
        };
        String anotherFormattedText = process(text, anotherChain);
        System.out.println(anotherFormattedText);
    }
}
