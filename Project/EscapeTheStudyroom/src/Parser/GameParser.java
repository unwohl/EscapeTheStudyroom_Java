package Parser;
import java.util.Scanner; 

 public class GameParser {
     String scannerName = "";

    public GameParser(String arg1){
        scannerName = arg1;
    }

    public void parse(){
        Scanner insertParser = new Scanner(scannerName);
        String insertString = insertParser.nextLine();
        insertParser.close();
        System.out.println(insertString);
    }
}