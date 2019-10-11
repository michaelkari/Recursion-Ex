import java.util.*;

public class Excercise4{
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
    int result =log(n);
    System.out.println("Log("+n+") is " + result );
  }
  public static int log(int n){
    if(n==1){
      return 0;
    }
    else{
      return 1+log(n/2);
    }
  }
}