public class EmpWage
{
	public static final int rateperHr = 20;
	public static final int fullTime = 1;
	public static final int partTime = 2;

   public static void main(String args[])
   {
		int workHr,wage;

		System.out.println("Welcome to Employee Wage Calculation !!");

		int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;
      switch (empCheck)
      {
         case fullTime:
            System.out.println("Employee is Present - Full Time");
            workHr=8;
            break;
         case partTime:
            System.out.println("Employee is Present - Part Time");
            workHr=4;
            break;
         default:
            System.out.println("Employee is Absent");
            workHr=0;
      }
      wage = workHr * rateperHr;
      System.out.println(wage);
	}
}
