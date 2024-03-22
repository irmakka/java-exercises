import java.util.Scanner;
public class firrst{
      
    public static void main(String[] args) {  
      /*  Scanner scan=new Scanner(System.in);
        int number= scan.nextInt();
        scan.close();
        if(number%2==0){
            System.out.println("ıt is even");
        }
        else{
            System.out.println("It ıs odd");
        }*/
      /*    Scanner scan= new Scanner(System.in);
        String deger=scan.next();
        scan.close();
        if(deger.charAt(0)=='y'){
            System.out.print("okay");

        }
         else{
            System.out.print("no");
        }*/
        /* 
   Scanner scan = new Scanner(System.in);
   int number=scan.nextInt();
   scan.close();
   for(int i=0;i<number;i++){
    System.out.print(i+"\t");
   }
*/
/* 
 Scanner scan=new Scanner(System.in);
 int number=scan.nextInt();
 int sum=0;
 scan.close();
 for(int i=0;i<number;i++){
  sum+=i;
 }
 System.out.print(sum); */

 /*  1 2 3 4 5 6 7 8 9 10 
   11 12 13 14 ...
  */
  /* 
   for (int i=0;i<100;i+=10){
    for(int j=1;j<=10;j++){
    System.out.printf("%d\t",i+j);}
    System.out.print("\n");

   } */
   /* 
   for(int i=0;i<99;i+=10){
    for(int j=1;j<10;j+=2){
      System.out.printf("%d\t",i+j);
    }
    System.out.print("\n"); 
   } */
   /* 
   int a= 0;
   Scanner scan= new Scanner(System.in);
   int number= scan.nextInt();
   int temp=number;
   scan.close(); 
   for(int i=number;i>0;i/=2){
        a+=1;
    }
    for( int i=a;i>0;i--){
      for(int j=1;j<i;j++){
         temp/=2;
      }
      System.out.println(temp%2);
      temp=number;
    } */ /* 
    int i=0,j=1;
    while(i<=90){
      while(j++<=10){
        System.out.print((i+j));
      }
       
      System.out.printf("\n");
      i+=10;

    }    
}
}*/
// Use this editor to write, compile and run your Java code 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in base 5: ");
        int number5 = scan.nextInt();

        int temp = number5;
        int count = 0;
        int result = 0;

        // Count the number of digits in the input number
        while (number5 > 0) {
            number5 /= 10;
            count++;
        }

        // Reset the number back to its original value
        number5 = temp;

        // Convert to base 10
        for (int i = 1; i <= count; i++) {
            // Extract the rightmost digit
            int digit = number5 % 10;

            // Update the result by multiplying the digit with the appropriate power of 5
            for (int j = i - 1; j > 0; j--) {
                digit *= 5;
            }

            // Add the digit to the result
            result += digit;

            // Remove the rightmost digit from the number
            number5 /= 10;
        }
           count=0;
           int a=result;
        System.out.println("Equivalent in base 10: " + result);
        while(result>0){
            result/=10;
            count++;                              
        }  
        result=a;                          
        for(int i=count;count<=1;i--){  
            for(int j=i;j>1;j--){
                 a/=9;
            }
            a=a%9;
            System.out.print(a);
            a=result;
        }
        scan.close();
    }
}
