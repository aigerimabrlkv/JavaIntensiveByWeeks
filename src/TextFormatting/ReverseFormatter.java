package TextFormatting;

public class ReverseFormatter implements Formatter{
    @Override
    public String format(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
