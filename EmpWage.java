public class EmpWage
{
	public static final int rateperHr = 20;
	public static final int fullTime = 1;
	public static final int partTime = 2;
	public static final int maxDays = 20;
	public static final int maxHr = 100;

   public static void main(String args[])
   {
		int workHr,wage;
		int Salary = 0, totHr = 0, totDays = 0;

		System.out.println("Welcome to Employee Wage Calculation !!");

		while ( totHr < maxHr && totDays < maxDays )
		{
			int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
   	   switch (empCheck)
      	{
         	case fullTime:
            	workHr=8;
   	         break;
      	   case partTime:
         	   workHr=4;
	            break;
   	      default:
      	      workHr=0;
      	}
			totDays++;
			totHr += workHr;
      	wage = workHr * rateperHr;
			System.out.println("Day "+ totDays + " wage is " + wage);
			Salary += wage;
		}

		System.out.println("Total Salary of this Month is : " + Salary);
	}
}
