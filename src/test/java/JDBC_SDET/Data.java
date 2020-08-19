package JDBC_SDET;

public class Data
{
    private String CourseName;

    private String PurchasedDate;

    private int Amount;

    private String Location;

    public void setCourseName(String CourseName){
        this.CourseName = CourseName;
    }
    public String getCourseName(){
        return this.CourseName;
    }
    public void setPurchasedDate(String PurchasedDate){
        this.PurchasedDate = PurchasedDate;
    }
    public String getPurchasedDate(){
        return this.PurchasedDate;
    }
    public void setAmount(int Amount){
        this.Amount = Amount;
    }
    public int getAmount(){
        return this.Amount;
    }
    public void setLocation(String Location){
        this.Location = Location;
    }
    public String getLocation(){
        return this.Location;
    }
}