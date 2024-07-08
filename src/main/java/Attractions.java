public class Attractions {
    private String Name;

    public String getDescription() {
        return Description;
    }

    private String Description;
    public Attractions(String Name,String Description){
        this.Name=Name;
        this.Description=Description;
    }
    public String getDetails(){
        return this.Name;
    }
    public void modify(){
        System.out.println("Enter new name: ");
        this.Name=Main.scanner.nextLine();
        System.out.println("Enter new Description: ");
        this.Description=Main.scanner.nextLine();
    }

}
