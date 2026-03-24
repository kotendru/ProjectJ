public class Main {
    public static void main(String[] args) {

        Garden produc = new Garden("Компьютер", 9.9);
        Garden produc2 = new Garden("Ноутбук", 10.1);

        System.out.println("товар: ");
        produc.printInfo();
        System.out.println(produc.getId());
        System.out.println(produc2.getId());
    }
}