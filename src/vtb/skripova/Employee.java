package vtb.skripova;

public class Employee extends Warehouse{
    String name;
    int age;

    public Employee(int number, String location, String name, int age){
        super(number,location);
        this.age=age;
        this.name=name;
    }

    public void work(){
        System.out.println("Адрес склада номер: " + number + ", локация: " + location + ", имя сотрудника: "+ name + ", возраст сотрудника: "+ age);
    }
}
