package SafiExerices.Day2.exe3;

public class StringChallenge {

    public static String sc(String str) {

        String answer = "";
        String removeWhiteSpace = str.trim();
        String extractChar = removeWhiteSpace.substring( 0, 5 );
        String upperCaseLetter = extractChar.toUpperCase();
        answer += upperCaseLetter;
        return answer;
    }
}
