public class practic{
    
     public static int sumarray(int[]a)
     {
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
       if(a[0]%3!=0)
       {
        sum=sum+a[i];
       }
      }
      return sum;
     }
     public static void main(String args[])
     {
      
      int[] a= {23,25,9,12,81,1,44};
      int total=sumarray(a);
      System.out.println(total);
     }
     
    
    }   

