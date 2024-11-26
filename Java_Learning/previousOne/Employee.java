package previousOne;
public class Employee {
    // Attributes
    private int employeeNumber;
    private String familyName;
    private String givenName;
    private double basicHourlyRate;
    private int contractedHoursPerMonth;
    private int hoursWorked;
    
    public static void main(String[] args) {
        // HelloWorld h=new HelloWorld();
        // int [] ver=new int[10];
        // h.swi("Hello, World");

        String[] p={"hello","world"};
        for(String a:p){
            System.out.println(a);
        }
    }
    // Constructor
    public Employee(int employeeNumber, String familyName, String givenName,
                    double basicHourlyRate, int contractedHoursPerMonth) {
        this.employeeNumber = employeeNumber;
        this.familyName = familyName;
        this.givenName = givenName;
        this.basicHourlyRate = basicHourlyRate;
        this.contractedHoursPerMonth = contractedHoursPerMonth;
        this.hoursWorked = 0; // Initial value for hours worked is zero
    }

    // Getters and Setters (if needed)
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public double getBasicHourlyRate() {
        return basicHourlyRate;
    }

    public int getContractedHoursPerMonth() {
        return contractedHoursPerMonth;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
