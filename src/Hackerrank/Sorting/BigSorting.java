package Hackerrank.Sorting;

import java.util.List;
public class BigSorting {
    public static List<String> bigSorting(List<String> unsorted) {
        unsorted.sort((a, b) -> {
            if (a.length() == b.length()){
                return a.compareTo(b);
            }
            return Integer.compare(a.length(), b.length());
        });
        return unsorted;
    }
}
