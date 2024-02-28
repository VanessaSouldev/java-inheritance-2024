public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Vanessa", "Strich", new MasterCard(3500));

        customer.printName();

        customer.getCreditCard().pay(100);

        System.out.println(customer.getCreditCard().getDebt());


        Customer customer2 = new Customer("Piet", "Anders",new VisaCard (3250));

        customer2.printName();
    }
}
