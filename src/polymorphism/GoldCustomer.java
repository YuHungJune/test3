package polymorphism;

public class GoldCustomer extends Customer{

    double salesRatio;

    GoldCustomer(int customerID, String customerName){
        super(customerID, customerName);

        customerGrade = "GOlD";
        bonusRatio = 0.02;
        salesRatio = 0.1;
    }

    public int calcPrice(int price){
        bonusPoint += (price * bonusRatio);
        return price - (int)(price * salesRatio);
    }

}
