package striverssdesheet.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NextPermutation {


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<int[]> permutations = new ArrayList<>();
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.generatePermutations(nums, permutations, 0);
        for (int[] num: permutations) {
            System.out.println(Arrays.toString(num));
        }

    }

    public void generatePermutations(int[] nums, List<int[]> permutations,  int index){
        // 1,2,3,4
        if(index == nums.length-1){
            permutations.add(Arrays.copyOf(nums, nums.length));
        }
        for(int i=index; i<nums.length; i++){
            swap(nums, index, i);
            generatePermutations(nums, permutations, index+1);
            swap(nums, index, i);

        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }




}
