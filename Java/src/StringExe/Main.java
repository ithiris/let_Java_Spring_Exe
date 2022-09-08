package StringExe;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String str = "helloworld";
        String str1 = "how are you";
        String repeatStr = "I am Safi . I am from chennai";
        String occurrenceStr = "hello";
        char countedStr = 'l';

        StrUppercase strUppercase = new StrUppercase();
        String result = strUppercase.firstAndLastLetterUpperCase(str);
        System.out.println(result);

        StrCamelCase strCamelCase = new StrCamelCase();
        String camelCaseResult = strCamelCase.convertCameCase(str1);
        System.out.println(camelCaseResult);

        OccurrencesCount occurrencesCount = new OccurrencesCount();
        int count = occurrencesCount.repeatedStrCount(occurrenceStr, countedStr);
        System.out.println(count);


    }
}
