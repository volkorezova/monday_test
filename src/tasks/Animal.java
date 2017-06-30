package tasks;

/**
 * Created by tatyanavolkorezova on 23.06.17.
 */
abstract public class Animal {

    private double length;
    private String name, color;

    public Animal(double length, String name, String color){
        this.length = length;
        this.name = name;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void makeSound(String name){

        if (name =="Dog")
            System.out.println("Dog makes sound: GAV-GAV-GAV");
        else if (name == "Fish")
            System.out.println("Fish makes sound: M-M-M-M-M");
        else if (name == "Bird")
            System.out.println("Bird makes sound: KAR-KAR-KAR");
        else
            System.out.println("Is not support");
    }

}
