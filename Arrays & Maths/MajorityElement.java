public class MajorityElement {
    int majorityElement(int[] nums) {
        int ele = nums[0];
        int freq = 1;

        for (int i = 1; i < nums.length; i++) {
            if (freq == 0) {
                ele = nums[i];
                freq = 1;
            } else if (ele != nums[i]) {
                freq--;
            } else {
                freq++;
            }
        }
        return ele;
    }

    public static void main(String[] args) {

    }
}
