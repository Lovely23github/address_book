package employee_wage;

public class EmployeeWageMain {
    public  static void main(String[] args) {
        // For a single company
        EmployeeWageCalculator company1 = new EmployeeWageCalculator(20, 8, 8, 20, 100);
        int monthlyWageCompany1 = company1.calculateMonthlyWage();
        System.out.println("Monthly wage for Company 1: $" + monthlyWageCompany1);

        // For multiple companies
        EmployeeWageCalculator company2 = new EmployeeWageCalculator(18, 7, 6, 22, 110);
        int monthlyWageCompany2 = company2.calculateMonthlyWage();
        System.out.println("Monthly wage for Company 2: $" + monthlyWageCompany2);
    }
}

