public class SpecialDiscounts {
    private String [] Discounts;
    private int count;
    private int DiscountRate[];
    private int DiscountNumber[];
    public SpecialDiscounts(int number){
        this.count=0;
        this.DiscountRate=new int[number];
        this.DiscountNumber=new int[number];
        this.Discounts=new String[number];
    }
    public void getDiscounts(){
        for(int i=0;i<count;i++){
            System.out.println(Discounts[i]);
        }
    }
    public void SetDiscounts(){
        System.out.print("Enter Discount description: ");
        String offer=Main.scanner.nextLine();
        System.out.print("Enter Number of tickets: ");
        int number=Main.scanner.nextInt();
        Main.scanner.nextLine();
        System.out.print("Enter Discount Percentage: ");
        int percentage=Main.scanner.nextInt();
        Main.scanner.nextLine();
        Discounts[count]=offer;
        DiscountNumber[count]=number;
        DiscountRate[count]=percentage;
        count++;
    }
}
