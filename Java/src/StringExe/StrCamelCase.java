package StringExe;

public class StrCamelCase {


    public String convertCameCase(String str1) {

        String words[] = str1.split(" ");
        String result ="";
        for (String letter:words){
            String everyWordStart = letter.substring(0,1);
            String afterWord = letter.substring(1);
            result+=everyWordStart.toUpperCase()+afterWord+"";
        }

        return result;
    }
}
