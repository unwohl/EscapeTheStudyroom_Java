package Parser;
import java.util.Scanner; 

 public class GameParser {
    public GameParser(String arg1){
    Scanner insertParser = new Scanner(arg1);
    String insertString = insertParser.nextLine();
    insertParser.close();
    System.out.println(insertString);
    }
}