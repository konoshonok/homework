package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static usefulFeatures.ReadFileToString.readAllBytesJava7;

public class Main {
    public static void main(String[] args) {
        final String book = readAllBytesJava7("D://Projects//homework//homework//src//homework5//filesToUse//Война и мир_книга.txt").toLowerCase();
        final List<String> words = new ArrayList<>();
        Pattern pattern =  Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(book);

        while (matcher.find()) {
            words.add(matcher.group());
        }

        Set<String> unique = findUnique(words);
        Map<String, Integer> topTen = findTopTen(words);

        System.out.println(topTen);

        EasySearch easySearch = new EasySearch();
        RegExSearch regExSearch = new RegExSearch();

        System.out.println("Война " + easySearch.search(book, "война"));
        System.out.println("Война " + regExSearch.search(book, "война"));

        System.out.println("Союз " + easySearch.search(book, "союз"));
        System.out.println("Союз " + regExSearch.search(book, "союз"));

        System.out.println("и " + easySearch.search(book, "и"));
        System.out.println("и " + regExSearch.search(book, "и"));
    }


    public static Set<String> findUnique(List<String> words) {
        return new HashSet<>(words);
    }


    public static Map<String, Integer> findTopTen(List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.put(word, count);
            } else {
                map.put(word, 1);
            }
        }

        return map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .peek(System.out::println)
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}