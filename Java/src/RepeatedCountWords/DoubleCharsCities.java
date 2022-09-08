package RepeatedCountWords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DoubleCharsCities {

    public List<String> getDoubleCharsCities() {
        List<String> cityList = new ArrayList<>();
        String[] cities = {"london", "chicago", "delhi", "bangalore"};

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i];
            Map<Character, Integer> map = new HashMap<>();
            int count =0;
            for (int k = 0; k < city.length(); k++) {
            Character letter = city.charAt(k);
            if (!map.containsKey(letter)){
                map.put(letter, count);
            }
            else {
                map.put(letter, count++);
            }
            }
            if (count >= 1) {
                cityList.add(city);
            }
        }
        return cityList;
    }
}
