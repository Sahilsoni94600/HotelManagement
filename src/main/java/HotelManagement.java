import java.lang.String;
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
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*\tWecome To Sahil Da Dhaba\t*");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************************\n\n\n");
            System.out.println("Here's the Menu Card....Place the order by typing the item code...\n\n");
            System.out.println(" 1. Soup \n 2. Roti and Nan \n 3. Rice \n 4. Vegetables \n 5. Bring the Bill");
            System.out.println("Please Select Category: ");
            int Category = scan.nextInt();
            do {
                switch (Category) {
                    case 1: {
                        System.out.println("\n\n\n--Soup--\n");
                        String choice;
                        do {
                            System.out.println("           Item           \t\t\t\tItems Code\t\t\t\t Price");
                            System.out.println("• Vegetable Sweet Corn Soup  \t\t\t\tVSCP   \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Hot and Sour Soup\t\t\t\tVHSS   \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Noodle Soup      \t\t\t\tVNS    \t\t\t\tRs. 60.00");
                            System.out.println("• Vegetable Clear Soup       \t\t\t\tVCS    \t\t\t\tRs. 60.00");
                            System.out.print("\nSelect Items by Item Code: ");
                            String item = scan.next();
                            if (item == "VSCP" || item == "VHSS" || item == "VNS" || item == "VCS")
                                System.out.print("Enter quantity of this item: ");
                            int quantity = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                        }
                        while (choice.equals("y"));
                       /* System.out.print("\nSelect Items by Item Code: ");
                        item = scan.next();*/
                       /* if (item == "VSCP" || item == "VHSS" || item == "VNS" || item == "VCS") {
                            System.out.print("Enter quantity of this item: ");
                            quantity = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                        } else {
                            System.out.println("Invalid item Selection!....Select again");

                        }*/
                        continue;
                    }
                }

                case 2: {
                    System.out.println("\n\n\n--Roti and Nan--\n");
                    System.out.println("      Item        \t\t\t\tItems Code\t\t\t\t Price");
                    System.out.println("• Tandoori Roti       \t\t\t\tTR    \t\t\t\tRs. 18.00");
                    System.out.println("• Butter Tandoori Roti\t\t\t\tBTR   \t\t\t\tRs. 25.00");
                    System.out.println("• Plain Nan           \t\t\t\tPN    \t\t\t\tRs. 33.00");
                    System.out.println("• Butter Nan          \t\t\t\tBN    \t\t\t\tRs. 42.00");
                    System.out.print("\nSelect Items by Item Code: ");
                    String item1 = scan.next();
                    if (item1 == "TR" || item1 == "BTR" || item1 == "PN" || item1 == "BN")
                        System.out.print("Enter quantity of this item: ");
                    int quantity1 = scan.nextInt();
                    System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                    String choice1 = scan.next();
                    while (choice1.equals("y")) {
                        System.out.print("\nSelect Items by Item Code: ");
                        item1 = scan.next();
                        if (item1 == "TR" || item1 == "BTR" || item1 == "PN" || item1 == "BN") {
                            System.out.print("Enter quantity of this item: ");
                            quantity1 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice1 = scan.next();
                        } else {
                            System.out.println("Invalid item Selection!....Select again");

                        }
                        continue;
                    }
                }
                case 3: {
                    System.out.println("\n\n\n--Rice--\n");
                    System.out.println("      Item           \t\t\t\tItems Code \t\t\t\t Price");
                    System.out.println("• Pulao                   \t\t\t\tP    \t\t\t\tRs. 18.00");
                    System.out.println("• Veg Pulao               \t\t\t\tVP   \t\t\t\tRs. 25.00");
                    System.out.println("• Rice                    \t\t\t\tR    \t\t\t\tRs. 33.00");
                    System.out.println("• Veg Fried Rice          \t\t\t\tVFR    \t\t\t\tRs. 42.00");
                    System.out.print("\nSelect Items by Item Code: ");
                    String item2 = scan.next();
                    if (item2 == "P" || item2 == "VP" || item2 == "R" || item2 == "VFR")
                        System.out.print("Enter quantity of this item: ");
                    int quantity2 = scan.nextInt();
                    System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                    String choice2 = scan.next();
                    while (choice2.equals("y")) {
                        System.out.print("\nSelect Items by Item Code: ");
                        item2 = scan.next();
                        if (item2 == "P" || item2 == "VP" || item2 == "R" || item2 == "VFR") {
                            System.out.print("Enter quantity of this item: ");
                            quantity2 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice2 = scan.next();
                        } else {
                            System.out.println("Invalid item Selection!....Select again");

                        }
                        continue;
                    }
                }
                case 4: {
                    System.out.println("\n\n\n--Vegetables--\n");
                    System.out.println("     Item         \t\t\t\tItems Code\t\t\t\t Price");
                    System.out.println("• Dal Makhni         \t\t\t\tDM   \t\t\t\tRs. 60.00");
                    System.out.println("• Dal Fry            \t\t\t\tDF   \t\t\t\tRs. 60.00");
                    System.out.println("• Kadhai Paneer      \t\t\t\tKP    \t\t\t\tRs. 60.00");
                    System.out.println("• Mix Veg            \t\t\t\tMV    \t\t\t\tRs. 60.00");
                    System.out.print("\nSelect Items by Item Code: ");
                    String item3 = scan.next();
                    if (item3 == "DM" || item3 == "DF" || item3 == "KP" || item3 == "MV")
                        System.out.print("Enter quantity of this item: ");
                    int quantity3 = scan.nextInt();
                    System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                    String choice3 = scan.next();
                    while (choice3.equals("y")) {
                        System.out.print("\nSelect Items by Item Code: ");
                        item3 = scan.next();
                        if (item3 == "DM" || item3 == "DF" || item3 == "KP" || item3 == "MV") {
                            System.out.print("Enter quantity of this item: ");
                            quantity3 = scan.nextInt();
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice3 = scan.next();
                        } else {
                            System.out.println("Invalid item Selection!....Select again");

                        }

                        continue;
                    }
                }

            }
            while(Category != 5);
        }


                            }
        else{
                            System.out.println("Invalid Username or Password!");
                        }
                    }
            }
