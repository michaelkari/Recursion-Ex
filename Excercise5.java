import java.util.*;

public class Excercise5{
  public static void main ( String[] args)
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a positive integer");
    n=sc.nextInt();
    while(n<=0){
      System.out.println("Please enter a positive integer");
      n=sc.nextInt();
    }
    int result =pow(n);
    System.out.println("Log("+n+") is " + result );
  }
  public static int pow(int n){
    if(n==0){
      return 1;
    }
    else{
      return 2*pow(n-1);
    }
  }
}