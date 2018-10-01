

//int[] via double for

class Solution2 implements SolutionAbstract{

   Solution2(){

   }
    public int solution(int[] a) {

        if (a.length > 1100000)
            throw new ArrayIndexOutOfBoundsException("N is too big");

        for (int i = 0; i < a.length; i++) {
            if (a[i] < -1000000 || a[i] > 1000000) {
                throw new ArrayIndexOutOfBoundsException("an element of A is too big");
            }
        }

        int min = 1;
        int changes =0;

        for (int i = 0; i < a.length; i++) {

            changes = 0;

            for (int k = 0; k < a.length; k++) {
                if (a[k] == min) {
                    min++;
                    changes++;
                }
            }

            if (changes==0) {
                break;
            }
        }
        return min;
    }
}                          