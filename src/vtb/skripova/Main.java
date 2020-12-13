package vtb.skripova;
class Warehouse {
    int number, location, place;

    Warehouse(int number, int location, int place) {
        this.number = number;
        this.location = location;
        this.place=place;
    }

     void put()
     void store()
     void take()

}

class Employee extends Warehouse{
    int age;
    String name;

    Employee(int number, int location, int age, String name){
        super(number, location);
        this.age=age;
        this.name=name;
    }
}

class Product extends Warehouse{
    String type;

    Product(int number, int location, String type){
        super(number,location);
        this.type=type;
    }
}


public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
