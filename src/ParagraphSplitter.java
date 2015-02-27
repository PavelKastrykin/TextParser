import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphSplitter {
    List<String> paragraphSplitted = new ArrayList<String>();

    public List<String> getParagraphSplitted(){
        return this.paragraphSplitted;
    }

    public void splitText(String string){
        while (string.length() > 0){
            String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.SENTENCE_END_PATTERN) + 2);
            paragraphSplitted.add(textPart);
            string = string.replaceFirst(Pattern.quote(textPart), "");
        }
    }
}
