
// 3633. Earliest Finish Time for Land and Water Rides I

public class bai3633 {

    //Solution
    class Solution {
        public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

            int minLandTime = Integer.MAX_VALUE;
            int minWaterTime = Integer.MAX_VALUE;

            for (int i = 0; i < landStartTime.length; ++i) {
                minLandTime = Math.min(minLandTime, (landStartTime[i] + landDuration[i]));
            }

            for (int i = 0; i < waterStartTime.length; ++i) {
                minWaterTime = Math.min(minWaterTime, (waterStartTime[i] + waterDuration[i]));
            }

            int res = Integer.MAX_VALUE;

            // Case 1: land -> water.
            for (int i = 0; i < waterStartTime.length; ++i) {
                int totalTime = Math.max(minLandTime, waterStartTime[i]) + waterDuration[i];
                res = Math.min(totalTime, res);
            }

            // Case 2: water -> land.
            for (int i = 0; i < landStartTime.length; ++i) {
                int totalTime = Math.max(minWaterTime, landStartTime[i]) + landDuration[i];
                res = Math.min(totalTime, res);
            }

            return res;
        }
    }
}
