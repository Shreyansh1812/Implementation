import java.util.*;
public class Randnik_Problems {
    public static int findfact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return n*findfact(n-1);
        }
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    public static int checkPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
            if(count==2)
            return 1;
            
        }
        return 0;
    }
    public static void checkArmstrong(int n)
    {
        int digit=0;
        int original=n;
        int x=0;
        while(n!=0)
        {
            digit=n%10;
            x=x+digit*digit*digit;
            n=n/10;
        }
        if(x==original)
       System.out.println("The Number is Armstrong:"+original);  
        else
        {
            System.out.println("The Number is not Armstrong");
        }   
    }
    public static void Check_GCD(int x,int y)
    {  int min=Math.min(x, y);
        int gcd=1;
        for(int i=min;i>=1;i--)
        {
            if(x%i==0 && y%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);

    }
    public static void subarray(int[] arr, int k) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int current = 0;
            for (int j = i; j < arr.length; j++) {
                current += arr[j];
                if (current == k) {
                    System.out.println("You got it");
                    return;
                }
            }
        }
        System.out.println("Halkat Dekh ke.");
    }
    public static int fibbonaci(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else
        {
            return fibbonaci(n-1)+fibbonaci(n-2);
        }
    }
    public static int climbing(int n)
    {
        if(n==1)
        return 1;
        if(n==2)
        return 2;
        int prev1=2;
        int prev2=1;
        int current=0;
        for(int i=3;i<=n;i++)
        {
            current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        return current;
    }
    public static String reverse(String str) {
        // Base condition: if the string is empty or has a single character, return it
        if (str.isEmpty()) {
            return str;
        }

        // Recursive step: take the first character and place it at the end of the reversed rest of the string
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static int count(String str)
    {
        int count=0;
        char [] arr= str.toCharArray();
        for(int c:arr)
        {
            switch (c) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                count++;
            }
        }
        return count;
    }
    public static boolean pallindrome(String str)
    {
        String original=str;
        String reversed=reverse(str);
        return(original.equals(reversed));
    }
    
    public static void main(String[] args) {
        // System.out.println(findfact(5));
        // System.out.println(isPowerOfTwo(89));
       //  System.out.println(checkPrime(17));
      //   checkArmstrong(153);
          //Check_GCD(7, 8);
        //  int []arr={1,2,3,4,5};
        //  subarray(arr, 14);
        // System.out.println(fibbonaci(10));
    //    System.out.println(climbing(5));
    // System.out.println(reverse("Mukesh"));
    // System.out.println(count("Reliance"));
    // System.out.println(pallindrome("DAD"));

    }
    
}
