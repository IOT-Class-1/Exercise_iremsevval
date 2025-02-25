package mextDay2;

public class SalesPerson extends Employee{
    private double commissionPercentage;

    public SalesPerson(String name, double salary, int age, double commissionPercentage){
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }
    public double getCommissionPercentage(){
        return this.commissionPercentage;
    }
    public void raiseCommissio(){
        if(this.commissionPercentage < .30){ // .30 = 0.30 or %30
            this.commissionPercentage = this.commissionPercentage *1.2;
        }
    }
}
