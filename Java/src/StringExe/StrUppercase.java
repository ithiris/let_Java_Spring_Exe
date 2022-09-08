package StringExe;

public class StrUppercase {


    public String firstAndLastLetterUpperCase(String str){

        String firstChar = str.substring(0,1).toUpperCase();
        String middleChar = str.substring(1,str.length()-1);
        String lastChar = str.substring(str.length() - 1).toUpperCase();

        return firstChar+middleChar+lastChar;

    }
}
