package Hackerrank.OneWeekPrepNWarmUp;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alice = 0, bob = 0, size = Math.min(a.size(), b.size());

        for (int i = 0; i < size; i++){
            if (a.get(i) > b.get(i)){
                alice++;
            }
            else if (a.get(i) < b.get(i)){
                bob++;
            }
            else if (a.get(i).equals(b.get(i))){
                System.out.println("No points received.");
            }
        }
        result.add(alice);
        result.add(bob);
        return result;
    }
}
