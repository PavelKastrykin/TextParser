import com.pavel.textparser.entity.DividedText;
import com.pavel.textparser.logics.TextManager;

import java.io.IOException;


public class MainApplication {

    public static void main(String[] args) throws IOException{

        TextManager textManager = new TextManager();
        String text = textManager.readFile("d:/1.txt");
        DividedText dividedText = new DividedText(text);
        System.out.println(dividedText.merge());

        System.out.println(dividedText.getArrayOfSubs().get(1).merge());
    }
}
