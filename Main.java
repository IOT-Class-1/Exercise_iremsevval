package mextDay2;

public class Main {
    public static void main(String[] args){
        Engineer employeeOne = new Engineer("İrem Şevval Kaya" , 100000, 22);
        SalesPerson employeeTwo = new SalesPerson("Şeymanur Kaya" , 80000, 21, .25);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();

        System.out.println(employeeOne.salary);
        System.out.println(employeeOne.getAnnualBonus());
        System.out.println(employeeTwo.salary);
        System.out.println(employeeTwo.getCommissionPercentage());
    }
}
