import java.util.HashMap;
import java.util.ArrayList;

// 1 - Сделать ранее созданый класс abstract
// 2 - hashmap в abstract классе
// 3 - метод abstract
// 4 - унаследованные классы
// 5 - создать три объекта
// 6 - private метод при создании нового объекта прибавляет к id еденичку для нового id объекта

public abstract class Product {

        private static int counterId = 0;
        protected int id;
        public String title;
        public double price;
        public HashMap<String, ArrayList<String>> hash;



        public Product() {};

        public Product(String title, double price) {
            this.id = getCounterId();
            this.title = title;
            this.price = price;
        }

        public abstract void ugabuga();

        private int getCounterId() {
            return ++counterId;
        }

        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public void printInfo() {
            System.out.println(id);
            System.out.println(title);
            System.out.println(price);
        }
}




