package Problem_Solving;

public class Interview_2 {
    int id;
    String name;
    String department;
    static int employeeCount = 0;

    long baseSalary = 45000;

    public Interview_2() {
        this.id = -1;
        this.name = "Unregistered Employee";
        this.department = "Not assigned";
    }

    public Interview_2(int id, String name, String department, long baseSalary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    public long calculateSalary(){
        return baseSalary;
    }

    public static void main(String[] args) {
        Interview_2 employee1 = new Interview_2(1, "Reon", "IT", 50000);
    }
}

class FullTimeEmployee extends Interview_2{
    int annualSalary;

    public FullTimeEmployee(int id, String name, String department, long baseSalary, int annualSalary){
        super(id, name, department, baseSalary);
        this.annualSalary = annualSalary;
    }

    @Override
    public long calculateSalary() {
        return baseSalary + annualSalary;
    }
}

class PartTimeEmployee extends Interview_2{
    int hoursWorked;
    int hourlyRate;

    public PartTimeEmployee(int id, String name, String department, long baseSalary, int hoursWorked, int hourlyRate) {
        super(id, name, department, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public long calculateSalary() {
        return baseSalary + ((long) hoursWorked * hourlyRate);
    }
}

class ContractEmployee extends Interview_2{
    int contractAmount;

    public ContractEmployee(int id, String name, String department, long baseSalary, int contractAmount) {
        super(id, name, department, baseSalary);
        this.contractAmount = contractAmount;
    }

    @Override
    public long calculateSalary() {
        return baseSalary + contractAmount;
    }
}