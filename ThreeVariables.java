public class ThreeVariables {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    //define the numbers asked for, in Variables
    String department;
    float salary = 0.0F;
    // learned by trial and error that you MUST include the F in the end of declaring a Float variable  
    int EmpID;

    System.out.print( "Give me your dept. code first: " );
    department = scanner.next();
    System.out.print( "Second, what is your salary?  " );
    salary = scanner.nextFloat();
    System.out.print( "Please type in your employee ID: " );
    EmpID = scanner.nextInt();


    //I printed this info separated by a space
    System.out.println(department + " " + salary + " " + EmpID + " ");

    //I printed this info separated by a tab
    System.out.println(department + "\t" + salary + "\t" + "\t" +  EmpID );

    //Now print each of the numbers separated by a new line
    System.out.print( department + "\n");
    System.out.print(  salary + "\n");
    System.out.print(  EmpID + "\n");

  }
}
