import java.util.*;
public class Vote
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Age=");
        int age=s.nextInt();
        if(age>=18)
        System.out.println("Eligible for Vote");
        else
        System.out.println("Not Eligible for Vote");

    }
}