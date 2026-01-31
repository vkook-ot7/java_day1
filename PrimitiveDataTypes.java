import java.util.*;
public class PrimitiveDataTypes

{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
       
        System.out.println(" Enter your Name=");
        String name=s.nextLine();
         System.out.println("Enter your Age=");
        int age=s.nextInt();

        System.out.println(" Enter your Marks=");
        double marks=s.nextDouble();
        System.out.println(" Enter your Percentage=");
        float per=s.nextFloat();
       
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("marks="+marks);
        System.out.println("percentage="+per);


        

    }
}
