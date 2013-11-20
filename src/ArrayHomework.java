/**
 * Created with IntelliJ IDEA.
 * User: Iuliia
 * Date: 11/19/13
 * Time: 6:31 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Arrays;

public class ArrayHomework {

    public static int[] join(int[]a, int[]b) {
        int[] joinedArr = new int[a.length+b.length];
        System.arraycopy(a,0,joinedArr,0,a.length);
        System.arraycopy(b, 0, joinedArr, a.length, b.length);
        return joinedArr;
    }
    public static int[] joinDistinct(int[] a) {
        int[] distArr = new int[a.length];
        for(int i = 0; i<a.length; i++){
            Integer currVal = a[i];
            int count = 1;
            if(currVal != 0){
                for (int j=i+1; j<a.length; j++) {
                    if(a[j]==currVal){
                        a[j] = 0;
                        count++;
                    }
                }
                System.out.println("Distinct Number: " + currVal);
            }
        }
        return distArr;
    }
    public static int[] commonVal(int[] a, int[] b){
        int[] commArr = new int[a.length];
        for (int i=0;i<a.length;i++){
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    System.out.println("Common Number: " + a[i]);
                }
            }
        }
        return commArr;
    }
    public static int[] outerVal(int[] a, int[] b){
        int[] outerArr = new int[a.length];
        boolean isfound = false;
        for (int i=0;i<a.length;i++){
            isfound = false;
            for(int j=0; j<b.length; j++){
                if(a[i]==b[j]){
                    isfound= true;
                }
            }
            if (!isfound){
                System.out.println("Outer Number: " + a[i]);
            }
        }
        for (int i=0;i<b.length;i++){
            isfound = false;
            for(int j=0; j<a.length; j++){
                if(b[i]==a[j]){
                    isfound= true;
                }
            }
            if (!isfound){
               System.out.println("Outer Number: " + b[i]);
            }
        }
        return outerArr;
    }

    public static void main(String[] args) {
        int arr1[]=new int[] {1,5,4,23,65,32,78};
        int arr2[]=new int[] {3,5,24,4,1,2,34,45,32};
        int[] joinArr = join(arr1,arr2);
        //for (int i = 0; i<joinArr.length; i++) System.out.println(i + ": " + joinArr[i]);
        int[] joinDist = joinDistinct(joinArr);
        int[] commVal = commonVal(arr2,arr1);
        int[] outerVal = outerVal(arr1,arr2);
    }
}




