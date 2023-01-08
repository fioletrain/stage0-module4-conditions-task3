package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double salaryAfterTaxes = 0;
        if(salary > 0 && salary <= 10000){
            salaryAfterTaxes = salary - (salary / 100 * 15);
            System.out.println(salaryAfterTaxes);
        } else if (salary > 10000 && salary <= 20000){
            salaryAfterTaxes = salary - (salary / 100 * 18);
            System.out.println(salaryAfterTaxes);
        } else if (salary > 20000) {
            salaryAfterTaxes = salary - (salary / 100 * 20);
            System.out.println(salaryAfterTaxes);
        } else {
            System.out.println("wrong input!");
        }
    }
}
