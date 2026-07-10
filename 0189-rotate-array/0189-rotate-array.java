class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k %= n;

        int[] temp = new int[n];
        for(int i = 0; i<n; i++)
        {
            temp[(i+k)% n] = nums[i];
        }
        for(int i = 0; i<n; i++)
        {
            nums[i] = temp[i]; 
        }
    }
}

// class Solution {
//     public void rotate(int[] nums, int k) {

//         int n = nums.length;
//         k %= n;
                                                       //for left side rotated
//         int[] temp = new int[n];

//         // Fill temp array
//         for (int i = 0; i < n; i++) {
//             temp[i] = nums[(i - k + n) % n];
//         }

//         // Copy back
//         for (int i = 0; i < n; i++) {
//             nums[i] = temp[i];
//         }
//     }
// }