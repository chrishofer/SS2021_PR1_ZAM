package at.campus02.zam21.pr1.little;

public class Metropolis {
    public static void main(String[] args) {
        System.out.println(isMetropolis(true, 100001, 200));
    }
    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth){
        if(isCapital && inhabitants > 100000){
            return true;
        }
        if(inhabitants > 200000 && ((taxPerPersonAndMonth * 12 * inhabitants) > 720000000)){
            return true;
        }
        return false;
    }
}
