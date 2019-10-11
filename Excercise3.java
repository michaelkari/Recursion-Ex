import java.util.*;

public class Excercise3{
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
    int result =square(n);
    System.out.println("Square("+n+") is " + result );
  }
  public static int square(int n){
    if(n==1){
      return 1;
    }
    else{
      return square(n-1)+2*n-1;
    }
  }
}