import java.util.Objects;

public class Admin {
    SpecialDiscounts SplDeals;
    private Zoo Zootopia;
    public Admin(Zoo myZoo){
        Zootopia=myZoo;
    }
    public void doStuff(){
        boolean done=false;
        while(!done){
            ApplicationInterface.adminInterface();
            switch (Main.takeChoice(8)) {
                case 1 -> {
                    ApplicationInterface.attractionInterface();
                    switch(Main.takeChoice(5)){
                        case 1:{
                            addAttraction();
                        }
                        case 2:{
                            viewAttraction();
                        }
                        case 3:{
                            modifyAttraction();
                        }
                        case 4:{
                            deleteAttraction();
                        }
                        case 5:{
                            ;
                        }
                    }

                }
                case 2 -> {
                    ApplicationInterface.animalInterface();
                    switch (Main.takeChoice(4)){
                        case 1:{
                            addAnimal();
                        }
                        case 2:{
                            updateAnimal();
                        }
                        case 3:{
                            removeAnimal();
                        }
                        case 4:{
                            ;
                        }
                    }
                }
                case 3 -> {

                }
                case 4 -> {
                    ApplicationInterface.discountInterface();
                    int choice = Main.takeChoice(4);
                    switch (choice){
                        case 1:{
                            System.out.println("Enter discount category: ");
                            String cat=Main.scanner.nextLine();
                            System.out.println("Enter discount percentage: ");
                            int percentage=Main.scanner.nextInt();
                            Main.scanner.nextLine();
                            Discount dis=new Discount(cat,percentage);
                            Zootopia.discountsList.add(dis);
                            System.out.println("Discount is successfully added");
                        }
                        case 2:{
                            viewDiscount();
                            System.out.println("Enter discount index to modify: ");
                            int index=Main.takeChoice(Zootopia.discountsList.size());
                            Zootopia.discountsList.get(index).modify();
                        }
                        case 3:{
                            viewDiscount();
                            System.out.println("Enter discount index to delete: ");
                            int index = Main.takeChoice(Zootopia.discountsList.size());
                            Zootopia.discountsList.remove(index);
                            System.out.println("Discount is successfully deleted");
                        }
                        case 4:{

                        }
                    }
                }
                case 5 -> {

                }
                case 6 -> {
                    System.out.println("Visitor Statistics: ");
                    System.out.println("-Total Visitor: 1200");
                    System.out.println("-Total Revenue: $15,000");
                    System.out.println("-Most popular attraction : Jungle safari");
                }
                case 7 -> {

                }
                case 8 ->{
                    System.out.println("Logging out");
                    done = true;
                }
            }
        }
    }
    public void addAttraction(){
        System.out.println("Enter Attraction Name: ");
        String name=Main.scanner.nextLine();
        System.out.println("Enter Attraction Description: ");
        String des=Main.scanner.nextLine();
        Attractions att=new Attractions(name,des);
        Zootopia.attractionsList.add(att);
        System.out.println("Attraction Added Successfully!");
    }
    public void viewAttraction(){
        System.out.println("Attractions in the Zoo:");
        for(int i=0;i<Zootopia.attractionsList.size();i++){
            System.out.println(1+"."+" "+Zootopia.attractionsList.get(i).getDetails());
        }
    }
    public void modifyAttraction(){
        viewAttraction();
        System.out.println("Enter index to modify: ");
        int choice=Main.takeChoice(Zootopia.attractionsList.size());
        Zootopia.attractionsList.get(choice).modify();
    }
    public void deleteAttraction(){
        viewAttraction();
        System.out.println("Enter the index to remove: ");
        int choice=Main.takeChoice(Zootopia.attractionsList.size());
        Zootopia.attractionsList.remove(choice-1);
        System.out.println("Attraction removed Successfully!");
    }
    public void addAnimal(){
        System.out.println("Enter Animal Name: ");
        String Name=Main.scanner.nextLine();
        System.out.println("Enter Animal Type: ");
        String type=Main.scanner.nextLine();
        System.out.println("Enter Animal Description: ");
        String des=Main.scanner.nextLine();
        System.out.println("Enter Animal roar: ");
        String sound=Main.scanner.nextLine();
        if(Objects.equals(type, "Mammal")|| Objects.equals(type, "mammal")){
            Animal ani=new Mammal(Name,type,sound,des);
            Zootopia.animalList.add(ani);
        }
        else if(Objects.equals(type, "Reptile") || Objects.equals(type, "reptile")){
            Animal ani=new Reptile(Name,type,sound,des);
            Zootopia.animalList.add(ani);
        }
        else if(Objects.equals(type, "Amphibians") || Objects.equals(type, "amphibians")){
            Animal ani=new Amphibians(Name,type,sound,des);
            Zootopia.animalList.add(ani);
        }
        else{
            System.out.println("invalid type provided");
            return;
        }
        System.out.println("Animal successfully Added");
    }
    public void updateAnimal(){
        System.out.println("Select Index of animal to update");
        for(int i=0;i<Zootopia.animalList.size();i++){
            System.out.println(i+"."+Zootopia.animalList.get(i).getName());
        }
        int choice=Main.takeChoice(Zootopia.animalList.size());
        Zootopia.animalList.get(choice).editAnimal();
    }
    public void removeAnimal(){
        System.out.println("Select Index of animal to remove");
        for(int i=0;i<Zootopia.animalList.size();i++){
            System.out.println(i+"."+Zootopia.animalList.get(i).getName());
        }
        int choice=Main.takeChoice(Zootopia.animalList.size());
        Zootopia.animalList.remove(choice-1);
    }
    public void viewDiscount(){
        for(int i=0;i<Zootopia.discountsList.size();i++){
            System.out.println(i+"."+Zootopia.discountsList.get(i).getCategory());
        }
    }
}
