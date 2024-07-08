import java.util.*;

public class Main {
    static int user_count=0;
    static LoginInfo [] users;
    private final AdminInfo Details=new AdminInfo();
    static Zoo ZooTopia;
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args){
        users=new LoginInfo[10];
        Admin admin_instance = new Admin(ZooTopia);
        boolean quit=false;
        while(!quit){
            ApplicationInterface.loginInterface();
            switch (Main.takeChoice(4)) {
                case 1 -> {
                    if (Main.checkAdminLogin()) {
                        admin_instance.doStuff();
                    } else {
                        System.out.println("Invalid password provided");
                    }
                }
                case 2 -> {
                    userLoginOption();
                    if (takeChoice(2) == 1) {
                        Main.createUser();
                    } else {
                        int index=checkUserLogin();
                        if(index>=0){
                            User tourist = new User(users[index],ZooTopia);
                            tourist.doStuff();
                        }
                        else{
                            System.out.println("Invalid user provided");
                        }
                    }
                }
                case 3 -> {
                    
                }
                case 4 -> quit = true;
            }


        }
        System.out.println("Thank you for visiting!!");
    }

    public static boolean checkAdminLogin(){
        System.out.print("Enter Admin UserName: ");
        String input_Name=scanner.nextLine();
        System.out.print("Enter Admin UserName: ");
        String input_Passwd=scanner.nextLine();
        LoginInfo adminInput=new LoginInfo(input_Name,input_Passwd);
        return AdminInfo.equals(adminInput);
    }
    public static void createUser(){
        boolean done=false;
        while(!done) {
            try {
                System.out.print("Enter User Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter User Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter User Phone: ");
                String number= scanner.nextLine();
                System.out.print("Enter User Balance: ");
                int bal=scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter User Email: ");
                String mail=scanner.nextLine();
                System.out.print("Enter User Password: ");
                String passwd=scanner.nextLine();
                LoginInfo tourist=new LoginInfo(name,passwd,age,mail,number,bal);
                users[user_count]=tourist;
                user_count++;
                System.out.println("User created successfully");
                done=true;
            }
            catch(InputMismatchException error){
                System.out.println(error.getMessage());
                scanner.nextLine();
            }
        }
    }
    public static void userLoginOption(){
        System.out.println("1.  Register");
        System.out.println("2.  Login");
    }
    public static int checkUserLogin(){
        LoginInfo tourist;
        try {
            System.out.print("Enter User Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter User Password: ");
            String passwd = scanner.nextLine();
            tourist=new LoginInfo(name,passwd);
        }
        catch(InputMismatchException error){
            System.out.println(error.getMessage());
            scanner.nextLine();
            return -1;
        }
        for(int i=0;i<user_count;i++){
            if(tourist.equals(users[i])){
                return i;
            }
        }
        return -1;
    }
    public static int takeChoice(int list){
        boolean done = false;
        int choice=0;
        while(!done){
            try{
                System.out.print("Enter you choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                if(choice<1 || choice>list){
                    String errMessage=String.format("The choice should be between 1 and %d",list);
                    throw new ChoiceException(errMessage);
                }
                done = true;
            }
            catch(InputMismatchException error){
                System.out.println("Input should be a integer.");
                scanner.nextLine();
            }
            catch(ChoiceException error){
                System.out.println(error.getMessage());
            }
        }
        return choice;
    }
}

class ChoiceException extends Exception{
    ChoiceException(String error_message){
        super(error_message);
    }
    public String toString(){
        return super.getMessage();
    }
}

class AdminInfo{
    final private static String passwd="Admin123";
    final private static String admin_Name="Admin";
    public static boolean equals(LoginInfo details) {
        return Objects.equals(details.getPasswd(), AdminInfo.passwd) &&
                Objects.equals(details.getName(), AdminInfo.admin_Name);
    }
}

class LoginInfo{
    private final String name;
    private final String passwd;
    private int age;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private int balance;
    private String e_mail;
    private String phone;

    public int getMembership() {
        return membership;
    }

    public void setMembership(int membership) {
        this.membership = membership;
    }

    private int membership;
    public int getAge() {
        return age;
    }
    public int getBalance() {
        return balance;
    }
    public String getE_mail() {
        return e_mail;
    }
    public String getPhone() {
        return phone;
    }
    public String getName() {
        return name;
    }
    public String getPasswd() {
        return passwd;
    }
    LoginInfo(String name,String passwd){
        this.name=name;
        this.passwd=passwd;
    }
    LoginInfo(String name,String passwd,int age,String mail,String number,int bal){
        this.name=name;
        this.passwd=passwd;
        this.age=age;
        this.balance=bal;
        this.e_mail=mail;
        this.phone=number;
        this.membership=0;
    }
    public boolean equals(LoginInfo info){
        return Objects.equals(this.name, info.getName())&& Objects.equals(this.passwd, info.getPasswd());
    }
}