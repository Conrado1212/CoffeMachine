package main.stage6.array;

public class For {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = nums.length - 1; i >= 0; i--) {

            System.out.println(nums[i]);


        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.println(nums[i]);

        }
        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        System.out.println();
        for (int i = 0; i <= 3; i++) { System.out.println(nums[i]);
        ;}
        System.out.println();
        for (int i = 0; i <= 3; i++) { System.out.println(nums[0]); }
    }

}