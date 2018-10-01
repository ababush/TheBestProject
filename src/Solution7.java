import java.util.Arrays;

public class Solution7  implements SolutionAbstract{

    public  int solution(int[] a) {

        Arrays.sort(a);

        if (a.length == 1) {
            if (a[0] != 1) {
                return 1;
            } else {
                return 2;
            }
        }

        a = Arrays.stream(a)
                .filter(n -> n > 0).toArray();


        for (int i = 1; i < a.length; i++) {

            if(a[0] != 1){
                return 1;
            } else if (a[i] - a[i - 1] > 1 || (a[i] == a[a.length - 1] && a[i] >= 1)) {
                return a[i - 1]+1;
            }
        }
        return 1;
    }
}
