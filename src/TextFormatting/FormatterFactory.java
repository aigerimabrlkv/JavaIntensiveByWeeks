package TextFormatting;

public class FormatterFactory {
    public static Formatter getFormatter(String name){
        if(name.equals("UppercaseFormatter")){
            return new UppercaseFormatter();
        }else if(name.equals("LowercaseFormatter")){
            return new LowercaseFormatter();
        }else if(name.equals("DashFormatter")){
            return new DashFormatter();
        }else if(name.equals("ReverseFormatter")){
            return new ReverseFormatter();
        }else if(name.equals("CamelCaseFormatter")){
            return new CamelCaseFormatter();
        } else{
            return null;
        }
    }
}
