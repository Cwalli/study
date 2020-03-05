package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int a = 5;
        int b = 3;
        boolean res = a <= b;
        int[] array = new int[6];
        array[0] = 2;
        array[1] = 1;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;
        array[5] = 2;
        for (int i = array.length-1; i >-1; i--) {
            System.out.println(array[i]);
            if (i==2){ break;}
        }
        int i=0;
        while(i<array.length){
            System.out.print(array[i] + " ");
            i++;
        }
//        int res = b>7?b:a;
//        System.out.println(res);
        for(int i=0; i < array.length;i++){

            System.out.print("В" + (i +1)+ "-м матче");
            switch (array[i]) {
                case 0:
                    System.out.println("не забил ни одного гола");
                case 1:
                    System.out.println("Забил гол");
                    break;
                case 2:
                    System.out.println("Забил дубль");
                    break;
                case 3:
                    System.out.println("оформил хэт-трик");
                default:
                     System.out.println("играл как Боженька");

                }
            }

        }
    }
}
