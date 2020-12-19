package vtb.skripova;

public class Main {

    public static void main(String[] args) {

        Warehouse w[] = new Warehouse[2];
        w[0] = new Warehouse(1, "Москва");
        w[1] = new Warehouse(2, "Воронеж");

        Employee employee[] = new Employee[3];
        employee[0] = new Employee(1, "Москва", "Вася", 25);
        employee[1] = new Employee(1, "Москва", "Петя", 31);
        employee[2] = new Employee(2, "Воронеж", "Петя", 31);


        Product productAvailable[]=new Product[2];
        productAvailable[0]=new Product(2,"Воронеж", 2, "телевизор");
        productAvailable[1]=new Product(2,"Воронеж", 12, "наушники");

        Product productNew[]=new Product[2];
        productNew[0]=new Product(1,"Москва", 23, "телевизор");
        productNew[1]=new Product(1,"Москва", 57, "игровая приставка");

        Product productTake[]=new Product[1];
        productTake[0]=new Product(2,"Воронеж", 18, "планшет");

        System.out.println("Список складов");
        for (int i = 0; i < w.length; i++) {
            w[i].adress();
        }
        System.out.println("");

        System.out.println("Список сотрудников");
        for (int i = 0; i < employee.length; i++) {
            employee[i].work();
        }
        System.out.println("");

        System.out.println("Товар в наличии");
        for (int i = 0; i < productAvailable.length; i++) {
            productAvailable[i].store();
        }
        System.out.println("");

        System.out.println("Поступление нового товара");
        for (int i = 0; i < productNew.length; i++) {
            productNew[i].put();
        }
        System.out.println("");

        System.out.println("Отгрузка товара со склада");
        for (int i = 0; i < productTake.length; i++) {
            productTake[i].take();
        }
    }
}
