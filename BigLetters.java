public class BigLetters {
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    //define the letters of your initials in Variables
    String a, b;

    //prompt user to enter user's initials
    System.out.println("Enter your first initial: ");
      a = scanner.next();
    System.out.println("Enter your second initial: ");
      b = scanner.next(); 

    //print user's initials as a large banner
    System.out.println(a + " " + " " + " " + " " + " " + a + " " + b + " " + " " + " ");
    System.out.println(a + a + " " + " " + " " + a + a + " " + b + " " + " " + " " );
    System.out.println(a + " " + a + " "  + a + " " + a + " " + b + " " + " " + " ");
    System.out.println(a + " " + " " + a + " " + " " + a + " " + b + " " + " " + " ");
    System.out.println(a + " " + " " + " " + " " + " " + a + " " + b + " " + " " + " ");
    System.out.println(a + " " + " " + " " + " " + " " + a + " " + b + " " + " " + " ");
    System.out.println(a + " " + " " + " " + " " + " " + a + " " + b + b + b + b + b + b + b +b + b + b );
      }
    }
