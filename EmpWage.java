public class EmpWage
{
   public static void main(String args[])
   {
		int fullTime = 1, partTime = 2;
		int workHr,wage;
		int rateperHr = 20;
		System.out.println("Welcome to Employee Wage Calculation !!");
		double empCheck = Math.floor(Math.random() * 10 ) % 3;
		if (empCheck == fullTime)
		{
			System.out.println("Employee is Present - Full Time");
			workHr = 8;
		}
		else if ( empCheck == partTime )
      {
         System.out.println("Employee is Present - Part Time");
         workHr=4;
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
