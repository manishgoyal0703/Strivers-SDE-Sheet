package striverssdesheet.day1.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;
        frequency(arr, n);
    }

    static void frequency(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            } else {
                map.put(val, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entrySet: map.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
    }
}
