import com.pavel.textparser.entity.SentenceSplitter;
import com.pavel.textparser.entity.TextManager;
import com.pavel.textparser.entity.WordSplitter;

import java.io.IOException;


public class MainApplication {

    public static void main(String[] args) throws IOException{
//        TextManager textManager = new TextManager();
//        textManager.readFile("d://1.txt");
//        textManager.replaceSpaceEnter();
//        SentenceSplitter sentenceSplitter = new SentenceSplitter();
//        sentenceSplitter.splitText(textManager.textToWork);
        WordSplitter wordSplitter = new WordSplitter();
        wordSplitter.splitText("(!mo-ti-on),");
        System.out.println();
    }
}
