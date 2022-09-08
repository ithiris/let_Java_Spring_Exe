
package StringExe;

public class OccurrencesCount {
    public int repeatedStrCount(String inputStr, char searchStr) {

        int count = 0;
        for (int i = 0; i< inputStr.length(); i++) {
            if (inputStr.charAt(i) == searchStr) {
                count++;
            }
        }
        return count;
    }
}

