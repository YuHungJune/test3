package inheritance;

public class CustomerTest {
    public static void main(String[] args){

        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        int priceLee = customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee);


        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        int priceKim = customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim);

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + "지불금액은 " + priceNo);

    }
}
