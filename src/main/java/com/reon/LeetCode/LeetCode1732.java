package com.reon.LeetCode;
// find the highest altitude
public class LeetCode1732 {
    
    public int largestAltitude(int[] gain){
        int altitude = 0;
        int max = 0;

        for (int i = 0;i < gain.length; i++) {
            altitude += gain[i];
            max = Math.max(altitude, max);
        }
        return max;
    }
}
