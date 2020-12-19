package vtb.skripova;

public class Warehouse {
    public int number;
    public String location;

    public Warehouse(int n, String l) {
        number = n;
        location = l;
    }

    public void adress(){
        System.out.println("Адрес склада номер: " + number + ", локация: " + location);
    }
}
