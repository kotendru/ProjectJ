public class Garden extends Product{
    public Garden(String title, double price) {
        super(title, price);
    }
    @Override
    public void ugabuga() {
        System.out.println("Цена за пять штук товара: " + super.price);
    }

}
