package vtb.skripova;
class Warehouse {
    int number, location;

    Warehouse(int number, int location) {
        this.number = number;
        this.location = location;
    }

    void store(){
         System.out.printf("Sklad hranenie number: %d, location: %d \n", this.number, this.location);
     }
    void put(){
        System.out.printf("Sklad novij tovar number: %d, location: %d \n", this.number, this.location);
    }
    void take(){
        System.out.printf("Sklad tovar izjat number: %d, location: %d \n", this.number, this.location);
    }
    void work(){
        System.out.printf("Sotrudnik sklada number: %d, location: %d \n", this.number, this.location);
    }
}

class Employee extends Warehouse{
    int age, id;

    Employee(int number, int location, int age, int id){
        super(number,location);
        this.age=age;
        this.id=id;
    }

    void work(){
        System.out.printf("Sotrudnik sklada location: %d, number: %d, age: %d, id: %d \n", this.number, this.location, this.age, this.id);
    }
   }

class Product extends Warehouse{
    int place;
    int article;

    Product(int number, int location, int place, int article){
        super(number,location);
        this.article=article;
        this.place=place;
    }

    void store(){
        System.out.printf("Tovar hranenie number: %d, location: %d, place: %d, article: %d \n", this.number, this.location, this.place, this. article);
    }
    void put(){
        System.out.printf("Tovar novij number: %d, location: %d, place: %d, article: %d \n", this.number, this.location, this.place, this. article);
    }
    void take(){
        System.out.printf("Tovar izjat number: %d, location: %d, place: %d, article: %d \n", this.number, this.location, this.place, this. article);
    }
}


public class Main {

    public static void main(String[] args) {

    Warehouse w[]=new Warehouse[3];

    w[0]=new Warehouse(1,23);
    w[1]=new Employee(1,23,18,444555);
    w[2]=new Product(1,23,41,125478);

    for(int i=0; i<w.length; i++) {
        w[i].store();
        w[i].put();
        w[i].take();
        w[i].work();
    }
    }
}
