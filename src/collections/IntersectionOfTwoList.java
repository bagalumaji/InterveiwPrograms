package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoList {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2,3,4,10,11,12);
        List<Integer> l2 = Arrays.asList(2,3,4,13,14,15);
        System.out.println("getIntersectionOfTwoList(l1,l2) = " + getIntersectionOfTwoList(l1, l2));
    }
    public static List<Integer> getIntersectionOfTwoList(List<Integer> l1,List<Integer>l2){
       List<Integer> intersection = new ArrayList<>();
        for (Integer i : l1) {
            if(!l2.contains(i)){
                intersection.add(i);
            }
        }
        for (Integer i : l2) {
            if(!l1.contains(i)){
                intersection.add(i);
            }
        }
        return intersection;
    }
}
