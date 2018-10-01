import java.util.Arrays;


//int [] + QuickSort

public class Solution6 implements SolutionAbstract {

    public int solution(int[] a) {

        Arrays.sort(a);


        int min = 1;

        for (int element : a) {
            if (element == min)
                min++;
        }

        return min;
    }
}