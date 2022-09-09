package StringExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepeatedWords {

    public List<String> PrintRepeatedWords(String str) {
        List<String> nonRepeatWordList = new ArrayList<>();
        String words[] = str.trim().split("\\s+");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;

                }
            }
            if (!(count > 2))
                nonRepeatWordList.add(words[i]);
        }
        return nonRepeatWordList;
    }
}
