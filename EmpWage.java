public class EmpWage
{
   public static void main(String args[])
   {
		int workHr,wage;
		int rateperHr = 20;
		System.out.println("Welcome to Employee Wage Calculation !!");
		double empCheck = Math.floor(Math.random() * 10 ) % 2;
		if (empCheck == 1)
		{
			System.out.println("Employee is Present");
			workHr = 8;
		}
		else
		{
			System.out.println("Employee is Absent");
			workHr = 0;
		}
		wage = workHr*rateperHr;
		System.out.println("Wage for today is : " + wage);
	}
}
