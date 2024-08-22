package randomAlgs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Interval {
    int start;
    int end;
    Interval(int start, int end){
        this.start = start;
        this.end = end;

    }
}
public class MergeIntervalsProblem {

    public static List<Interval> merge(List<Interval> intervals) {

        intervals.sort(Comparator.comparingInt(i -> i.start));

        List<Interval> merged = new ArrayList<>();
        Interval current = intervals.get(0);

        for(int i = 1; i < intervals.size(); i++) {
            Interval next = intervals.get(i);

            if(current.end >= next.start){
                current.end = Math.max(current.end, next.end);
            }else {
                merged.add(current);
                current = next;
            }
        }
        merged.add(current);
        return merged;
    }
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(
                new Interval(1, 4),
                new Interval(2, 5),
                new Interval(7, 9)
        );

        List<Interval> result = merge(intervals);
        for (Interval interval : result) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
//Sorting - O(nLogn) + interval union O(n) - so the overal is O(nLogn)