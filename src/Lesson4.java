public class Lesson4 {
    public static void main(String[] args) {
        //Первое задание
        printThreeWords();
        //Второе задание
        checkSumSign(-2, -4);
        //Третье задание
        printColor(6);
        //Четвертое задание
        compareNumbers(3, 7);
        //Пятое задание
        boolean resultSum = checkSumEntryLimit(20, 5);
        System.out.println(resultSum);
        //Шестое задание
        checkNumberSign(0);
        //Седьмое задание
        boolean resultIsNegative = checkNumberIsNegative(-8);
        System.out.println(resultIsNegative);
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumEntryLimit(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 20);
    }

    public static void checkNumberSign(int a) {
        if (a >= 0){
            System.out.println("Положительное");
        }
        else{
            System.out.println("Отрицательное");
        }
    }

    public static boolean checkNumberIsNegative(int a) {
        return a < 0;
    }
}


