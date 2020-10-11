package homework5;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int start = 0;
        int count = 0;
        word = word.toLowerCase();

        while (text.indexOf(word, start) != -1) {
            int index = text.indexOf(word, start);
            start = index + word.length();
            if (index != 0 && index + word.length() != text.length()) {
                int charBefore = text.charAt(index - 1);
                char charAfter = text.charAt(index + word.length());
                if (!Character.isLetter(charBefore) && !Character.isLetter(charAfter)) {
                    count++;
                }
            } else if (index == 0) {
                char charAfter = text.charAt(index + word.length());
                if (!Character.isLetter(charAfter)) {
                    count++;
                }
            } else if (index + word.length() == text.length()){
                int charBefore = text.charAt(index - 1);
                if (!Character.isLetter(charBefore)) {
                    count++;
                }
            }
        }
        return count;
    }
}