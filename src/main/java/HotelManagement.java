//Java, JDK JRE JVM
import java.util.*;

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

            int Category, quantity;
            String item, choice, itemName;
            Map<String, Integer> menu = new HashMap<String, Integer>();
            /*ArrayList soupList = new ArrayList();
            ArrayList breadList = new ArrayList();
            ArrayList riceList = new ArrayList();
            ArrayList vegetableList = new ArrayList();
            ArrayList soupQuantity = new ArrayList();
            ArrayList breadQuantity = new ArrayList();
            ArrayList riceQuantity = new ArrayList();
            ArrayList vegetableQuantity = new ArrayList();*/
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

                            menu.put(item, quantity);

                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
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
                            item = scan.next();
                            System.out.println("Enter quantity of this item: ");
                            quantity = scan.nextInt();

                            menu.put(item, quantity);
                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                            /*if (choice1.equals("y")) {
                                breadList.add(item1);
                                breadQuantity.add(quantity1);
                            }*/
                        }
                        while (choice.equals("y"));
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
                            item = scan.next();
                            System.out.print("Enter quantity of this item: ");
                            quantity = scan.nextInt();

                            menu.put(item, quantity);

                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                            /*if (choice2.equals("y")) {

                                riceList.add(item2);
                                riceQuantity.add(quantity2);
                            }*/
                        }
                        while (choice.equals("y"));
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
                            item = scan.next();
                            System.out.print("Enter quantity of this item: ");
                            quantity = scan.nextInt();

                            menu.put(item, quantity);

                            System.out.println("Do you want to add more Soup?.....If yes then press y otherwise press n");
                            choice = scan.next();
                            /*if (choice.equals("y")) {
                                vegetableList.add(item3);
                                vegetableQuantity.add(quantity3);
                            }*/
                        }
                        while (choice.equals("y"));
                        break;
                    }

                    case 5: {
                        System.out.println("\n\n\nHere's your bill!...\n\n");
                        System.out.println("\t\tItem\t\t\t\t\t\tItem Code\t\t\tQty\t\t\tPrice\t\t\tAmount");


                        for (String key : menu.keySet()) {
                            Integer value = menu.get(key);

                            if (key.equals("VSCP")) {
                                itemName = "Vegetable Sweet Corn Soup";
                                Price = 60.00;
                                System.out.println(itemName + "  \t\t\t" + key + "    \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("VHSS")) {
                                itemName = "Vegetable Hot and Sour Soup";
                                Price = 60.00;
                                System.out.println(itemName + "\t\t\t" + key + "    \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("VNS")) {
                                itemName = "Vegetable Noodle Soup";
                                Price = 60.00;
                                System.out.println(itemName + "      \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("VCS")) {
                                itemName = "Vegetable Clear Soup";
                                Price = 60.00;
                                System.out.println(itemName + "       \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("TR")) {
                                itemName = "Tandoori Roti";
                                Price = 18.00;
                                System.out.println(itemName + "           \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("BTR")) {
                                itemName = "Butter Tandoori Roti";
                                Price = 25.00;
                                System.out.println(itemName + "       \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("PN")) {
                                itemName = "Plain Nan";
                                Price = 33.00;
                                System.out.println(itemName + "                  \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("BN")) {
                                itemName = "Butter Nan";
                                Price = 42.00;
                                System.out.println(itemName + "                 \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("P")) {
                                itemName = "Pulao";
                                Price = 50.00;
                                System.out.println(itemName + "                      \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("VP")) {
                                itemName = "Veg Pulao";
                                Price = 80.00;
                                System.out.println(itemName + "                  \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("R")) {
                                itemName = "Rice";
                                Price = 40.00;
                                System.out.println(itemName + "                       \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("VFR")) {
                                itemName = "Veg Fried Rice";
                                Price = 60.00;
                                System.out.println(itemName + "             \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("DM")) {
                                itemName = "Dal Makhni";
                                Price = 80.00;
                                System.out.println(itemName + "                 \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("DF")) {
                                itemName = "Dal Fry";
                                Price = 80.00;
                                System.out.println(itemName + "                    \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("KP")) {
                                itemName = "Kadhai Paneer";
                                Price = 100.00;
                                System.out.println(itemName + "              \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            } else if (key.equals("MV")) {
                                itemName = "Mix Veg";
                                Price = 70.00;
                                System.out.println(itemName + "                    \t\t\t" + key + "        \t\t\t" + value + "\t\t\t" + Price + "\t\t\t" + Price*value);
                            }
                        }


                        /*if (menu.containsKey("VSCP")) {
                            itemName = "Vegetable Sweet Corn Soup";
                            Price = 60.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("VHSS")) {
                            itemName = "Vegetable Hot and Sour Soup";
                            Price = 60.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("VNS")) {
                            itemName = "Vegetable Noodle Soup";
                            Price = 60.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("VCS")) {
                            itemName = "Vegetable Clear Soup";
                            Price = 60.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        }
                        if (menu.containsKey("TR")) {
                            itemName = "Tandoori Roti";
                            Price = 18.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("BTR")) {
                            itemName = "Butter Tandoori Roti";
                            Price = 25.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("PN")) {
                            itemName = "Plain Nan";
                            Price = 33.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("BN")) {
                            itemName = "Butter Nan";
                            Price = 42.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        }
                        if (menu.containsKey("P")) {
                            itemName = "Pulao";
                            Price = 50.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("VP")) {
                            itemName = "Veg Pulao";
                            Price = 80.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsValue("R")) {
                            itemName = "Rice";
                            Price = 40.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsValue("VFR")) {
                            itemName = "Veg Fried Rice";
                            Price = 60.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        }
                        if (menu.containsValue("DM")) {
                            itemName = "Dal Makhni";
                            Price = 80.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("DF")) {
                            itemName = "Dal Fry";
                            Price = 80.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("KP")) {
                            itemName = "Kadhai Panner";
                            Price = 100.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
                            }
                        } else if (menu.containsKey("MV")) {
                            itemName = "Mix Veg";
                            Price = 70.00;
                            for (String key : menu.keySet()) {
                                Integer value = menu.get(key);
                                System.out.println(itemName + "\t\t\t" + key + "\t\t\t" + value + "\t\t\t");
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
