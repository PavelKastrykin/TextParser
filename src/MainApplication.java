import java.io.IOException;


public class MainApplication {

    public static void main(String[] args) throws IOException{
        TextManager textManager = new TextManager();
        textManager.readFile("d://1.txt");
        textManager.replaceSpaceEnter();
        SentenceSplitter sentenceSplitter = new SentenceSplitter();
        sentenceSplitter.splitText(textManager.textToWork);
        System.out.println();
    }
}
