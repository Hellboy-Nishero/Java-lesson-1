public class Car {
    static String color = "red";
    String country;
    int number;
    String engine;

    public Car(String country, String engine){
        this.country = country;
        this.engine = engine;
    }

    public int getNumber(){
        String owner = "Ivan";
        if(country == "germany"){
            number = 1;
            System.out.println(owner);
            return number;
        } else {
            number = 2;
            System.out.println(owner);
            return number;
        }
    }

    public String getOwner() {
        int number = getNumber();
        if(number == 1){
            return "Svetlana";
        } else {
            return "Ivan";
        }
    }

    public void getVariables() {
        System.out.println(color);
        System.out.println(country);
        System.out.println(number);
        System.out.println(engine);
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
