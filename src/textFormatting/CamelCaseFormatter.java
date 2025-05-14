package textFormatting;

public class CamelCaseFormatter implements Formatter{
    @Override
    public String format(String input){
        String[] words = input.toLowerCase().split("\\s+");
        StringBuilder camelCase = new StringBuilder(words[0]);
        for(int i=1; i<= words.length; i++){
            camelCase.append(words[i].substring(0,1).toUpperCase())
                    .append(words[i].substring(1));
        }
        return camelCase.toString();
    }
}
