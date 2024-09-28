public class main {

    public static void main(String[] args) {
        //WORKS
        MoneyMarketAccount sharpay = new MoneyMarketAccount("Sharpay", 1,200000, 4.25);
        System.out.println(sharpay.getInterestRate());


        //WORKS
        Account troy = new SavingsAccount("Troy",2,3000,1.125);
        System.out.println(troy.getBalance());


        //Throws Expected error written in SavingsAccount class
        Account troy1 = new SavingsAccount("Troy1", 2,3000,1.125);
        //troy1.withdraw(5000);
        System.out.println(troy1.getBalance());


        //WORKS
        Account kelsi = new SavingsAccount("Kelsi", 3,500,1.125);
        System.out.println(kelsi.getAccountInfo());

        
        //Does not work because calculateIntrest() method is only in IntrestBearing interface and
        // CheckingAccount does not implement it
        //CheckingAccount darbus = new MoneyMarketAccount("MRS_Darbus", 4, 10000, 4.25);
        //darbus.calculateIntrest(365)


        //Does not work because CheckingAccount does not implement IntrestBearing interface
        //InterestBearing chad = new CheckingAccount("Chad", 5,777);
        //System.out.println(chad.getInterestRate());

        //WORKS
        InterestBearing ryan = new SavingsAccount("Ryan" , 6,40000, 1.125);
        System.out.println(ryan.getInterestRate());


        //Does not work because this object can only get methods from IntrestBearing interface.
        //InterestBearing gabby = new MoneyMarketAccount("Gabby", 1000, 7,4.25);
        //System.out.println((MoneyMarketAccount)gabby.getAcccountInfo());


        //Does not work because getIntrestRate is only in IntrestBearing Interface
        //CheckingAccount taylor = new CheckingAccount("Taylor",8,7000);
        //System.out.println((InterestBearing)taylor.getIntrestRate());


        // WORKS
        //InterestBearing newOne = new MoneyMarketAccount("Boop" , 6,40000, 1.125);
       // newOne.calculateInterest(300);
    }

}
