import java.util.Scanner;
import myPackage.Person;
public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int num = 10;
        double doubleNum = 5.25;
        char character = 'n';
        boolean booleanVar = false;
        System.out.println("int: " + num + "\ndouble number: " + doubleNum + "\ncharacter: " + character + "\nboolean: " + booleanVar);
        System.out.println("\n\n");


        // Задание 2
        System.out.println("Задание 2");
        Person myPerson = new Person("Геннадий");
        Person myPerson2 = new Person("Юрий");
        Person myPerson3 = new Person("Александра");
        Person myPerson4 = new Person("Елизавета");
        Person myPerson5 = new Person("Никита");
        System.out.println("Имя человека: " + myPerson.name);
        System.out.println("Имя человека: " + myPerson2.name);
        System.out.println("Имя человека: " + myPerson3.name);
        System.out.println("Имя человека: " + myPerson4.name);
        System.out.println("Имя человека: " + myPerson5.name);
        myPerson.getPopulation();
        System.out.println("\n\n");


        // Задание 3
        System.out.println("Задание 3");
        int num2 = 23;
        System.out.println("Начальное значение num: " + num2);
        Integer convertInt = new Integer(num2);
        num2 = convertInt.intValue();
        System.out.println("Integer: " + convertInt + "\nКонвертированное значение num: " + num2);
        System.out.println("\n\n");

        //Задание 4
        System.out.println("Задание 4");
        int num3 = 52;
        double doubleNum2 = (double) num3;
        System.out.println("Неявное приведение типа от int к double: " + doubleNum2);
        doubleNum = 36.6;
        num3 = (int) doubleNum2;
        System.out.println("Явное приведение типа от double к int: " + num3);
        System.out.println("Потеря данных может произойти, когда один тип данных больше одного. Либо если любое дробное число возвести в int.");
        System.out.println("\n\n");

        //Задание 5
        System.out.println("Задание 5");
        String str1 = "Сегодня хороший день.";
        String str2 = "На улице идёт освежающий дождь";
        String sentances = str1 + " " + str2;
        System.out.println(sentances.substring(2, 5));
        System.out.println(sentances.replace("о", "х"));
        System.out.println(sentances.toLowerCase());
        System.out.println(sentances.toUpperCase());
    }
}

