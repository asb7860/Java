
public class HomeWork1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 8;
        int b = 6;
        System.out.println("The summa is" + (a +b >= 0? "positive" : "negative"));
    }

    static void printColor() {
        int value = 110;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println ("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    static void compareNumbers() {
        int a =  23;
        int b = 23;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}

