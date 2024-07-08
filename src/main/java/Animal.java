abstract public class Animal {
    String Name;
    String Type;
    String roar;
    String description;
    abstract public void feed();
    abstract public void description();
    abstract public String getName();
    abstract public void editAnimal();
}

class Mammal extends Animal{
    public String getName() {
        return Name;
    }

    private String Name;
    private String Type;
    private String roar;
    private String description;
    public void editAnimal(){
        System.out.println("Enter new Name: ");
        this.Name=Main.scanner.nextLine();
        System.out.println("Enter new Description: ");
        this.description=Main.scanner.nextLine();
        System.out.println("Enter new sound: ");
        this.roar=Main.scanner.nextLine();
    }
    public Mammal(String name,String type,String sound,String description){
        this.Name=name;
        this.Type=type;
        this.roar=sound;
        this.description=description;
    }
    public void feed(){
        System.out.println(roar);
    }
    public void description(){
        System.out.println(description);
    }
}

class Reptile extends Animal{
    private String Name;
    private String Type;
    private String roar;
    private String description;
    public Reptile(String name,String type,String sound,String description){
        this.Name=name;
        this.Type=type;
        this.roar=sound;
        this.description=description;
    }
    public void editAnimal(){
        System.out.println("Enter new Name: ");
        this.Name=Main.scanner.nextLine();
        System.out.println("Enter new Description: ");
        this.description=Main.scanner.nextLine();
        System.out.println("Enter new sound: ");
        this.roar=Main.scanner.nextLine();
    }
    public void feed(){
        System.out.println(roar);
    }
    public void description(){
        System.out.println(description);
    }
    public String getName() {
        return Name;
    }
}

class Amphibians extends Animal{
    private String Name;
    private String Type;
    private String roar;
    private String description;
    public Amphibians(String name,String type,String sound,String description){
        this.Name=name;
        this.Type=type;
        this.roar=sound;
        this.description=description;
    }
    public void editAnimal(){
        System.out.println("Enter new Name: ");
        this.Name=Main.scanner.nextLine();
        System.out.println("Enter new Description: ");
        this.description=Main.scanner.nextLine();
        System.out.println("Enter new sound: ");
        this.roar=Main.scanner.nextLine();
    }
    public void feed(){
        System.out.println(roar);
    }
    public void description(){
        System.out.println(description);
    }
    public String getName() {
        return Name;
    }
}