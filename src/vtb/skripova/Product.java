package vtb.skripova;

public class Product extends Warehouse{
    int place;
    String type;

    Product(int number, String location, int place, String type){
        super(number,location);
        this.type=type;
        this.place=place;
    }

    void store(){
        System.out.println("Адрес склада номер: " + number + ", локация: " + location + ", место на складе: "+ place + ", тип товара: "+ type);
    }

    void put(){
        System.out.println("Адрес склада номер: " + number + ", локация: " + location + ", место на складе: "+ place + ", тип товара: "+ type);
    }

    void take(){
        System.out.println("Адрес склада номер: " + number + ", локация: " + location + ", место на складе: "+ place + ", тип товара: "+ type);
    }
}
