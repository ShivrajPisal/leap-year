
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args)

{   Scanner sc=new Scanner(System.in);
    System.out.println("enter year ");
    int year=sc.nextInt();
      int org=year;
       year=year%100;
       if(year%100==00)
       {
           if(org%400==0)
           {
            System.out.println("leap year");
           }
           else if(org%400!=0){
            System.out.println("not leap year");
           }
       }
    else if(year%100!=0)
    {    if(year%4==0){
        System.out.println("leap year");
    }
    
    else if(year%4!=0){
        System.out.println("not leap year");
    }

}
}
}
