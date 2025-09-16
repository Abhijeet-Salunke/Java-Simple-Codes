class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minShipCapacity = Integer.MIN_VALUE;
        int maxShipCapacity = 0;
        for(int i : weights){
            minShipCapacity = Math.max(minShipCapacity, i);
            maxShipCapacity = maxShipCapacity + i;
        }

        while(minShipCapacity < maxShipCapacity){
            int mid = minShipCapacity + (maxShipCapacity - minShipCapacity) / 2;
            
            int requiredDays = 1;
            int currentLoad = 0;

            for (int weight : weights) {
                if (currentLoad + weight > mid) {
                    requiredDays++;
                    currentLoad = 0;
                }
                currentLoad += weight;
            }

            if(requiredDays > days){
                minShipCapacity = mid + 1;
            }
            else{
                maxShipCapacity = mid;
            }
        }
        return minShipCapacity;
    }
}