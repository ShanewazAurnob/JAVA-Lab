class Employee {
    private String firstName;
    private String lastName;
    private String ID;
    private double basicSalary, incRate;

    protected Employee(String fname, String lname, String id, double bs, double inc) {
        firstName = fname;
         lastName = lname;
         ID = id;
         basicSalary = bs;
         incRate = inc;
     }

     String getFirstName() { return firstName; }
     String getLastName() { return lastName; }
     String getID() { return ID; }
     double getBasicSalary() { return basicSalary; }
     double getIncRate() { return incRate; }
 }

 class HouseRent extends Employee {
     private double houseRentRate;
     protected HouseRent(String fname, String lname, String id, 
                         double bs, double inc, double hRentRate) {
         super(fname, lname, id, bs, inc);
         houseRentRate = hRentRate;
     }

    double getHouseRentRate() { return houseRentRate; } 
 }

 class ProvidendFund extends HouseRent {
     double grossSalary;
     double providendFundRate;
     protected ProvidendFund(String fname, String lname, String id, 
                             double bs, double inc, double hRentRate, 
                             double pFundRate) {
         super(fname, lname, id, bs, inc, hRentRate);
         providendFundRate = pFundRate;
     }

     double calculateGrossSalary() {
         double bSalary = getBasicSalary(); // Yearly Salary
         grossSalary = bSalary + bSalary * getIncRate();
         grossSalary += (bSalary * getHouseRentRate() / 100);
         grossSalary *= 12; // a Year worth of salary
         return grossSalary;
     }

     double calculateNetSalary() {
         calculateGrossSalary();
         double netSalary = grossSalary;
         netSalary -= 12 * (getBasicSalary() * providendFundRate / 100); 
         return netSalary;
     }

     void printGrossAndNetSalary() {
         System.out.println("Employee Yearly Salary Info: ");
         System.out.println("Name: " + getFirstName() + " " + getLastName());
         System.out.println("Employee ID: " + getID());
         System.out.println("Basic Salary(per month): " + getBasicSalary());
         System.out.println("Increment Rate(per year): " + getIncRate() + "%");
         System.out.println("House Rent(per month): " + 
                                 (getBasicSalary() * getHouseRentRate() / 100));
         System.out.println("Providend Fund(per month): " + 
                                 (getBasicSalary() * providendFundRate / 100));
         System.out.println("Gross Salary(in a year): " + calculateGrossSalary());
         System.out.println("Net Salary(in a year): " + calculateNetSalary());
     }
 }

 class exp8 {
     public static void main(String[] args) {
         ProvidendFund p = new ProvidendFund("Garry", "Kasparov", "1989CHAMP",
                                             50000, 4.0, 10.0, 12.0); 
         p.printGrossAndNetSalary();
     }
 }
