import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManagement {
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

            int Category, quantity, quantity1, quantity2, quantity3;
            String ItemName, item, item1, item2, item3, choice, choice1, choice2, choice3;
            ArrayList soupList = new ArrayList();
            ArrayList breadList = new ArrayList();
            ArrayList riceList = new ArrayList();
            ArrayList vegetableList = new ArrayList();
            ArrayList soupQuantity = new ArrayList();
            ArrayList breadQuantity = new ArrayList();
            ArrayList riceQuantity = new ArrayList();
            ArrayList vegetableQuantity = new ArrayList();
            double Price;
            do {
                System.out.println(" 1. Soup \n 2. Roti and Nan \n 3. Rice \n 4. Vegetables \n 5. Bring the Bill\n\nPlease Select Category: ");
                Category = scan.nextInt();
                switch (Category) {
                    case 1: {
                        System.out.println("\n\n\n--Soup--\n");
                        do {
                            System.out.println("           Item           \t\t\t\tItems Code\t\t\t\t Price");
                            System.out.println("• Vegetable Sweet Corn Soup  \t\t\t\tVSCP   \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Hot and Sour Soup\t\t\t\tVHSS   \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Noodle Soup      \t\t\t\tVNS    \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Clear Soup       \t\t\t\tVCS    \t\t\t\tRs. 60.00");
                            System.out.print("\nSelect Items by Item Code: ");
                            item = scan.next();
                            System.out.print("Enter quantity of this item: ");
                            quantity = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                            if (choice.equals("y")) {
                                soupList.add(item);
                                soupQuantity.add(quantity);
                            }
                        }
                        while (choice.equals("y"));
                        break;
                    }
                    case 2: {
                        System.out.println("\n\n\n--Roti and Nan--\n");
                        do {

                            System.out.println("      Item        \t\t\t\tItems Code\t\t\t\t Price");
                            System.out.println("• Tandoori Roti       \t\t\t\tTR    \t\t\t\tRs. 18.00");
                            System.out.println("• Butter Tandoori Roti\t\t\t\tBTR   \t\t\t\tRs. 25.00");
                            System.out.println("• Plain Nan           \t\t\t\tPN    \t\t\t\tRs. 33.00");
                            System.out.println("• Butter Nan          \t\t\t\tBN    \t\t\t\tRs. 42.00");
                            System.out.print("\nSelect Items by Item Code: ");
                            item1 = scan.next();
                            System.out.println("Enter quantity of this item: ");
                            quantity1 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice1 = scan.next();
                            if (choice1.equals("y")) {
                                breadList.add(item1);
                                breadQuantity.add(quantity1);
                            }
                        }
                        while (choice1.equals("y"));
                        break;
                    }
                    case 3: {
                        System.out.println("\n\n\n--Rice--\n");
                        do {
                            System.out.println("      Item           \t\t\t\tItems Code \t\t\t\t Price");
                            System.out.println("• Pulao                   \t\t\t\tP     \t\t\t\tRs. 50.00");
                            System.out.println("• Veg Pulao               \t\t\t\tVP    \t\t\t\tRs. 80.00");
                            System.out.println("• Rice                    \t\t\t\tR     \t\t\t\tRs. 40.00");
                            System.out.println("• Veg Fried Rice          \t\t\t\tVFR   \t\t\t\tRs. 60.00");
                            System.out.print("\nSelect Items by Item Code: ");
                            item2 = scan.next();
                            System.out.print("Enter quantity of this item: ");
                            quantity2 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice2 = scan.next();
                            if (choice2.equals("y")) {

                                riceList.add(item2);
                                riceQuantity.add(quantity2);
                            }
                        }
                        while (choice2.equals("y"));
                        break;
                    }
                    case 4: {
                        System.out.println("\n\n\n--Vegetables--\n");
                        do {
                            System.out.println("     Item         \t\t\t\tItems Code\t\t\t\t Price");
                            System.out.println("• Dal Makhni         \t\t\t\tDM     \t\t\t\tRs. 80.00");
                            System.out.println("• Dal Fry            \t\t\t\tDF     \t\t\t\tRs. 80.00");
                            System.out.println("• Kadhai Paneer      \t\t\t\tKP     \t\t\t\tRs. 100.00");
                            System.out.println("• Mix Veg            \t\t\t\tMV     \t\t\t\tRs. 70.00");
                            System.out.print("\nSelect Items by Item Code: ");
                            item3 = scan.next();
                            System.out.print("Enter quantity of this item: ");
                            quantity3 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice3 = scan.next();
                            if (choice3.equals("y")) {
                                vegetableList.add(item3);
                                vegetableQuantity.add(quantity3);
                            }
                        }
                        while (choice3.equals("y"));
                        break;
                    }

                    case 5:{
                        System.out.println("\n\n\nHere's your bill!...\n\n");
                        System.out.println("\t\tItem\t\t\tItem Code\t\t\tQty\t\t\tPrice\t\t\tAmount");
                        for(int i = 0; i <= soupList.size(); i++)
                            System.out.println(soupList.get(i));
                        /*for (int i = 0; i < soupList.size(); i ++){
                            for (int j = 0; j < breadList.size(); j++){
                                for (int k = 0; k < riceList.size(); k++){
                                    for (int l = 0; l < vegetableList.size(); l++) {
                                        for (int m = 0; m < soupQuantity.size(); m++) {
                                            for (int n = 0; n < breadQuantity.size(); n++) {
                                                for (int o = 0; o < riceQuantity.size(); o++) {
                                                    for (int p = 0; p < vegetableQuantity.size(); p++) {
                                                        if (soupList.get(i) == "VSCP") {
                                                            ItemName = "Vegetable Sweet Corn Soup";
                                                            Price = 60.00;
                                                            System.out.println(ItemName + "\t\t\t" + soupList.get(i) + "\t\t\t" + soupQuantity.get(i) + "\t\t\t");
                                                        } else if (soupList.get(i) == "VHSS") {
                                                            ItemName = "Vegetable Hot and Sour Soup";
                                                            Price = 60.00;
                                                            System.out.println(ItemName + "\t\t\t" + soupList.get(i) + "\t\t\t" + soupQuantity.get(i) + "\t\t\t");
                                                        } else if (soupList.get(i) == "VNS") {
                                                            ItemName = "Vegetable Noodle Soup";
                                                            Price = 60.00;
                                                            System.out.println(ItemName + "\t\t\t" + soupList.get(i) + "\t\t\t" + soupQuantity.get(i) + "\t\t\t");
                                                        } else if (soupList.get(i) == "VCS") {
                                                            ItemName = "Vegetable Clear Soup";
                                                            Price = 60.00;
                                                            System.out.println(ItemName + "\t\t\t" + soupList.get(i) + "\t\t\t" + soupQuantity.get(i) + "\t\t\t");
                                                        }
                                                        if (breadList.get(j) == "TR") {
                                                            ItemName = "Tandoori Roti";
                                                            Price = 18.00;
                                                            System.out.println(ItemName + "\t\t\t" + breadList.get(i) + "\t\t\t" + breadQuantity.get(i) + "\t\t\t");
                                                        } else if (breadList.get(j) == "BTR") {
                                                            ItemName = "Butter Tandoori Roti";
                                                            Price = 25.00;
                                                            System.out.println(ItemName + "\t\t\t" + breadList.get(i) + "\t\t\t" + breadQuantity.get(i) + "\t\t\t");
                                                        } else if (breadList.get(j) == "PN") {
                                                            ItemName = "Plain Nan";
                                                            Price = 33.00;
                                                            System.out.println(ItemName + "\t\t\t" + breadList.get(i) + "\t\t\t" + breadQuantity.get(i) + "\t\t\t");
                                                        } else if (breadList.get(j) == "BN") {
                                                            ItemName = "Butter Nan";
                                                            Price = 42.00;
                                                            System.out.println(ItemName + "\t\t\t" + breadList.get(i) + "\t\t\t" + breadQuantity.get(i) + "\t\t\t");
                                                        }
                                                        if (riceList.get(k) == "P") {
                                                            ItemName = "Pulao";
                                                            Price = 50.00;
                                                            System.out.println(ItemName + "\t\t\t" + riceList.get(i) + "\t\t\t" + riceQuantity.get(i) + "\t\t\t");
                                                        } else if (riceList.get(k) == "VP") {
                                                            ItemName = "Veg Pulao";
                                                            Price = 80.00;
                                                            System.out.println(ItemName + "\t\t\t" + riceList.get(i) + "\t\t\t" + riceQuantity.get(i) + "\t\t\t");
                                                        } else if (riceList.get(k) == "R") {
                                                            ItemName = "Rice";
                                                            Price = 40.00;
                                                            System.out.println(ItemName + "\t\t\t" + riceList.get(i) + "\t\t\t" + riceQuantity.get(i) + "\t\t\t");
                                                        } else if (riceList.get(k) == "VFR") {
                                                            ItemName = "Veg Fried Rice";
                                                            Price = 60.00;
                                                            System.out.println(ItemName + "\t\t\t" + riceList.get(i) + "\t\t\t" + riceQuantity.get(i) + "\t\t\t");
                                                        }
                                                        if (vegetableList.get(l) == "DM") {
                                                            ItemName = "Dal Makhni";
                                                            Price = 80.00;
                                                            System.out.println(ItemName + "\t\t\t" + vegetableList.get(i) + "\t\t\t" + vegetableQuantity.get(i) + "\t\t\t");
                                                        } else if (vegetableList.get(l) == "DF") {
                                                            ItemName = "Dal Fry";
                                                            Price = 80.00;
                                                            System.out.println(ItemName + "\t\t\t" + vegetableList.get(i) + "\t\t\t" + vegetableQuantity.get(i) + "\t\t\t");
                                                        } else if (vegetableList.get(l) == "KP") {
                                                            ItemName = "Kadhai Panner";
                                                            Price = 100.00;
                                                            System.out.println(ItemName + "\t\t\t" + vegetableList.get(i) + "\t\t\t" + vegetableQuantity.get(i) + "\t\t\t");
                                                        } else if (vegetableList.get(l) == "MV") {
                                                            ItemName = "Mix Veg";
                                                            Price = 70.00;
                                                            System.out.println(ItemName + "\t\t\t" + vegetableList.get(i) + "\t\t\t" + vegetableQuantity.get(i) + "\t\t\t");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }*/

                    }
                }
            }
            while (Category != 5);
        } else {
            System.out.println("Invalid Username or Password!...Please Rerun the program and try again.");
        }
    }
}
