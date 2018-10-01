

public class Test {


    public static void main(String[] args) {

//        long startTime = System.nanoTime();
//
//        int[] a = rndArray();
//        System.out.println(Solution4.solution(a));
//
//        long endTime = System.nanoTime();
//        System.out.println("time needed: " + TimeUnit.SECONDS.toSeconds(endTime - startTime));

        int n = 5;

        int [][] matrix =  getMatrix(n);

        //System.out.format("Solution 2 for loops took   %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution2()));

        //System.out.format("Solution 2 for loops took   %,6d microseconds %n", Test::getAverageSolutionTime);
              //  getAverageSolutionTime(matrix, new Solution2()));

        System.out.format("Solution 2 for loops took   %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution2()::solution));
        System.out.format("Solution TreeSet via for    %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution3()::solution));
        System.out.format("Solution int[] + mergeSort  %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution4()::solution));
        System.out.format("Solution TreeSet via stream %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution5()::solution));
        System.out.format("Solution int [] + QuickSort %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution6()::solution));
        System.out.format("Solution from Elena         %,6d microseconds %n", getAverageSolutionTime(matrix, new Solution7()::solution));

    }



    private static int[] rndArray(){
        //int arr [] = new int[(int)((Math.random()*1100000)+1)];
        int arr [] = new int[1100000];

        for (int i = 0; i< arr.length; i++){
            arr[i]= (int)((Math.random()-0.5)*2000000);
            //System.out.println(arr[i]+ " ");
        }
        return arr;
    }

    private static int[][] getMatrix(int n){

        int [][]matrix = new int [n][];

        for(int i = 0; i < n; i++){
            matrix[i] = rndArray();
        }

        return matrix;
    }

    private static long getAverageSolutionTime (int [][]matrix, SolutionAbstract sol){

        long timeSum = 0;
        long tempTime;

        for(int i = 0; i < matrix.length; i++){


            tempTime= System.nanoTime();

            sol.solution(matrix[i]);

            timeSum += System.nanoTime()-tempTime;
        }


        return (timeSum/matrix.length)/1000;
    }



}


