import java.util.*;
class AreaOfCircle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       
        double r=sc.nextDouble(); 
        double area;

        area=r*r*Math.PI;
        System.out.println(area);
    }

}