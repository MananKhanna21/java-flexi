class Product {
    String name;
    double price;

    Product(String n, double p) {
        name = n;
        price = p;
    }
}

class ShoppingCart {
    Product products[] = new Product[10];
    int count = 0;

    void addProduct(Product p) {
        products[count] = p;
        count++;
    }

    void removeProduct(String n) {
        for (int i = 0; i < count; i++) {
            if (products[i].name.equalsIgnoreCase(n)) {
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                count--;
                break;
            }
        }
    }

    double totalCost() {
        double sum = 0;
        for (int i = 0; i < count; i++) sum += products[i].price;
        return sum;
    }

    void displayCart() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i].name + " " + products[i].price);
        }
        System.out.println("Total: " + totalCost());
    }
}

public class shopping {
    public static void main(String[] args) {
        ShoppingCart c = new ShoppingCart();

        c.addProduct(new Product("Mouse", 500));
        c.addProduct(new Product("Keyboard", 1200));

        c.displayCart();
        c.removeProduct("Mouse");
        c.displayCart();
    }
}
