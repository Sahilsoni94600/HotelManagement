
package solution2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HotelManagement2 {

    public static void main(String[] args) {

        String Username = "SahilSoni";
        String Password = "Sahil123";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Username: ");
        String Uname = scan.next();

        System.out.println("Enter Password: ");
        String Pass = scan.next();

        if (Uname.equals(Username) && Pass.equals(Password)) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************************");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\tWelcome To Sahil Da Dhaba\t*");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************************\n\n\n");
            System.out.println("Here's the Menu Card....Place the order by typing the item code...\n\n");


            ItemFactory itemFactory = new ItemFactory();
            String choice;
            double totalAmount = 0;

            for (Item item : itemFactory.getAllItems()) {
                System.out.println("\t\tName\t\t\t\tItem Code\t\t\t\tPrice");
                System.out.println("\n•" + item.getName() + "\t\t\t\t" + item.getCode() + "\t\t\t\t" + item.getPrice());
            }

            Map<String,Integer> selectedItems = new HashMap<>();

            do {
                System.out.println("Place your order!...Please select the item by Item Code..\n\n");
                String selectedItem = scan.next();
                int selectedQuantity = scan.nextInt();

                selectedItems.put(selectedItem,selectedQuantity);

                System.out.println("Do you want to add more items?...If yes press y otherwise press n");
                choice = scan.next();
            }
            while (choice.equals("y"));

            ItemService itemService = new ItemServiceImpl();

            for (String code : selectedItems.keySet()) {
                Item item = itemService.findByCode(itemFactory.getAllItems(), code);

                System.out.println("\t\tItem Name\t\t\t\tItem Code\t\t\t\tQuantity\t\t\t\tPrice\t\t\t\tAmount");
                System.out.println(item.getName() + "\t\t\t\t" + item.getCode() + "\t\t\t\t" + selectedItems.get(code) + "\t\t\t\t" + item.getPrice() + "\t\t\t\t" + item.getPrice()*selectedItems.get(code));

                totalAmount = totalAmount + item.getPrice()*selectedItems.get(code);
            }

            System.out.println("\n\nTotal Amount to be paid : " + totalAmount);
            System.out.println("Thank you for visiting us...");
        }
    }
}