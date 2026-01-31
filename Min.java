import java.util.*;
class Min
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
       int a=s.nextInt();
       int b=s.nextInt();
       int c=s.nextInt();
       if(a<b&&a<c)
       System.out.println(" A IS MIN");
       if(b<a&&b<c)
       System.out.println("B IS MIN");
       else
        System.out.println("C IS MIN");
    }
}