import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


//TreeSet via stream

public class Solution5 implements SolutionAbstract {



    public int solution(int[] a) {


       Set<Integer> set = new TreeSet<Integer>(Arrays.stream(a).boxed().collect(Collectors.toList()));

        int min =1;

        for(Integer element: set){
            if (element == min)
                min++;
        }

        return min;
    }
}
