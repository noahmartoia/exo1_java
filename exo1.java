public class Solution {
    public int[] twoSum(int[] nums, int cible) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == cible) {
                    return new int[] { i, j };
                }
            }
        }

        throw new IllegalArgumentException("pas possible :( deso pas deso");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {8, 4, 5758, 366, 1};
        int cible = 5759;
        int[] valeur = solution.twoSum(nums, cible);

        System.out.println(valeur[0] + " et " + valeur[1]);
    }
}