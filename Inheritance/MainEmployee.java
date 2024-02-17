package Inheritance;

public class MainEmployee 
{
    public static void main(String[] args) 
    {
        SalariedEmployee employee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee employee4 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        CommissionEmployee employee7 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        System.out.println("Employee 1: " + employee1.getFirstName() + " " + employee1.getLastName() + ", SSN: " + employee1.getSocialSecurityNumber() + ", Weekly Salary: $" + employee1.getWeeklySalary());

        System.out.println("Employee 2: " + employee2.getFirstName() + " " + employee2.getLastName() + ", SSN: " + employee2.getSocialSecurityNumber() + ", Wage: $" + employee2.getWage() + ", Hours Worked: " + employee2.getHoursWorked());

        System.out.println("Employee 3: " + employee3.getFirstName() + " " + employee3.getLastName() + ", SSN: " + employee3.getSocialSecurityNumber() + ", Wage: $" + employee3.getWage() + ", Hours Worked: " + employee3.getHoursWorked());

        System.out.println("Employee 4: " + employee4.getFirstName() + " " + employee4.getLastName() + ", SSN: " + employee4.getSocialSecurityNumber() + ", Commission Rate: " + employee4.getCommissionRate() + ", Gross Sales:$" + employee4.getGrossSales());

        System.out.println("Employee 5: " + employee5.getFirstName() + " " + employee5.getLastName() + ", SSN: " + employee5.getSocialSecurityNumber() + ", Weekly Salary: $" + employee5.getWeeklySalary());

        System.out.println("Employee 6: " + employee6.getFirstName() + " " + employee6.getLastName() + ", SSN: " + employee6.getSocialSecurityNumber() + ", Base Salary: $" + employee6.getBaseSalary());

        System.out.println("Employee 7: " + employee7.getFirstName() + " " + employee7.getLastName() + ", SSN: " + employee7.getSocialSecurityNumber() + ", Commission Rate: " + employee7.getCommissionRate() + ", Gross Sales: $" + employee7.getGrossSales());
    }
}

