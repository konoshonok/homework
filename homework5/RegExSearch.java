package homework5;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch  implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int count = 0;
        Pattern pattern =  Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);;
        Matcher matcher = pattern.matcher(text);
        ArrayList<String> arrayList = new ArrayList<>();

        while(matcher.find()) {
            arrayList.add(matcher.group());
        }

        for (String w : arrayList) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }

        return count;
    }
}