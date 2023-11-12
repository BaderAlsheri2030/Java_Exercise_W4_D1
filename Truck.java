public class Truck implements Vehicle{
    private String type;
    private int week;


    public Truck() {
    }

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public double calculateRentalCost(){
        return week*500.0;
    }
    public void displayDetails(){
        System.out.println("Truck Type: "+getType());
        System.out.println("Weekly Rental Rate: $500.0");
        System.out.println("Rental Cost: $"+calculateRentalCost());

    }
}
