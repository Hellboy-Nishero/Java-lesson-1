import myPackage.New;
public class Test {
    public static void main(String[] args){
        int num1 = 168;
        int num2 = 1500;
        System.out.println("Сложение: "+ (num1+num2) + "\nВычитание: " + (num1-num2) +"\nУмножение: " + (num1*num2) + "\nДеление: " + (num2/num1) + "\nВывод в степень: " + (Math.pow(num1, num2)));
        test();
        New.hello();

    }
    private static void test() {
        System.out.println("I'm private");
    }
}
