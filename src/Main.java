import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double shippingFee = 0.02;
        double shipping;
        double totalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the price of the item: ");
        int price = scanner.nextInt();
        if (price >= 100)
        {
           shipping = 0;
           totalPrice = shipping + price;
           System.out.println("The cost of shipping is: $" + shipping);
           System.out.println("The total price is: $" + totalPrice);
        }
        else
        {
            shipping = price * shippingFee;
            totalPrice = price + shipping;
            System.out.println("The cost of the shipping is: $" + shipping);
            System.out.println("The total price is: $" + totalPrice);
        }


    }
}