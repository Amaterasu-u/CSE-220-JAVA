import java.util.HashMap;
import java.util.Map;

public class Array_p6 {
     public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 2, 1 ,2};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int mostFrequent = arr[0];
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Element with highest frequency: " + mostFrequent +
                           " (occurs " + maxFrequency + " times)");


                           for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                          System.out.println(entry.getKey() + " ->" + entry.getValue());
                            }
                        }
    }


    

