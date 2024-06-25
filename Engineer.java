package mextDay2;

public class Engineer extends Employee{
    public Engineer(String name, double salary, int age){
        super(name, salary, age);
        //isim, maaş ve yaş bilgilerini employee sınıfından
        //miras aldığı için "super" anahtar kelimesiyle çağırıyoruz
    }
    public double getAnnualBonus(){
        return super.salary*.05;
    }
}
