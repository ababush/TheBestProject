import java.util.Set;
import java.util.TreeSet;


//TreeSet via for

public class Solution3 implements SolutionAbstract {

    //jhsjkbgvdfnb

    public int solution(int[] a) {

        Set<Integer> set =new TreeSet<Integer>();

        for(int element: a){
            set.add(element);
        }




        int min =1;

        for(Integer element: set){
            if (element == min)
                min++;
        }

     return min;
    }
}
