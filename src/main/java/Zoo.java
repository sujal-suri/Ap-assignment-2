import java.util.*;

public class Zoo {
    List<Attractions> attractionsList=new ArrayList<Attractions>();
    List<Animal> animalList=new ArrayList<Animal>();
    List<Discount> discountsList=new ArrayList<Discount>();
    public Zoo(){

    }
    public void viewAttraction(){
        System.out.println("Attractions in the Zoo:");
        for(int i=0;i<attractionsList.size();i++){
            System.out.println(1+"."+" "+attractionsList.get(i).getDetails());
        }
    }
}
