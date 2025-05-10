package PrintableItems;


public class Document implements Printable{
    private String filename;
    public Document(String filename){
        this.filename = filename;
    }

    public String getFilename(){
        return filename;
    }

    @Override
    public void print(){
        System.out.println("Printing document" + filename);
    }
}
