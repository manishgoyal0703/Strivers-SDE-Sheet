package striverssdesheet.Common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4};
        Arrays.sort(nums);
        List<int[]> permutations = new ArrayList<>();
        generatePermutations(nums, permutations, 0);
        for (int[] num: permutations) {
            System.out.println(Arrays.toString(num));
        }
    }

    public static void generatePermutations(int[] nums,  List<int[]> permutations, int index){
        if(index == nums.length-1){
            permutations.add(Arrays.copyOf(nums,nums.length));
        } else {
            for(int i = index; i< nums.length; i++){
                swap(nums, index, i);
                generatePermutations(nums, permutations, index+1);
                swap(nums, index, i);
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
