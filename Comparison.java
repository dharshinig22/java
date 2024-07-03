import java.util.Scanner;

class Comparison{

public static void main(String[] args){

Scanner scan=new Scanner(System.in);

System.out.println("enter the first number");
int num1=scan.nextInt();

System.out.println("enter the second number");     
int num2=scan.nextInt();
 
System.out.println(num1 + " < " + num2 + " is " + (num1 < num2));
       
 System.out.println(num1 + " <= " + num2 + " is " + (num1 <= num2));
       
 System.out.println(num1 + " > " + num2 + " is " + (num1 > num2));
        
System.out.println(num1 + " >= " + num2 + " is " + (num1 >= num2));
        
System.out.println(num1 + " == " + num2 + " is " + (num1 == num2));
       
 System.out.println(num1 + " != " + num2 + " is " + (num1 != num2));
   
 }

}


