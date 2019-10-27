

import java.util.Arrays; 
import java.util.List; 
  
class Wildcards 
{ 
    public static void main(String[] args) 
    { 
        List<Integer> list1= Arrays.asList(4,5,6,7); 
        System.out.println("Printing list 1");
        pr(list1);
        //System.out.println("Total sum is:"+sum(list1)); 
        System.out.println("Adding list 2");
        List<Double> list2=Arrays.asList(4.1,5.1,6.1); 
        System.out.print("Total sum is:"+sum(list2)+"\n"); 
    } 
  
    private static double sum(List<? extends Number> list)  
    { 
        double sum=0.0; 
        for (Number i: list) 
        { 
            sum+=i.doubleValue(); 
        } 
  
        return sum; 
    } 
    private static void pr(List<? super Integer> list)
    {
    	System.out.println(list);
    }
 }