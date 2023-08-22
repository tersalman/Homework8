import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("task 1 and task 2");
        int [] intNum = new int [3];
        intNum[0] = 1;
        intNum[1]= 2;
        intNum[2] = 3;
        double [] doubleNum = {1.57, 7.654, 9.986};
        byte [] byteNum = new byte[4];
        byteNum[0] = 3;
        byteNum[1] = 35;
        byteNum[2] = 45;
        byteNum[3] = 7;
        for (int i = 0; i < intNum.length; i++) {
            if (i==intNum.length-1){
            System.out.print(intNum[i]);
                continue;}
            System.out.print(intNum[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < doubleNum.length; i++) {
            if (i==doubleNum.length-1){
                System.out.print(doubleNum[i]);
                continue;}
            System.out.print(doubleNum[i] + ",");
        }
        System.out.println();
        for (int i = 0; i < byteNum.length; i++) {
            if (i==byteNum.length-1){
                System.out.print(byteNum[i]);
                }else {
                System.out.print(byteNum[i] + ",");
            }
        }
        System.out.println();

        System.out.println("task 3");
        for (int i = 2; i >= 0; i--) {
            if (i==0){
                System.out.println(intNum[i]);
            }else{
                System.out.print(intNum[i] + ",");
            }
        }

        for (int i = 2; i >= 0; i--) {
            if (i==0){
                System.out.println(doubleNum[i]);
            }else{
                System.out.print(doubleNum[i] + ",");
            }
        }

        for (int i = 3; i >= 0; i--) {
            if (i==0){
                System.out.println(byteNum[i]);
            }else{
                System.out.print(byteNum[i] + ",");
            }
        }
        for (int i = 0; i < intNum.length; i++) {
            if (intNum[i] %2 !=0 ){
                intNum[i]++;
            }
            if (i==intNum.length-1){
                System.out.print(intNum[i]);
                continue;}
            System.out.print(intNum[i] + ",");
        }

    }
}