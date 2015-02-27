import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSplitter {
    private List<String> textSplitted = new ArrayList<String>();

    public List<String> getTextSplitted(){
        return this.textSplitted;
    }
    public void splitText(String string){
        boolean isText = true;
        while (string.length() > 0){
            if (isText){
                String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.CODE_START_PATTERN) + 1);
                textSplitted.add(textPart);
                string = string.replaceFirst(Pattern.quote(textPart), "");
                isText = !isText;
                continue;
            }
            if (!isText){
                String textPart = string.substring(0, RegExp.matcherPatternIndex(string, RegExp.CODE_END_PATTERN) + 4);
                textSplitted.add(textPart);
                string = string.replaceFirst(Pattern.quote(textPart), "");
                isText = !isText;
            }
        }
    }
}
