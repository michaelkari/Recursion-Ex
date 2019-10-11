import java.util.*;

public class Excercise1and2{
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
    int result =triangle(n);
    System.out.println("Triangle("+n+") is " + result );
  }
  public static int triangle(int n){
    if(n==1){
      return 1;
    }
    else{
      return n+triangle(n-1);
    }
  }
}