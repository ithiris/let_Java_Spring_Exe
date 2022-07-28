package CleanCodeProblems.Chapter1.Probllem1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Integer> result = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt( i );
            if (result.containsKey( ch )) {
                result.put( ch, result.get( ch ) + 1 );
            } else {
                result.put( ch, 1 );
            }
        }
        return result;
    }
    public static Map<Character, Integer> countDuplicateCharactersV1(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<Character, Integer> result = new HashMap<>();

        // or use for(char ch: str.toCharArray()) { ... }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }

    public static Map<String, Long> countDuplicateCharactersV2(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }

        Map<String, Long> result = str.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect( Collectors.groupingBy( c -> c, Collectors.counting()));

        return result;
    }
}
