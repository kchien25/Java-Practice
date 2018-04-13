public class Employee {
    private String name;
    private int baseSalary;
    static int employeeIDCounter = 1;
    int employeeID = 1;

    public Employee(String name, double baseSalary) {
        this.name = other.name;
        this.baseSalary = other.baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        employeeIDCounter++;
        employeeID = employeeIDCounter;
        return employeeID;
    }

    public Employee getManager() {

    }

    public boolean equals(Employee other) {
        if (this.employeeID == other.employeeID) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return employeeID + " " + name;
    }

    public String employeeStatus() {
        return status;
    }
}