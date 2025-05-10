package PrintableItems;

public class PrintTest {
    public static void main(String[] args){
        Printable[] itemsToPrint = new Printable[3];
        itemsToPrint[0]= new Document("report.pdf");
        itemsToPrint[1]= new Photo();
        itemsToPrint[2]= new Barcode("123456789");

        for(Printable item : itemsToPrint){
            item.print();
        }

        PrintQueue printer = new PrintQueue(itemsToPrint);
        printer.printReverse();

    }
}
