public class FiveIntegers {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    //define a list of 5 variables
    int a, b, c, d, e;

    //prompt user to enter 5 integers
    System.out.println("Enter five integers, starting with the first one: ");
      a = scanner.nextInt();
    System.out.println("Enter the second integer: ");
      b = scanner.nextInt();
    System.out.println("Enter the third integer: ");
      c = scanner.nextInt();
    System.out.println("Enter the fourth integer: ");
      d = scanner.nextInt();
    System.out.println("Enter the fifth integer: ");
      e = scanner.nextInt();

      //Now print each of the numbers separated by a tab
      System.out.println(a + "\t" + b + "\t" + c + "\t" + d + "\t" + e);

      //Now print each of the numbers separated by a new line
      System.out.print(  a + "\n");
      System.out.print(  b + "\n");
      System.out.print(  c + "\n");
      System.out.print(  d + "\n");
      System.out.print(  e + "\n");
    }
  }
