public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 105;
        if(value <= 0){
            System.out.println("Красный");
        }
        else if(value > 100){
            System.out.println("Зелёный");
        }
        else{
            System.out.println("Жёлтый");
        }
    }
    public static void compareNumbers(){
        int a = 12;
        int b = 15;
        if(a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
