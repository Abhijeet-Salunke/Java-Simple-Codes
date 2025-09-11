class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if (m * k > bloomDay.length) {
            return -1;
        }

        for (int i : bloomDay) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        for (int i = min; i <= max; i++) {
            if (boquetPossibleOrNot(bloomDay, i, m, k)) {
                return i; 
            }
        }
        return -1;
    }

    private static boolean boquetPossibleOrNot(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int totalBouquet = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                totalBouquet += count / k;
                count = 0;
            }
        }
        totalBouquet += count / k;

        return totalBouquet >= m;
    }
    
}