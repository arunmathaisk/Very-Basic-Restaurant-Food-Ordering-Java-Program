package pizza_version_2;

import java.util.*;

public class Pizza_Express {

    static Scanner obj = new Scanner(System.in);
    static boolean return_to_main = true;
    static String admin_password = "";a
    static boolean admin_acess = false;

    static String[] soups = new String[50];
    static double[] soups_veg_price = new double[50];
    static double[] soups_nonveg_price = new double[50];
    static int soups_pos = 3;

    static String[] pizza = new String[50];
    static double[] pizza_veg_price = new double[50];
    static double[] pizza_nonveg_price = new double[50];
    static int pizza_pos = 3;

    static String[] desserts = new String[50];
    static double[] desserts_veg_price = new double[50];
    static double[] desserts_nonveg_price = new double[50];
    static int desserts_pos = 3;

    static String[] garlicbread = new String[50];
    static double[] garlicbread_veg_price = new double[50];
    static int garlicbread_pos = 2;

    static String[] softdrinks = new String[50];
    static double[] softdrinks_veg_price = new double[50];
    static int softdrinks_pos = 4;

    static String customer_name = "";
    static String customer_number = "";

    
    static String item_purchased_name[] = new String[50];
    static  int item_purchased_quantity[] = new int[50];
    static double item_purchased_amount[] = new double[50];
    static String item_purchased_type[] = new String[50];
    static int item_purchased_pos = 1;
    
   
    static  String item_purchased_quantity1[] = new String[50];
    static String item_purchased_amount1[] = new String[50];
   
  
    
    

    public static void main(String[] args) {
        initilization_items();
        alignment_maker();
        while (return_to_main == true) {
            return_to_main = false;

            start_of_the_program();

        }

        print_order();
    }

    public static void initilization_items() {
        pizza_initial_items();
        desserts_initial_items();
        garlicbread_initial_items();
        softdrinks_initial_items();
        soups_initial_items();
    }

    public static void pizza_initial_items() {
        pizza[1] = "MEXICAN GREEN WAVE";
        pizza[2] = "FARMHOUSE";
        pizza[3] = "PEPPER BARBECUE FEAST";

        pizza_veg_price[1] = 180;
        pizza_veg_price[2] = 234;
        pizza_veg_price[3] = 320;

        pizza_nonveg_price[1] = 265;
        pizza_nonveg_price[2] = 350;
        pizza_nonveg_price[3] = 400;

    }

    public static void desserts_initial_items() {
        desserts[1] = "ICE CREAM SANDWICH";
        desserts[2] = "CHOCOLATE ECLIAR";
        desserts[3] = "APPLE PIE       ";

        desserts_veg_price[1] = 58;
        desserts_veg_price[2] = 49;
        desserts_veg_price[3] = 84;

        desserts_nonveg_price[1] = 63;
        desserts_nonveg_price[2] = 58;
        desserts_nonveg_price[3] = 95;

    }

    public static void garlicbread_initial_items() {
        garlicbread[1] = "WITH CHEESE";
        garlicbread[2] = "WITHOUT CHEESE";

        garlicbread_veg_price[1] = 120;
        garlicbread_veg_price[2] = 140;

    }

    public static void softdrinks_initial_items() {
        softdrinks[1] = "MIRANDA";
        softdrinks[2] = "PEPSI";
        softdrinks[3] = "COCA-COLA";
        softdrinks[4] = "THUMBS UP";

        softdrinks_veg_price[1] = 30;
        softdrinks_veg_price[2] = 36;
        softdrinks_veg_price[3] = 25;
        softdrinks_veg_price[4] = 37;

    }

    public static void soups_initial_items() {
        soups[1] = "HOT AND SOUR";
        soups[2] = "MUSHROOM";
        soups[3] = "MANCHOW";

        soups_veg_price[1] = 240;
        soups_veg_price[2] = 230;
        soups_veg_price[3] = 200;

        soups_nonveg_price[1] = 270;
        soups_nonveg_price[2] = 280;
        soups_nonveg_price[3] = 250;

    }

    public static void start_of_the_program() {
        System.out.println("#####################WELCOME TO PIZZA PARADISE###############################");
        System.out.println("");
        System.out.println("1.PRESS 1 FOR CUSTOMER LOGIN");
        System.out.println("2.PRESS 2 FOR ADMIN LOGIN");
        System.out.println("3.PRESS 3 TO EXIT");
        int option;
        while (true) {
            try {
                String s_option = obj.nextLine();
                if (s_option.length() == 0) {
                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                    continue;
                }
                option = Integer.parseInt(s_option);

            } catch (InputMismatchException e) {
                obj.nextLine();
                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                continue;
            } catch (Exception e) {
                obj.nextLine();
                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                continue;
            }
            if (option < 1 || option > 3) {
                System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                continue;
            }

            break;
        }

        switch (option) {

            case 1:
                customer_main();
                break;
            case 2:
                admin_main();
                break;

            case 3:
                return_to_main = false;
                break;

        }

    }

    public static void admin_main() {
        System.out.println("1.PRESS 1 TO ENTER ADMIN PASSWORD");
        System.out.println("2.PRESS 2 TO GO TO MAIN MENU");
        int option;
        while (true) {
            try {
                String s_option = obj.nextLine();
                if (s_option.length() == 0) {
                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                    continue;
                }
                option = Integer.parseInt(s_option);

            } catch (InputMismatchException e) {
                obj.nextLine();
                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                continue;
            } catch (Exception e) {
                obj.nextLine();
                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                continue;
            }
            if (option < 1 || option > 2) {
                System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                continue;
            }

            break;
        }

        switch (option) {
            case 1:
                admin_acess_validation();
                break;
            case 2:
                return_to_main = true;
                break;

        }
        if (admin_acess == true) {

            admin_privilages();
        }
        return_to_main = true;
    }

    public static void admin_acess_validation() {
        admin_password_accept:
        while (true) {
            System.out.println("ADMIN PLEASE ENTER YOUR PASSWORD");
            String s = obj.nextLine();
            if (s.equals(admin_password)) {

                System.err.println("ADMIN PERMISSSIONS GRANTED");
                admin_acess = true;
                break;
            } else {
                System.out.println("PLEASE ENTER A CORRECT PASSWORD");
                continue admin_password_accept;
            }

        }

    }

    public static void admin_privilages() {

        System.out.println("");
        System.out.println("");
        while (true) {
            System.out.println("WELCOME ADMIN");

            System.out.println("");
            System.out.println("PRESS 1 TO CHANGE PASSWORD ");
            System.out.println("PRESS 2 TO ADD ITEM(S)");
            System.out.println("PRESS 3 TO REMOVE ITEM(S)");
            System.out.println("PRESS 4 TO EXIT");
            System.out.println("");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > 4) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }

            switch (option) {
                case 1:
                    change_admin_password();
                    break;
                case 2:
                    add_items();
                    continue;

                case 3:
                    remove_items();
                    continue;
                case 4:
                    System.err.println("YOU HAVE BEEN LOOGGED OUT ADMIN");
                    admin_acess = false;
                    return_to_main = true;
                    break;

            }
            break;
        }

    }

    public static void change_admin_password() {

        while (true) {

            System.out.println("PLEASE ENTER YOUR CURRENT PASSWORD");
            String s = obj.nextLine();
            if (s.equals(admin_password)) {
                while (true) {
                    System.out.println("ENTER YOUR NEW PASSWORD");
                    String s_1 = obj.nextLine();
                    if (s_1.equals(admin_password) == true) {
                        System.err.println("THE OLD PASSWORD CAN NOT BE THE NEW PASSWORD");
                        continue;
                    } else {
                        System.out.println("PLEASE RE ENTER YOUR NEW PASSWORD");
                        String s_2 = obj.nextLine();
                        if (s_2.equals(s_1)) {

                            System.out.println("YOUR PASSWORD HAS BEEN SUCESSFULLY CHANGED");
                            admin_password = s_2;
                            s_2 = "";
                            s_1 = "";
                            s = "";
                            System.err.println("YOU HAVE BEEN LOOGGED OUT ADMIN");
                            admin_acess = false;
                            return_to_main = true;
                            break;
                        } else {
                            System.out.println("YOUR PASSWORDS DO NOT MATCH");
                            continue;
                        }
                    }
                }
            } else {
                System.out.println("PLEASE ENTER A CORECT PASSWORD");
                continue;

            }
            break;
        }

    }

    public static void add_items() {
      
        while (true) {
            
                alignment_maker();
            System.out.println("PLEASE SELECT FROM THE BELOW OPTION");
            System.out.println("");
            System.out.println("1.SOUPS");
            System.out.println("2.PIZZA");
            System.out.println("3.GARLIC BREAD");
            System.out.println("4.SOFT DRINKS");
            System.out.println("5.DESERTS");

            System.out.println("");
            System.out.println("6.EXIT");
            System.out.println("");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > 6) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            switch (option) {
                case 1:
                    add_soups();
                    continue;

                case 2:
                    add_pizza();
                    continue;
                case 3:
                    add_garlicbread();
                    continue;
                case 4:
                    add_softdrinks();
                    continue;
                case 5:
                    add_desserts();
                    continue;
                case 6:

                    break;

            }
            break;
        }
    }

    public static void add_soups() {
        soups:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");
            System.out.println("");
            for (int i = 1; i <= soups_pos; i++) {
                System.out.println(i + "." + soups[i] + "\t" + soups_veg_price[i] + "\t" + soups_nonveg_price[i]);

            }

            System.out.println(soups_pos + 1 + ".EXIT");
            System.out.println("");

            System.out.println("PRESS A OR a TO ADD A NEW ITEM ");

            char option;

            while (true) {
                try {
                    option = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                int option_2 = 0;
                try {
                    option_2 = Integer.parseInt(Character.toString(option));
                    if (option_2 == soups_pos + 1) {
                        break soups;
                    }
                } catch (Exception e) {

                }
                if (option != 'A' && option != 'a') {

                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;
            }

            switch (option) {

                case 'a':
                case 'A':
                    while (true) {
                        System.out.println("ENTER THE NEW ITEM'S NAME");
                        String s_1 = obj.nextLine();
                        System.out.println("ENTER THE VEG PRICE");
                        double veg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                veg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("ENTER THE NON-VEG PRICE");

                        double nonveg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                nonveg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("HERE IS THE PREVIEW");
                        System.out.println("ITEM NAME\tVEG\tNON-VEG");
                        System.out.println("");
                        System.out.println(s_1 + "\t" + veg_price + "\t" + nonveg_price);
                        System.out.println("");
                        System.out.println("DO YOU WANT TO FINIALIZE THE ADDITION OF THIS ITEM (Y/N)");
                        char option_1;

                        while (true) {
                            try {
                                option_1 = obj.nextLine().charAt(0);
                                if (option == '\u0000') {
                                    System.out.println("PLEASE ENTER SOME VALID DATA");
                                    continue;
                                }

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                                System.out.println("PLEASE ENTER VALID INPUT");
                                continue;
                            }

                            break;
                        }
                        switch (option_1) {

                            case 'Y':
                            case 'y':
                                System.out.println("THE NEW ITEM ADDITION HAS BEEN FINIALIZED");
                                soups_pos++;
                                soups[soups_pos] = s_1;
                                soups_veg_price[soups_pos] = veg_price;
                                soups_nonveg_price[soups_pos] = nonveg_price;

                                break soups;

                            case 'n':
                            case 'N':
                                continue;

                        }
                        break;

                    }

                    break;
                default:

                    break soups;
            }
        }
    }

    public static void add_desserts() {
        desserts:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");
            System.out.println("");
            for (int i = 1; i <= desserts_pos; i++) {
                System.out.println(i + "." + desserts[i] + "\t" + desserts_veg_price[i] + "\t" + desserts_nonveg_price[i]);

            }

            System.out.println(desserts_pos + 1 + ".EXIT");
            System.out.println("");

            System.out.println("PRESS A OR a TO ADD A NEW ITEM ");

            char option;

            while (true) {
                try {
                    option = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                int option_2 = 0;
                try {
                    option_2 = Integer.parseInt(Character.toString(option));
                    if (option_2 == desserts_pos + 1) {
                        break desserts;
                    }
                } catch (Exception e) {

                }
                if (option != soups_pos + 1 && option != 'A' && option != 'a') {

                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }

                break;
            }

            switch (option) {

                case 'a':
                case 'A':
                    while (true) {
                        System.out.println("ENTER THE NEW ITEM'S NAME");
                        String s_1 = obj.nextLine();
                        System.out.println("ENTER THE VEG PRICE");
                        double veg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                veg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("ENTER THE NON-VEG PRICE");

                        double nonveg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                nonveg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("HERE IS THE PREVIEW");
                        System.out.println("ITEM NAME\tVEG\tNON-VEG");
                        System.out.println("");
                        System.out.println(s_1 + "\t" + veg_price + "\t" + nonveg_price);
                        System.out.println("");
                        System.out.println("DO YOU WANT TO FINIALIZE THE ADDITION OF THIS ITEM (Y/N)");
                        char option_1;

                        while (true) {
                            try {
                                option_1 = obj.nextLine().charAt(0);
                                if (option_1 == '\u0000') {
                                    System.out.println("PLEASE ENTER SOME VALID DATA");
                                    continue;
                                }

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                                System.out.println("PLEASE ENTER VALID INPUT");
                                continue;
                            }

                            break;
                        }
                        switch (option_1) {

                            case 'Y':
                            case 'y':
                                System.out.println("THE NEW ITEM ADDITION HAS BEEN FINIALIZED");
                                desserts_pos++;
                                desserts[desserts_pos] = s_1;
                                desserts_veg_price[desserts_pos] = veg_price;
                                desserts_nonveg_price[desserts_pos] = nonveg_price;

                                break desserts;

                            case 'n':
                            case 'N':
                                continue;

                        }
                        break;

                    }

                    break;
                default:

                    break;
            }
        }
    }

    public static void add_garlicbread() {
        garlicbread:
        while (true) {
            System.out.println("ITEM NAME\tVEG");
            System.out.println("");
            for (int i = 1; i <= garlicbread_pos; i++) {
                System.out.println(i + "." + garlicbread[i] + "\t" + garlicbread_veg_price[i]);

            }

            System.out.println(garlicbread_pos + 1 + ".EXIT");
            System.out.println("");

            System.out.println("PRESS A OR a TO ADD A NEW ITEM ");

            char option;

            while (true) {
                try {
                    option = obj.nextLine().charAt(0);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                int option_2 = 0;
                try {
                    option_2 = Integer.parseInt(Character.toString(option));
                    if (option_2 == garlicbread_pos + 1) {
                        break garlicbread;
                    }
                } catch (Exception e) {

                }
                if (option != garlicbread_pos + 1 && option != 'A' && option != 'a') {

                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }

                break;
            }

            switch (option) {

                case 'a':
                case 'A':
                    while (true) {
                        System.out.println("ENTER THE NEW ITEM'S NAME");
                        String s_1 = obj.nextLine();
                        System.out.println("ENTER THE VEG PRICE");
                        double veg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                veg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }

                        System.out.println("HERE IS THE PREVIEW");
                        System.out.println("ITEM NAME\tVEG");
                        System.out.println("");
                        System.out.println(s_1 + "\t" + veg_price);
                        System.out.println("");
                        System.out.println("DO YOU WANT TO FINIALIZE THE ADDITION OF THIS ITEM (Y/N)");
                        char option_1;

                        while (true) {
                            try {
                                option_1 = obj.nextLine().charAt(0);
                                if (option_1 == '\u0000') {
                                    System.out.println("PLEASE ENTER SOME VALID DATA");
                                    continue;
                                }

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                                System.out.println("PLEASE ENTER VALID INPUT");
                                continue;
                            }

                            break;
                        }
                        switch (option_1) {

                            case 'Y':
                            case 'y':
                                System.out.println("THE NEW ITEM ADDITION HAS BEEN FINIALIZED");
                                garlicbread_pos++;
                                garlicbread[garlicbread_pos] = s_1;
                                garlicbread_veg_price[garlicbread_pos] = veg_price;

                                break garlicbread;

                            case 'n':
                            case 'N':
                                continue;

                        }
                        break;

                    }

                    break;
                default:

                    break;
            }
        }
    }

    public static void add_softdrinks() {
        softdrinks:
        while (true) {
            System.out.println("ITEM NAME\tVEG");
            System.out.println("");
            for (int i = 1; i <= softdrinks_pos; i++) {
                System.out.println(i + "." + softdrinks[i] + "\t" + softdrinks_veg_price[i]);

            }

            System.out.println(softdrinks_pos + 1 + ".EXIT");
            System.out.println("");

            System.out.println("PRESS A OR a TO ADD A NEW ITEM ");

            char option;

            while (true) {
                try {
                    option = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                int option_2 = 0;
                try {
                    option_2 = Integer.parseInt(Character.toString(option));
                    if (option_2 == softdrinks_pos + 1) {
                        break softdrinks;
                    }
                } catch (Exception e) {

                }
                if (option != softdrinks_pos + 1 && option != 'A' && option != 'a') {

                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }

                break;
            }

            switch (option) {

                case 'a':
                case 'A':
                    while (true) {
                        System.out.println("ENTER THE NEW ITEM'S NAME");
                        String s_1 = obj.nextLine();
                        System.out.println("ENTER THE VEG PRICE");
                        double veg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                veg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        };

                        System.out.println("HERE IS THE PREVIEW");
                        System.out.println("ITEM NAME\tVEG");
                        System.out.println("");
                        System.out.println(s_1 + "\t" + veg_price);
                        System.out.println("");
                        System.out.println("DO YOU WANT TO FINIALIZE THE ADDITION OF THIS ITEM (Y/N)");
                        char option_1;

                        while (true) {
                            try {
                                option_1 = obj.nextLine().charAt(0);
                                if (option == '\u0000') {
                                    System.out.println("PLEASE ENTER SOME VALID DATA");
                                    continue;
                                }

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                                System.out.println("PLEASE ENTER VALID INPUT");
                                continue;
                            }

                            break;
                        }
                        switch (option_1) {

                            case 'Y':
                            case 'y':
                                System.out.println("THE NEW ITEM ADDITION HAS BEEN FINIALIZED");
                                softdrinks_pos++;
                                softdrinks[softdrinks_pos] = s_1;
                                softdrinks_veg_price[softdrinks_pos] = veg_price;

                                break softdrinks;

                            case 'n':
                            case 'N':
                                continue;

                        }
                        break;

                    }

                    break;
                default:

                    break;
            }
        }
    }

    public static void add_pizza() {
        pizza:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");
            System.out.println("");
            for (int i = 1; i <= pizza_pos; i++) {
                System.out.println(i + "." + pizza[i] + "\t" + pizza_veg_price[i] + "\t" + pizza_nonveg_price[i]);

            }

            System.out.println(pizza_pos + 1 + ".EXIT");
            System.out.println("");

            System.out.println("PRESS A OR a TO ADD A NEW ITEM ");

            char option;

            while (true) {
                try {
                    option = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                int option_2 = 0;
                try {
                    option_2 = Integer.parseInt(Character.toString(option));
                    if (option_2 == pizza_pos + 1) {
                        break pizza;
                    }
                } catch (Exception e) {

                }
                if (option != pizza_pos + 1 && option != 'A' && option != 'a') {

                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }

                break;
            }

            switch (option) {

                case 'a':
                case 'A':
                    while (true) {
                        System.out.println("ENTER THE NEW ITEM'S NAME");
                        String s_1 = obj.nextLine();
                        System.out.println("ENTER THE VEG PRICE");
                        double veg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                veg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("ENTER THE NON-VEG PRICE");

                        double nonveg_price;
                        while (true) {
                            try {
                                String s_option = obj.nextLine();
                                if (s_option.length() == 0) {
                                    System.out.println("PLEASE ENTER SOME VALID DATA ");
                                    continue;
                                }
                                nonveg_price = Double.parseDouble(s_option);

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            break;
                        }
                        System.out.println("HERE IS THE PREVIEW");
                        System.out.println("ITEM NAME\tVEG\tNON-VEG");
                        System.out.println("");
                        System.out.println(s_1 + "\t" + veg_price + "\t" + nonveg_price);
                        System.out.println("");
                        System.out.println("DO YOU WANT TO FINIALIZE THE ADDITION OF THIS ITEM (Y/N)");
                        char option_1;

                        while (true) {
                            try {
                                option_1 = obj.nextLine().charAt(0);
                                if (option_1 == '\u0000') {
                                    System.out.println("PLEASE ENTER SOME VALID DATA");
                                    continue;
                                }

                            } catch (InputMismatchException e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            } catch (Exception e) {
                                obj.nextLine();
                                System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                                continue;
                            }
                            if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                                System.out.println("PLEASE ENTER VALID INPUT");
                                continue;
                            }

                            break;
                        }
                        switch (option_1) {

                            case 'Y':
                            case 'y':
                                System.out.println("THE NEW ITEM ADDITION HAS BEEN FINIALIZED");
                                pizza_pos++;
                                pizza[pizza_pos] = s_1;
                                pizza_veg_price[pizza_pos] = veg_price;
                                pizza_nonveg_price[pizza_pos] = nonveg_price;

                                break pizza;

                            case 'n':
                            case 'N':
                                continue;

                        }
                        break;

                    }

                    break;
                default:

                    break;
            }
        }
    }

    public static void remove_items() {

        while (true) {
                alignment_maker();
            System.out.println("PLEASE SELECT FROM THE BELOW OPTION");
            System.out.println("");
            System.out.println("1.SOUPS");
            System.out.println("2.PIZZA");
            System.out.println("3.GARLIC BREAD");
            System.out.println("4.SOFT DRINKS");
            System.out.println("5.DESERTS");

            System.out.println("");
            System.out.println("6.EXIT");
            System.out.println("");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > 6) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            switch (option) {
                case 1:
                    remove_soups();
                    continue;

                case 2:
                    remove_pizza();
                    continue;
                case 3:
                    remove_garlicbread();
                    continue;
                case 4:
                    remove_softdrinks();
                    continue;
                case 5:
                    remove_desserts();
                    continue;
                case 6:

                    break;

            }
            break;
        }
    }

    public static void remove_soups() {
        System.out.println("ITEM NAME\tVEG\tNON-VEG");
        System.out.println("");
        for (int i = 1; i <= soups_pos; i++) {
            System.out.println(i + "." + soups[i] + "\t" + soups_veg_price[i] + "\t" + soups_nonveg_price[i]);

        }

        System.out.println(soups_pos + 1 + ".EXIT");
        System.out.println("");
        remove:
        while (true) {
            System.out.println("PRESS THE ITEM SR NO OF THE ITEM TO BE REMOVED");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > soups_pos + 1) {
                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }
                break;
            }
            if (option == soups_pos + 1) {
                break remove;
            }

            System.out.println("ARE YOU SURE ABOUT THIS DELETION ADMIN?(Y/N)");
            char option_1;

            while (true) {
                try {
                    option_1 = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;
            }
            switch (option_1) {

                case 'Y':
                case 'y':
                    for (int i = option; i < soups_pos; i++) {
                        soups[i] = soups[i + 1];
                        soups_nonveg_price[i] = soups_nonveg_price[i + 1];
                        soups_veg_price[i] = soups_veg_price[i + 1];

                    }

                    soups_pos--;
                    System.err.println("THE ITEM HAS BEEN SUCESSFULLY REMOVED");
                    break remove;

                case 'n':
                case 'N':
                    continue remove;

            }

        }

    }

    public static void remove_pizza() {
        System.out.println("ITEM NAME\tVEG\tNON-VEG");
        System.out.println("");
        for (int i = 1; i <= pizza_pos; i++) {
            System.out.println(i + "." + pizza[i] + "\t" + pizza_veg_price[i] + "\t" + pizza_nonveg_price[i]);

        }

        System.out.println(pizza_pos + 1 + ".EXIT");
        System.out.println("");
        remove:
        while (true) {
            System.out.println("PRESS THE ITEM SR NO OF THE ITEM TO BE REMOVED");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > pizza_pos + 1) {
                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }
                if (option == pizza_pos + 1) {
                    break remove;
                }

                System.out.println("ARE YOU SURE ABOUT THIS DELETION ADMIN?(Y/N)");
                char option_1;

                while (true) {
                    try {
                        option_1 = obj.nextLine().charAt(0);
                        if (option == '\u0000') {
                            System.out.println("PLEASE ENTER SOME VALID DATA");
                            continue;
                        }

                    } catch (InputMismatchException e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    } catch (Exception e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    }
                    if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                        System.out.println("PLEASE ENTER VALID INPUT");
                        continue;
                    }

                    break;
                }
                switch (option_1) {

                    case 'Y':
                    case 'y':
                        for (int i = option; i < pizza_pos; i++) {
                            pizza[i] = pizza[i + 1];
                            pizza_nonveg_price[i] = pizza_nonveg_price[i + 1];
                            pizza_veg_price[i] = pizza_veg_price[i + 1];

                        }

                        pizza_pos--;
                        System.err.println("THE ITEM HAS BEEN SUCESSFULLY REMOVED");
                        break remove;

                    case 'n':
                    case 'N':
                        continue remove;

                }

            }
        }

    }

    public static void remove_garlicbread() {
        System.out.println("ITEM NAME\tVEG");
        System.out.println("");
        for (int i = 1; i <= garlicbread_pos; i++) {
            System.out.println(i + "." + garlicbread[i] + "\t" + garlicbread_veg_price[i]);

        }

        System.out.println(garlicbread_pos + 1 + ".EXIT");
        System.out.println("");
        remove:
        while (true) {
            System.out.println("PRESS THE ITEM SR NO OF THE ITEM TO BE REMOVED");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > garlicbread_pos + 1) {
                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }
                break;
            }
            if (option == garlicbread_pos + 1) {
                break remove;
            }

            System.out.println("ARE YOU SURE ABOUT THIS DELETION ADMIN?(Y/N)");
            char option_1;

            while (true) {
                try {
                    option_1 = obj.nextLine().charAt(0);
                    if (option == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;
            }
            switch (option_1) {

                case 'Y':
                case 'y':
                    for (int i = option; i < garlicbread_pos; i++) {
                        garlicbread[i] = garlicbread[i + 1];

                        garlicbread_veg_price[i] = garlicbread_veg_price[i + 1];

                    }

                    garlicbread_pos--;
                    System.err.println("THE ITEM HAS BEEN SUCESSFULLY REMOVED");
                    break remove;

                case 'n':
                case 'N':
                    continue remove;

            }

        }
    }

    public static void remove_softdrinks() {
        System.out.println("ITEM NAME\tVEG");
        System.out.println("");
        for (int i = 1; i <= softdrinks_pos; i++) {
            System.out.println(i + "." + softdrinks[i] + "\t" + softdrinks_veg_price[i]);

        }

        System.out.println(softdrinks_pos + 1 + ".EXIT");
        System.out.println("");
        remove:
        while (true) {
            System.out.println("PRESS THE ITEM SR NO OF THE ITEM TO BE REMOVED");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > softdrinks_pos + 1) {
                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }
                if (option == softdrinks_pos + 1) {
                    break remove;
                }
                System.out.println("ARE YOU SURE ABOUT THIS DELETION ADMIN?(Y/N)");
                char option_1;

                while (true) {
                    try {
                        option_1 = obj.nextLine().charAt(0);
                        if (option == '\u0000') {
                            System.out.println("PLEASE ENTER SOME VALID DATA");
                            continue;
                        }

                    } catch (InputMismatchException e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    } catch (Exception e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    }
                    if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                        System.out.println("PLEASE ENTER VALID INPUT");
                        continue;
                    }

                    break;
                }
                switch (option_1) {

                    case 'Y':
                    case 'y':
                        for (int i = option; i < softdrinks_pos; i++) {
                            softdrinks[i] = softdrinks[i + 1];

                            softdrinks_veg_price[i] = softdrinks_veg_price[i + 1];

                        }

                        softdrinks_pos--;
                        System.err.println("THE ITEM HAS BEEN SUCESSFULLY REMOVED");
                        break remove;

                    case 'n':
                    case 'N':
                        continue remove;

                }

            }
        }

    }

    public static void remove_desserts() {
        System.out.println("ITEM NAME\tVEG\tNON-VEG");
        System.out.println("");
        for (int i = 1; i <= desserts_pos; i++) {
            System.out.println(i + "." + desserts[i] + "\t" + desserts_veg_price[i] + "\t" + desserts_nonveg_price[i]);

        }

        System.out.println(desserts_pos + 1 + ".EXIT");
        System.out.println("");
        remove:
        while (true) {
            System.out.println("PRESS THE ITEM SR NO OF THE ITEM TO BE REMOVED");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > desserts_pos + 1) {
                    System.out.println("PLEAS ENTER VALID INPUT");
                    continue;
                }
                if (option == desserts_pos + 1) {
                    break remove;
                }

                System.out.println("ARE YOU SURE ABOUT THIS DELETION ADMIN?(Y/N)");
                char option_1;

                while (true) {
                    try {
                        option_1 = obj.nextLine().charAt(0);
                        if (option == '\u0000') {
                            System.out.println("PLEASE ENTER SOME VALID DATA");
                            continue;
                        }

                    } catch (InputMismatchException e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    } catch (Exception e) {
                        obj.nextLine();
                        System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                        continue;
                    }
                    if (option_1 != 'Y' && option_1 != 'N' && option_1 != 'y' && option_1 != 'n') {
                        System.out.println("PLEASE ENTER VALID INPUT");
                        continue;
                    }

                    break;
                }
                switch (option_1) {

                    case 'Y':
                    case 'y':
                        for (int i = option; i < desserts_pos; i++) {
                            desserts[i] = desserts[i + 1];
                            desserts_nonveg_price[i] = desserts_nonveg_price[i + 1];
                            desserts_veg_price[i] = desserts_veg_price[i + 1];

                        }

                        desserts_pos--;
                        System.err.println("THE ITEM HAS BEEN SUCESSFULLY REMOVED");
                        break remove;

                    case 'n':
                    case 'N':
                        continue remove;

                }

            }
        }

    }

    public static void customer_main() {

        customer_accept();
    }

    public static void customer_accept() {

       System.out.println("WELCOME TO PIZZA EXPRESS");
        System.out.println("");
        System.out.println("CUSTOMER PLEASE ENTER YOUR NAME");
        while (true) {
            customer_name = obj.nextLine();
            if (customer_name.length() > 20) {
                System.out.println("Please enter a short name ");
            } else {
                break;
            }
        }
        customer_name = customer_name+" ";
        System.out.println(customer_name + "PLEASE ENTER YOUR PHONE NUMBER");

        phone:
        while (true) {
            String s = obj.nextLine();
            if (s.length() != 10) {
                System.out.println(customer_name + "PLEASE ENTER A VALID PHONE NUMBER");
                continue phone;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    if (Character.isDigit(ch) == false) {
                        System.out.println("PLEASE ENTER ONLY DIGITS");
                        continue phone;
                    } else {

                        if (ch < 0) {
                            System.out.println("PLEASE ENTER ONLY POSITIVE NUMBERS");
                            continue phone;
                        } else {
                            customer_number = customer_number + ch;
                        }
                    }

                }
                break;
            }

        }
        System.out.println(customer_name + "THANK YOU FOR YOUR DETAILS");
        System.out.println("");

        customer_privilages();

    }

    public static void customer_privilages() {
        while (true) {
            System.out.println("PLEASE SELECT FROM THE BELOW OPTION");
            System.out.println("");
            System.out.println("1.SOUPS");
            System.out.println("2.PIZZA");
            System.out.println("3.GARLIC BREAD");
            System.out.println("4.SOFT DRINKS");
            System.out.println("5.DESERTS");

            System.out.println("");

            System.out.println("6.EXIT");
            System.out.println("");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > 6) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            switch (option) {
                case 1:
                    order_soups();
                    continue;

                case 2:
                    order_pizza();
                    continue;
                case 3:
                    order_garlicbread();
                    continue;
                case 4:
                    order_softdrinks();
                    continue;
                case 5:
                    order_desserts();
                    continue;
                case 6:

                    break;

            }
            break;
        }

    }

    public static void order_soups() {
        soups:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");

            System.out.println("");
            for (int i = 1; i <= soups_pos; i++) {
                System.out.println(i + "." + soups[i] + "\t" + soups_veg_price[i] + "\t" + soups_nonveg_price[i]);

            }

            System.out.println(soups_pos + 1 + ".EXIT");
            System.out.println("");
            System.out.println(customer_name + "PRESS THE SR NO OF THE RESPECTIVE ITEMS");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > soups_pos + 1) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            if (option == soups_pos + 1) {
                break soups;

            }
            System.out.println(customer_name + "YOU HAVE CHOSEN " + soups[option]);
            System.out.println("");
            System.out.println(customer_name + "PLEASE SELECT V FOR VEG AND N FOR NON-VEG");
            char option_1;
            while (true) {
                try {
                    option_1 = obj.nextLine().charAt(0);
                    if (option_1 == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_1 != 'V' && option_1 != 'N' && option_1 != 'v' && option_1 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;

            }

            switch (option_1) {

                case 'v':
                case 'V':
                    System.out.println(customer_name + "YOU HAVE CHOSEN VEG " + soups[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int veg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            veg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (veg_quantity <= 0 || veg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = soups[option];
                    item_purchased_quantity[item_purchased_pos] = veg_quantity;
                    item_purchased_type[item_purchased_pos] = "VEG";
                    item_purchased_amount[item_purchased_pos] = veg_quantity * soups_veg_price[option];
                     
                    item_purchased_pos = item_purchased_pos + 1;
                   
                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED VEG" + soups[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH SOUPS(Y/N)");
                    char option_3;
                    while (true) {
                        try {
                            option_3 = obj.nextLine().charAt(0);
                            if (option_3 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_3 != 'Y' && option_3 != 'N' && option_3 != 'y' && option_3 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_3 == 'Y' || option_3 == 'y') {
                        continue soups;
                    }
                    if (option_3 == 'N' || option_3 == 'n') {
                        break soups;
                    }

                    break;

                case 'n':
                case 'N':
                    System.out.println(customer_name + "YOU HAVE CHOSEN NON-VEG " + soups[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int nonveg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            nonveg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (nonveg_quantity <= 0 || nonveg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = soups[option];
                    item_purchased_quantity[item_purchased_pos] = nonveg_quantity;
                    item_purchased_type[item_purchased_pos] = "NON-VEG";
                    item_purchased_amount[item_purchased_pos] = nonveg_quantity * soups_nonveg_price[option];
                    item_purchased_pos = item_purchased_pos + 1;

                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED NON-VEG" + soups[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH SOUPS(Y/N)");
                    char option_4;
                    while (true) {
                        try {
                            option_4 = obj.nextLine().charAt(0);
                            if (option_4 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_4 != 'Y' && option_4 != 'N' && option_4 != 'y' && option_4 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_4 == 'Y' || option_4 == 'y') {
                        continue soups;
                    }
                    if (option_4 == 'N' || option_4 == 'n') {
                        break soups;
                    }

                    break;

            }

        }

    }

    public static void order_pizza() {
        pizza:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");

            System.out.println("");
            for (int i = 1; i <= pizza_pos; i++) {
                System.out.println(i + "." + pizza[i] + "\t" + pizza_veg_price[i] + "\t" + pizza_nonveg_price[i]);

            }

            System.out.println(pizza_pos + 1 + ".EXIT");
            System.out.println("");
            System.out.println(customer_name + "PRESS THE SR NO OF THE RESPECTIVE ITEMS");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > pizza_pos + 1) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            if (option == pizza_pos + 1) {
                break pizza;

            }
            System.out.println(customer_name + "YOU HAVE CHOSEN " + pizza[option]);
            System.out.println("");
            System.out.println(customer_name + "PLEASE SELECT V FOR VEG AND N FOR NON-VEG");
            char option_1;
            while (true) {
                try {
                    option_1 = obj.nextLine().charAt(0);
                    if (option_1 == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_1 != 'V' && option_1 != 'N' && option_1 != 'v' && option_1 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;

            }

            switch (option_1) {

                case 'v':
                case 'V':
                    System.out.println(customer_name + "YOU HAVE CHOSEN VEG " + pizza[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int veg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            veg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (veg_quantity <= 0 || veg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = pizza[option];
                    item_purchased_quantity[item_purchased_pos] = veg_quantity;
                    item_purchased_type[item_purchased_pos] = "VEG";
                    item_purchased_amount[item_purchased_pos] = veg_quantity * pizza_veg_price[option];
                    item_purchased_pos = item_purchased_pos + 1;

                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED VEG" + pizza[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH pizza(Y/N)");
                    char option_3;
                    while (true) {
                        try {
                            option_3 = obj.nextLine().charAt(0);
                            if (option_3 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_3 != 'Y' && option_3 != 'N' && option_3 != 'y' && option_3 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_3 == 'Y' || option_3 == 'y') {
                        continue pizza;
                    }
                    if (option_3 == 'N' || option_3 == 'n') {
                        break pizza;
                    }

                    break;

                case 'n':
                case 'N':
                    System.out.println(customer_name + "YOU HAVE CHOSEN NON-VEG " + pizza[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int nonveg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            nonveg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (nonveg_quantity <= 0 || nonveg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = pizza[option];
                    item_purchased_quantity[item_purchased_pos] = nonveg_quantity;
                    item_purchased_type[item_purchased_pos] = "NON-VEG";
                    item_purchased_amount[item_purchased_pos] = nonveg_quantity * pizza_nonveg_price[option];
                    item_purchased_pos = item_purchased_pos + 1;

                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED NON-VEG" + pizza[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH pizza(Y/N)");
                    char option_4;
                    while (true) {
                        try {
                            option_4 = obj.nextLine().charAt(0);
                            if (option_4 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_4 != 'Y' && option_4 != 'N' && option_4 != 'y' && option_4 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_4 == 'Y' || option_4 == 'y') {
                        continue pizza;
                    }
                    if (option_4 == 'N' || option_4 == 'n') {
                        break pizza;
                    }

                    break;

            }

        }

    }

    public static void order_desserts() {
        desserts:
        while (true) {
            System.out.println("ITEM NAME\tVEG\tNON-VEG");

            System.out.println("");
            for (int i = 1; i <= desserts_pos; i++) {
                System.out.println(i + "." + desserts[i] + "\t" + desserts_veg_price[i] + "\t" + desserts_nonveg_price[i]);

            }

            System.out.println(desserts_pos + 1 + ".EXIT");
            System.out.println("");
            System.out.println(customer_name + "PRESS THE SR NO OF THE RESPECTIVE ITEMS");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > desserts_pos + 1) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            if (option == desserts_pos + 1) {
                break desserts;

            }
            System.out.println(customer_name + "YOU HAVE CHOSEN " + desserts[option]);
            System.out.println("");
            System.out.println(customer_name + "PLEASE SELECT V FOR VEG AND N FOR NON-VEG");
            char option_1;
            while (true) {
                try {
                    option_1 = obj.nextLine().charAt(0);
                    if (option_1 == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_1 != 'V' && option_1 != 'N' && option_1 != 'v' && option_1 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;

            }

            switch (option_1) {

                case 'v':
                case 'V':
                    System.out.println(customer_name + "YOU HAVE CHOSEN VEG " + desserts[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int veg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            veg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (veg_quantity <= 0 || veg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = desserts[option];
                    item_purchased_quantity[item_purchased_pos] = veg_quantity;
                    item_purchased_type[item_purchased_pos] = "VEG";
                    item_purchased_amount[item_purchased_pos] = veg_quantity * desserts_veg_price[option];
                    item_purchased_pos = item_purchased_pos + 1;

                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED VEG" + desserts[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH desserts(Y/N)");
                    char option_3;
                    while (true) {
                        try {
                            option_3 = obj.nextLine().charAt(0);
                            if (option_3 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_3 != 'Y' && option_3 != 'N' && option_3 != 'y' && option_3 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_3 == 'Y' || option_3 == 'y') {
                        continue desserts;
                    }
                    if (option_3 == 'N' || option_3 == 'n') {
                        break desserts;
                    }

                    break;

                case 'n':
                case 'N':
                    System.out.println(customer_name + "YOU HAVE CHOSEN NON-VEG " + desserts[option]);
                    System.out.println("");
                    System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
                    int nonveg_quantity;
                    while (true) {
                        try {
                            String s_option = obj.nextLine();
                            if (s_option.length() == 0) {
                                System.out.println("PLEASE ENTER SOME VALID DATA ");
                                continue;
                            }
                            nonveg_quantity = Integer.parseInt(s_option);

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (nonveg_quantity <= 0 || nonveg_quantity > 200) {
                            System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                            continue;
                        }
                        break;
                    }
                    item_purchased_name[item_purchased_pos] = desserts[option];
                    item_purchased_quantity[item_purchased_pos] = nonveg_quantity;
                    item_purchased_type[item_purchased_pos] = "NON-VEG";
                    item_purchased_amount[item_purchased_pos] = nonveg_quantity * desserts_nonveg_price[option];
                    item_purchased_pos = item_purchased_pos + 1;

                    System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED NON-VEG" + desserts[option]);
                    System.out.println("");
                    System.out.println("DO YOU WISH TO CONTINUE WITH desserts(Y/N)");
                    char option_4;
                    while (true) {
                        try {
                            option_4 = obj.nextLine().charAt(0);
                            if (option_4 == '\u0000') {
                                System.out.println("PLEASE ENTER SOME VALID DATA");
                                continue;
                            }

                        } catch (InputMismatchException e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        } catch (Exception e) {
                            obj.nextLine();
                            System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                            continue;
                        }
                        if (option_4 != 'Y' && option_4 != 'N' && option_4 != 'y' && option_4 != 'n') {
                            System.out.println("PLEASE ENTER VALID INPUT");
                            continue;
                        }

                        break;

                    }
                    if (option_4 == 'Y' || option_4 == 'y') {
                        continue desserts;
                    }
                    if (option_4 == 'N' || option_4 == 'n') {
                        break desserts;
                    }

                    break;

            }

        }

    }

    public static void order_softdrinks() {
        softdrinks:
        while (true) {
            System.out.println("ITEM NAME\tVEG");

            System.out.println("");
            for (int i = 1; i <= softdrinks_pos; i++) {
                System.out.println(i + "." + softdrinks[i] + "\t" + softdrinks_veg_price[i]);

            }

            System.out.println(softdrinks_pos + 1 + ".EXIT");
            System.out.println("");
            System.out.println(customer_name + "PRESS THE SR NO OF THE RESPECTIVE ITEMS");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > softdrinks_pos + 1) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            if (option == softdrinks_pos + 1) {
                break softdrinks;

            }

            System.out.println(customer_name + "YOU HAVE CHOSEN " + softdrinks[option]);
            System.out.println("");
            System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
            int veg_quantity;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    veg_quantity = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (veg_quantity <= 0 || veg_quantity > 200) {
                    System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                    continue;
                }
                break;
            }
            item_purchased_name[item_purchased_pos] = softdrinks[option];
            item_purchased_quantity[item_purchased_pos] = veg_quantity;
            item_purchased_type[item_purchased_pos] = "VEG";
            item_purchased_amount[item_purchased_pos] = veg_quantity * softdrinks_veg_price[option];
            item_purchased_pos = item_purchased_pos + 1;

            System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED VEG" + softdrinks[option]);
            System.out.println("");
            System.out.println("DO YOU WISH TO CONTINUE WITH softdrinks(Y/N)");
            char option_3;
            while (true) {
                try {
                    option_3 = obj.nextLine().charAt(0);
                    if (option_3 == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_3 != 'Y' && option_3 != 'N' && option_3 != 'y' && option_3 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;

            }
            if (option_3 == 'Y' || option_3 == 'y') {
                continue softdrinks;
            }
            if (option_3 == 'N' || option_3 == 'n') {
                break softdrinks;
            }

        }

    }

    public static void order_garlicbread() {
        garlicbread:
        while (true) {
            System.out.println("ITEM NAME\tVEG");

            System.out.println("");
            for (int i = 1; i <= garlicbread_pos; i++) {
                System.out.println(i + "." + garlicbread[i] + "\t" + garlicbread_veg_price[i]);

            }

            System.out.println(garlicbread_pos + 1 + ".EXIT");
            System.out.println("");
            System.out.println(customer_name + "PRESS THE SR NO OF THE RESPECTIVE ITEMS");

            int option;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    option = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option < 1 || option > garlicbread_pos + 1) {
                    System.out.println("PLEAS ENTER VALUES UNDER THE GIVEN LIMITATIONS");
                    continue;
                }

                break;
            }
            if (option == garlicbread_pos + 1) {
                break garlicbread;

            }

            System.out.println(customer_name + "YOU HAVE CHOSEN " + garlicbread[option]);
            System.out.println("");
            System.out.println(customer_name + "PLEASE ENTER THE QUANTITY");
            int veg_quantity;
            while (true) {
                try {
                    String s_option = obj.nextLine();
                    if (s_option.length() == 0) {
                        System.out.println("PLEASE ENTER SOME VALID DATA ");
                        continue;
                    }
                    veg_quantity = Integer.parseInt(s_option);

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (veg_quantity <= 0 || veg_quantity > 200) {
                    System.out.println(customer_name + "PLEASE ENTER A REASONABLE QUANTITY");
                    continue;
                }
                break;
            }
            item_purchased_name[item_purchased_pos] = garlicbread[option];
            item_purchased_quantity[item_purchased_pos] = veg_quantity;
            item_purchased_type[item_purchased_pos] = "VEG";
            item_purchased_amount[item_purchased_pos] = veg_quantity * garlicbread_veg_price[option];
            item_purchased_pos = item_purchased_pos + 1;

            System.err.println(customer_name + "YOU HAVE SUCESSFULLY PURCHASED VEG" + garlicbread[option]);
            System.out.println("");
            System.out.println("DO YOU WISH TO CONTINUE WITH garlicbread(Y/N)");
            char option_3;
            while (true) {
                try {
                    option_3 = obj.nextLine().charAt(0);
                    if (option_3 == '\u0000') {
                        System.out.println("PLEASE ENTER SOME VALID DATA");
                        continue;
                    }

                } catch (InputMismatchException e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                } catch (Exception e) {
                    obj.nextLine();
                    System.out.println("PLEASE ENTER A VALID TYPE OF INPUT:");
                    continue;
                }
                if (option_3 != 'Y' && option_3 != 'N' && option_3 != 'y' && option_3 != 'n') {
                    System.out.println("PLEASE ENTER VALID INPUT");
                    continue;
                }

                break;

            }
            if (option_3 == 'Y' || option_3 == 'y') {
                continue garlicbread;
            }
            if (option_3 == 'N' || option_3 == 'n') {
                break garlicbread;
            }

        }

    }

    public static void alignment_soups() {
        int max_soups = soups[1].length();
        for (int i = 1; i <= soups_pos; i++) {
            if (soups[i].length() > max_soups) {
                max_soups = soups[i].length();
            }
        }

        for (int i = 1; i <= soups_pos; i++) {
            if (soups[i].length() < max_soups) {
                for (int j = 1; soups[i].length() <= max_soups; j++) {

                    soups[i] = soups[i] + " ";
                }
            }
        }

    }

    public static void alignment_garlicbread() {
        int max_garlicbread = garlicbread[1].length();
        for (int i = 1; i <= garlicbread_pos; i++) {
            if (garlicbread[i].length() > max_garlicbread) {
                max_garlicbread = garlicbread[i].length();
            }
        }

        for (int i = 1; i <= garlicbread_pos; i++) {
            if (garlicbread[i].length() < max_garlicbread) {
                for (int j = 1; garlicbread[i].length() <= max_garlicbread; j++) {

                    garlicbread[i] = garlicbread[i] + " ";
                }
            }
        }

    }

    public static void alignment_pizza() {
        int max_pizza = pizza[1].length();
        for (int i = 1; i <= pizza_pos; i++) {
            if (pizza[i].length() > max_pizza) {
                max_pizza = pizza[i].length();
            }
        }

        for (int i = 1; i <= pizza_pos; i++) {
            if (pizza[i].length() < max_pizza) {
                for (int j = 1; pizza[i].length() <= max_pizza; j++) {

                    pizza[i] = pizza[i] + " ";
                }
            }
        }

    }

    public static void alignment_softdrinks() {
        int max_softdrinks = softdrinks[1].length();
        for (int i = 1; i <= softdrinks_pos; i++) {
            if (softdrinks[i].length() > max_softdrinks) {
                max_softdrinks = softdrinks[i].length();
            }
        }

        for (int i = 1; i <= softdrinks_pos; i++) {
            if (softdrinks[i].length() < max_softdrinks) {
                for (int j = 1; softdrinks[i].length() <= max_softdrinks; j++) {

                    softdrinks[i] = softdrinks[i] + " ";
                }
            }
        }

    }

    public static void alignment_desserts() {
        int max_desserts = desserts[1].length();
        for (int i = 1; i <= desserts_pos; i++) {
            if (desserts[i].length() > max_desserts) {
                max_desserts = desserts[i].length();
            }
        }

        for (int i = 1; i <= desserts_pos; i++) {
            if (desserts[i].length() < max_desserts) {
                for (int j = 1; desserts[i].length() <= max_desserts; j++) {

                    desserts[i] = desserts[i] + " ";
                }
            }
        }

    }

    public static void alignment_maker() {
        alignment_soups();
        alignment_pizza();
        alignment_desserts();
        alignment_garlicbread();
        alignment_softdrinks();
    }

    public static void print_order() {
        System.out.println("CUSTOMER NAME:" + customer_name);
        System.out.println("CUSTOMER'S CONTACT NUMBER:" + customer_number);
        System.out.println("");
         
      
        for (int i = 1; i <item_purchased_pos; i++) {
            String s="";
            s = s+item_purchased_amount[i];
            item_purchased_amount1[i]=s;
            
        }
        for (int i = 1; i <item_purchased_pos; i++) {
            String s="";
            s = s+item_purchased_quantity[i];
            item_purchased_quantity1[i]=s;
            
        }
 
        
        for (int i = 1; i <item_purchased_pos; i++) {
           item_purchased_name[i]=item_purchased_name[i].trim();
        }
        
        //
        
 int max_item_purchased_type = item_purchased_type[1].length();
        for (int i = 1; i <item_purchased_pos; i++) {
            if (item_purchased_type[i].length()> max_item_purchased_type) {
                max_item_purchased_type = item_purchased_type[i].length();
            }
        }
   for (int i = 1; i < item_purchased_pos; i++) {
            if (item_purchased_type[i].length() < max_item_purchased_type) {
                for (; item_purchased_type[i].length() <= max_item_purchased_type;) {

                    item_purchased_type[i] = item_purchased_type[i] + " ";
                }
            }
        }
   //
   
   
   
    int max_item_purchased_amount = item_purchased_amount1[1].length();
        for (int i = 1; i <item_purchased_pos; i++) {
            if (item_purchased_amount1[i].length()> max_item_purchased_amount) {
                max_item_purchased_amount = item_purchased_amount1[i].length();
            }
        }
        
         for (int i = 1; i < item_purchased_pos; i++) {
            if (item_purchased_amount1[i].length()<= max_item_purchased_amount) {
                for (int j = 1; item_purchased_amount1[i].length() <= max_item_purchased_amount; j++) {

                    item_purchased_amount1[i] = item_purchased_amount1[i] + " ";
                }
            }
        }
         //
         
         
         String item_quantity = "QUANTITY";
         for (int i = 1; i < item_purchased_pos; i++) {
            if (item_purchased_quantity1[i].length()<item_quantity.length() ) {
                for (; item_purchased_quantity1[i].length() <=item_quantity.length();) {

                    item_purchased_quantity1[i] = item_purchased_quantity1[i] + " ";
                }
            }
        }
         //
         
   
        
      int max_item_purchased_name = item_purchased_name[1].length();
        for (int i = 1; i <item_purchased_pos; i++) {
            if (item_purchased_name[i].length()> max_item_purchased_name) {
                max_item_purchased_name = item_purchased_name[i].length();
            }
        }
        
       

        for (int i = 1; i < item_purchased_pos; i++) {
            if (item_purchased_name[i].length() <= max_item_purchased_name) {
                for (; item_purchased_name[i].length() <= max_item_purchased_name;) {

                    item_purchased_name[i] = item_purchased_name[i] + " ";
                }
            }
        }
        String item_name = "ITEM PURCHASED";
        while(item_name.length()<=max_item_purchased_name)
        {
            item_name= item_name+" ";
        }
        String item_type = "TYPE";
        while(item_type.length()<=max_item_purchased_type)
        {
            item_type= item_type+" ";
        }
        
     
        
        String space= "         ";
        
        
        System.out.println(item_name+"\t"+item_type+"\t"+item_quantity+"\t  AMOUNT");
        System.out.println("");
        for (int i = 1; i < item_purchased_pos; i++) {
            System.out.println(item_purchased_name[i]+ "\t"+item_purchased_type[i]+space+ item_purchased_quantity1[i]+space+item_purchased_amount1[i]);
            System.out.println("===========================================================================================================================================");
        }
        
        System.out.println("");
        System.out.println("");
        double total = 0;
        for (int i = 1; i < item_purchased_pos; i++) {
            total = total + item_purchased_amount[i];
        }
        System.out.println("THE TOTAL IS:" + total);

        System.out.println("THANK YOU FOR USING OUR SOFTWARE");
    }
}
