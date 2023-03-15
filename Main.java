import java.util.Scanner;
class Main {

  public static void main(String[] args) {
    Scanner d = new Scanner(System.in);
     System.out.println("Podaj liczbe a:");
    double a = d.nextFloat();
    System.out.println("Podaj liczbe b:");
    double b = d.nextFloat();
 		double power = Math.pow(a, b);
    double power2 = Math.pow(b, a);
    
 		System.out.println(power+power2);
 		
  }
}