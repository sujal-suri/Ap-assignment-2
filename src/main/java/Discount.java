public class Discount {
    public String getCategory() {
        return Category;
    }

    String Category;
    int percentage;
    public Discount(String cat,int per){
        this.Category=cat;
        this.percentage=per;
    }
    public void modify(){
        System.out.println("Enter new Category: ");
        this.Category=Main.scanner.nextLine();
        System.out.println("Enter discount percentage: ");
        this.percentage=Main.scanner.nextInt();
        Main.scanner.nextLine();
    }
}
