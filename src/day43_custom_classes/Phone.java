package day43_custom_classes;

public class Phone {

    /*

        create instance variables

            name, brand, memory, version

        create constructors

        - accept and initialize the name

        - accept and initialize the name and brand

        - accept and initialize the name, brand, memory, and version

        create a toString
     */

    String name;
    String brand;
    int memory;
    double version;

    public Phone(String name) {
        this.name = name;
    }

    public Phone(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public Phone(String name, String brand, int memory, double version) {
        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public String toString(){

        String obj = name;

        if(brand != null){
            obj += " | " + brand;
        }

        if(memory != 0){
            obj += " | " + memory;
        }

        if(version != 0.0){
            obj += " | " + version;
        }

        return obj;

    }

//    public String toString() {
//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                ", memory=" + memory +
//                ", version=" + version +
//                '}';
//    }
}
