package at.campus02.zam21.pr1;

public class Variables {
    public static void main(String[] args) {
        double z = 100.1;
        myMethod(z);
        // is z changed due to the modification of the parameter x?
        System.out.println(z);
        // local variable from method do no longer exist
        //y;
        //i;
        //x;


        int[] arr = {1, 2, 3};

        // what will happen after calling changeArray?
        changeArray(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // it did not change??? hmm

        // does it change??
        changeArray2(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        // it changed - strange - why?
    }
    public static void changeArray(int [] a ){

        int []b = {2, 3, 4};

        a = b;

    }
    public static void changeArray2(int [] a ){
        a[1] = 7;
    }
    public static void myMethod(double x){
        int y = 10;
        x = 200.1;
        for(int i = 0; i < 10; ++i){
            System.out.println(i);
        }
        // Variable i does not exist outside of for loop (block)
        //System.out.println(i);
        y = 12 + (int)x;
    }
}
