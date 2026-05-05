

class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int hours = calculateHours(piles, mid);

            if (hours <= h) {
                ans = mid;       // valid answer
                high = mid - 1; // try smaller k
            } else {
                low = mid + 1;  // need bigger k
            }
        }

        return ans;
    }

    public int calculateHours(int[] piles, int k) {
        int res = 0;

        for (int pile : piles) {
            res += (pile + k - 1) / k; // ceil division
        }

        return res;
    }
}