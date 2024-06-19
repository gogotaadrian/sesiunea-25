package Exercitiu1;

public class Dog {

    String name;
    String color;
    String bred;

    public void brak(){

        System.out.println("woof" + this.name);
    }

    public Dog(String bred, String color, String name) {
        this.bred = bred;
        this.color = color;
        this.name = name;
    }

    public void run(){
        System.out.println("run"+ this.name);

    }
}
