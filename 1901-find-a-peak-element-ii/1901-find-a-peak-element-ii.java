class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0, h = m - 1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            int maxR = 0;
            for (int i = 1; i < n; i++) {
                if (mat[i][mid] > mat[maxR][mid]) {
                    maxR = i;
                }
            }

            int left = (mid - 1 >= 0) ? mat[maxR][mid - 1] : -1;
            int right = (mid + 1 < m) ? mat[maxR][mid + 1] : -1;

            if (mat[maxR][mid] > left && mat[maxR][mid] > right) {
                return new int[]{maxR, mid};
            }

            if (right > mat[maxR][mid]) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
