package myPackage;

public class Person {
    public String name = "";
    static int population = 800000000;

    public Person (String name){
        this.name = name;
    }

    public void getPopulation(){
        System.out.println("Численность населения на нашей планете: " + population);
    }
}
