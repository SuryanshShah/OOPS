
class SalaryException extends Exception
{
    SalaryException(String message)
    {
        super(message);
    }
}

class Employee
{
    String name;
    int age;
    float salary;

    Employee(String name, int age, float salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

   
    void checkSalary() throws SalaryException
    {
        if (salary > 10000)
        {
            System.out.println("Salary is valid: " + salary);
        }
        else
        {
            throw new SalaryException("Salary must be greater than 10000");
        }
    }
}

public class Xception
{
    public static void main(String[] args)
    {
        try
        {
            Employee e1 = new Employee("Bhavya", 18, 12000f);
            e1.checkSalary();

            System.out.println("Data is inserted successfully");
        }
        catch (SalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}