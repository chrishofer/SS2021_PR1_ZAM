package at.campus02.zam21.pr1;

public class ArrayDemo {
    public static void main(String[] args) {
        int []arr1 = {7, 1, 3};
        int []arr2 = {3, 4, 5};

        System.out.println("+");
        for(int i = 0; i < arr1.length; ++i){
            System.out.println(arr1[i] + arr2[i]);
        }
        System.out.println("*");
        for(int i = 0; i < arr1.length; ++i){
            System.out.println(arr1[i] * arr2[i]);
        }
    }
}
