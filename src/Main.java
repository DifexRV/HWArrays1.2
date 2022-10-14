public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        //1. Целочисленный массив.
        int [] arraysInteger = new int [3];
            arraysInteger[0] = 1;
            arraysInteger[1] = 2;
            arraysInteger[2] = 3;

        //2. Массив, в котором можно хранить три дробных числа.
        float [] arraysFraction = {1.57F,7.654F,9.986F};

        //3. Произвольный массив.
        int [] arraysFree = new int[12];
            arraysFree[0]=1;
            arraysFree[1]=5;
            arraysFree[2]=7;
            arraysFree[11]=13;

        System.out.println("Задача 2");
            System.out.printf("%d, %d, %d\n", arraysInteger[0],arraysInteger[1],arraysInteger[2]);
            System.out.printf("%.3f, %.3f, %.3f\n", arraysFraction[0],arraysFraction[1],arraysFraction[2]);
            for (int i = 0; i < 12; i++) {
                if (i == arraysFree.length - 1) {
                    System.out.print(arraysFree[i]);
                } else {
                System.out.print(arraysFree[i] + ",");
            } }

        System.out.println(" ");

        System.out.println("Задача 3");
            System.out.printf("%d, %d, %d\n", arraysInteger[2],arraysInteger[1],arraysInteger[0]);
            System.out.printf("%.3f, %.3f, %.3f\n", arraysFraction[2],arraysFraction[1],arraysFraction[0]);
            for (int i = 12 -1; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(arraysFree[i]);
                } else {
                    System.out.print(arraysFree[i] + ",");
                }}

        System.out.println("Задача 4");
            for (int i = 0; i < 3; i++) {
                if (arraysInteger[i] % 2 != 0 && i == arraysInteger.length-1) {
                    System.out.print(arraysInteger[i] +1);
                } else if (arraysInteger[i] % 2 != 0) {
                    System.out.print(arraysInteger[i] + 1 + ",");
                }
            }
    }
}