import java.util.Objects;

class User {
    Zoo Zootopia;
    LoginInfo tourist;
    public User(LoginInfo tourist,Zoo zoo){
        this.Zootopia=zoo;
        this.tourist=tourist;

    }
    public void doStuff(){
        boolean done=false;
        while(!done){
            ApplicationInterface.userInterface();
            int choice=Main.takeChoice(9);
            switch (choice){
                case 1:{
                    boolean quit=false;
                    while(!quit) {
                        ApplicationInterface.exploreInterface();
                        switch (Main.takeChoice(3)) {
                            case 1: {
                                Zootopia.viewAttraction();
                                System.out.println("Enter choice: ");
                                int index = Main.scanner.nextInt();
                                Main.scanner.nextLine();
                                System.out.println(Zootopia.attractionsList.get(index).getDescription());
                            }
                            case 2: {

                            }
                            case 3: {
                                quit=true;
                            }
                        }
                    }
                }
                case 2:{
                    ApplicationInterface.membershipInterface();
                    int index=Main.takeChoice(2);
                    System.out.println("Enter Discount Code: (write NA otherwise) ");
                    String code=Main.scanner.nextLine();
                    int discount=0;
                    if(!Objects.equals(code, "NA")){
                        for(int i=0;i<Zootopia.discountsList.size();i++){
                            if(Objects.equals(Zootopia.discountsList.get(i).getCategory(), code)) {
                                discount = Zootopia.discountsList.get(i).percentage;
                            }
                        }
                        if(discount==0){
                            System.out.println("Invalid code provided");
                            break;
                        }
                    }
                    if(index==1){
                        int cost=20-20*discount/100;
                        if(tourist.getBalance()>=cost){
                            tourist.setBalance(tourist.getBalance()-cost);
                            tourist.setMembership(1);
                        }
                        else{
                            System.out.println("Insufficient Balance in your wallet");
                        }
                    }
                    else{
                        int cost=50-50*discount/100;
                        if(tourist.getBalance()>=cost){
                            tourist.setBalance(tourist.getBalance()-cost);
                            tourist.setMembership(2);
                        }
                        else{
                            System.out.println("Insufficient Balance in your wallet");
                        }
                    }
                    System.out.println("Your membership is successfully purchased. Your balance is "+tourist.getBalance());
                }
                case 3:{

                }
                case 4:{

                }
                case 5:{

                }
                case 6:{

                }
                case 7:{

                }
                case 8:{

                }
                case 9:{
                    System.out.println("Logging out");
                    done=true;
                }
            }
        }
    }

}
