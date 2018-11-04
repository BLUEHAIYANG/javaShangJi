import java.util.Arrays;
import java.util.Scanner;

/**
 JAVA学习
 版本1.1+   完善了数组反功能，完美符合题意
 for循环限制时使用了一个强制类型转换非常酷：
 j < (int)ArrayLength/2;
 2018年10月19日20:05:32
 */

public class 数组反序 {
    public static void main (String[] args){
        //先自定义一个数组，然后用Array.toString(数组名)方法输出。
        int[] arrays = new int [10];
        System.out.println("请输入数组长度：");
        Scanner inputArrayLength = new Scanner(System.in);
        int ArrayLength = inputArrayLength.nextInt();
        int[] Array = new int [ArrayLength];
        for(int i = 0;i < ArrayLength ;i++){
            System.out.println("请输入第" + (i+1) +"个数组元素：");
            Scanner inputArrayElement = new Scanner(System.in);
             Array [i]= inputArrayElement.nextInt();

        }
        System.out.println(Arrays.toString(Array));

        //经典方法进行数组反序e
        for(int j = 0 ;j < (int)ArrayLength/2;j++){
            int temp;//暂时存放
            temp = Array[j];
            Array[j] = Array[ArrayLength-1-j];
            Array[ArrayLength-1-j] = temp ;

        }
        System.out.println(Arrays.toString(Array));


    }
}
