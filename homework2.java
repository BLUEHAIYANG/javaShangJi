import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class homework2 {
    public static void main (String[] args){

        //自定义一个数组
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

        //通过重建一个新的数组，剔除重复元素。
        List<Integer> newArray = new ArrayList<>();
        for(int i :Array){
            if(!newArray.contains(i))
                newArray.add(i);
        }
        System.out.print(newArray);
    }
}
