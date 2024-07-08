public class ApplicationInterface {
    public static void adminInterface(){
        System.out.println("Admin Menu:");
        System.out.println("-----------------------------");
        System.out.println("1.  Manage Attractions");
        System.out.println("2.  Manage Animals");
        System.out.println("3.  Schedule Events");
        System.out.println("4.  Set Discounts");
        System.out.println("5.  Set Special Deal");
        System.out.println("6.  View Visitor Stats");
        System.out.println("7.  View Feedback");
        System.out.println("8.  Exit");
        System.out.println("-----------------------------");
    }
    public static void attractionInterface(){
        System.out.println("1.  Add attractions");
        System.out.println("2.  View attractions");
        System.out.println("3.  Modify attractions");
        System.out.println("4.  Remove attraction");
        System.out.println("5.  Exit");
    }
    public static void loginInterface(){
        System.out.println("Welcome to ZOOtopia");
        System.out.println("----------------------------");
        System.out.println("1.  Enter as admin");
        System.out.println("2.  Enter as visitor");
        System.out.println("3.  View Special Deals");
        System.out.println("4.  Exit");
        System.out.println("----------------------------");
    }
    public static void userInterface(){
        System.out.println("User Menu");
        System.out.println("-----------------------------");
        System.out.println("1.  Explore the Zoo");
        System.out.println("2.  Buy Membership");
        System.out.println("3.  Buy Tickets");
        System.out.println("4.  View Discounts");
        System.out.println("5.  View Special Deals");
        System.out.println("6.  Visit Animals");
        System.out.println("7.  Visit Attractions");
        System.out.println("8.  Leave Feedback");
        System.out.println("9.  Log out");
        System.out.println("-----------------------------");
    }
    public static void animalInterface(){
        System.out.println("Manage animals: ");
        System.out.println("1.  Add animal");
        System.out.println("2.  Update Animals Details");
        System.out.println("3.  Remove Animals");
        System.out.println("4.  Exit");
    }
    public static void discountInterface(){
        System.out.println("Set Discount: ");
        System.out.println("1.  Add discount");
        System.out.println("2.  Modify discount");
        System.out.println("3.  Remove discount");
        System.out.println("4.  Exit");
    }
    public static void exploreInterface(){
        System.out.println("Explore the Zoo");
        System.out.println("1.  View Attraction");
        System.out.println("2.  View Animals");
        System.out.println("3.  Exit");
    }
    public static void membershipInterface(){
        System.out.println("Buy membership: ");
        System.out.println("1.  Basic Membership($20)");
        System.out.println("2.  Premium Membership($50)");
    }
}
