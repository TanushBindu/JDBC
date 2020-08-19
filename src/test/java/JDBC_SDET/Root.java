package JDBC_SDET;

public class Root
{
    private String location;

    private String purchasedDate;

    private int amount;

    private String courseName;

    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }
    public void setPurchasedDate(String purchasedDate){
        this.purchasedDate = purchasedDate;
    }
    public String getPurchasedDate(){
        return this.purchasedDate;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return this.courseName;
    }
}
