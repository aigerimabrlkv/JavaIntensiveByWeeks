package textFormatting;

public class UppercaseFormatter implements Formatter{
    @Override
    public String format(String input){
        return input.toUpperCase();
    }
}
