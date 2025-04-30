class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int index = -1;

        // find break point
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        if(index == -1){
            // reverse whole array
            int i = 0;
            int j = n - 1;

            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }

            return;
        }

        // swap break point element
        for(int i = n - 1; i > index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }

        // reverse the right part
        int i = index + 1;
        int j = n - 1;

        while(i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
        
    }
}