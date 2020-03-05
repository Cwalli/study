package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String klass[] = new String[18];

        klass[0] = "Агатьева Арина Юрьевна";

        klass[1] = "Алексеева Пальмира Гурьевна";

        klass[2] = "Алексеев Феликс Александрович";

        klass[3] = "Борисова Екатерина Юрьевна";

        klass[4] = "Васильев Иван Юрьевич";

        klass[5] = "Григорьева Елена Андреевна";

        klass[6] = "Данилов Александр Леонидович";

        klass[7] = "Жидова Анастасия Анатольевна";

        klass[8] = "Исаков Константин Сергеевич";

        klass[9] = "Иванов Иван Александрович";

        klass[10] = "Клементьева Екатерина Николаевна";

        klass[11] = "Николаева Анжелика Леонидовна";

        klass[12] = "Николаева Анна Игоревна";

        klass[13] = "Николаев Кирилл Андреевич";

        klass[14] = "Родионова Елена Васильевна";

        klass[15] = "Семёнова Анна Александровна";

        klass[16] = "Терентьев Юрий Александрович";

        klass[17] = "Фёдоров Владимир Николаевич";

        Float rs_ball[] = new Float[18];

        rs_ball[0] = 8.5F;

        rs_ball[1] = 5.3F;

        rs_ball[2] = 6.5F;

        rs_ball[3] = 6.3F;

        rs_ball[4] = 3.3F;

        rs_ball[5] = 4.3F;

        rs_ball[6] = 5.5F;

        rs_ball[7] = 5.2F;

        rs_ball[8] = 6.7F;

        rs_ball[9] = 7.4F;

        rs_ball[10] = 7.7F;

        rs_ball[11] = 6.5F;

        rs_ball[12] = 4.3F;

        rs_ball[13] = 5.5F;

        rs_ball[14] = 6.6F;

        rs_ball[15] = 7.3F;

        rs_ball[16] = 9.6F;

        rs_ball[17] = 9.9F;
        System.out.println("По среднему баллу:");
        for (int i = 0; i < klass.length; i++) {

            System.out.print((i + 1) + " " + klass[i]);

            for (int j = i; ; ) {
                System.out.println(" " +"-" +" "+"Средний балл" + " "+"-"+" " + rs_ball[j]);
                break;
            }
        }
        System.out.println("По успеваемоти:");
        for (int i = 0; i < klass.length; i++) {
            System.out.print((i + 1) + " " + klass[i]);
            int j = i;
            if (rs_ball[j] < 6) {
                System.out.println(" " + "-"+" " + "двоечник");
            } else if (rs_ball[j] < 8) {
                System.out.println(" " + "-"+" " + "хорошист");
            } else {
                //(rs_ball[j] < 10);
                System.out.println(" " + "-"+" " + "Отличник");
            }
            //           {
            //             System.out.println(" " + "Средний балл" + " " + rs_ball[j]);
            //           break;
            //     }
        }

       /*
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
//              int res = b>7?b:a;
//              System.out.println(res);
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
*/
    }
}
