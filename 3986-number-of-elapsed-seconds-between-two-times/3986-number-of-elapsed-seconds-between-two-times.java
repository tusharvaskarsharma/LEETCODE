class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int hourSec = (Integer.parseInt(endTime.substring(0, 2)) 
                     - Integer.parseInt(startTime.substring(0, 2))) * 3600;

        int minSec = (Integer.parseInt(endTime.substring(3, 5)) 
                    - Integer.parseInt(startTime.substring(3, 5))) * 60;

        int sec = Integer.parseInt(endTime.substring(6))
                - Integer.parseInt(startTime.substring(6));

        return hourSec + minSec + sec;
    }
}