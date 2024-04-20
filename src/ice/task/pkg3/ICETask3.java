/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice.task.pkg3;

public class ICETask3 {
    //Question 1

    public static boolean isValid(String A) {
        if (A == null || A.isEmpty()) {
            return true;
        }

        StringBuilder sb = new StringBuilder();
        for (char C : A.toCharArray()) {

            if (C == '(' || C == '{' || C == '[') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (C == '}' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '{') {
                sb.deleteCharAt(sb.length() - 1);
            } else if (C == ']' && sb.length() > 0 && sb.charAt(sb.length() - 1) == '[') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                return false;
            }
        }
        return sb.length() == 0;
    }

    public static void main(String[] args) {
        {
            System.out.println(SquareSum(8));
            {
            }
            String My_Condition1 = "{} {) }";
            String My_Condition2 = "";
            String My_Condition3 = "{[}]";
            String My_Condition4 = "()";
            String My_Condition5 = " ({[]})";

            System.out.println(My_condition1 + "Condition is not valid" + isValid(My_Condition1));
            System.out.println(My_condition2 + "Condition is not valid" + isValid(My_Condition2));
            System.out.println(My_condition3 + "Condition is not valid" + isValid(My_Condition3));
            System.out.println(My_condition4 + "Condition is valid" + isValid(My_Condition4));
            System.out.println(My_condition5 + "Condition is valid" + isValid(My_Condition5));
//Question2 initialisation: 
            int limit = 25;
            int result = args_squares_summ;
            System.out.println(" the sum of the odd numbers squared is: " + result);
            
            //Question 3 initialisation:
            Scanner scanner = num Scanner(System.in); 
            System.out.println(" input num 1 here");
            int num1 = scanner.nextInt(); 
            
            System.out.println(" input mun 2 here");
            int num2 = scanner.nextInt(); 
            
            scanner.close(); 
            int hcf = calculateHCF ( num1, num2); 
            
            System.out.println("The HCF is" + hcf);
            
            scanner.close(); 
        }
    }

    //Question 2: 
    public static int args_squares_sum(int limit) {
int total = 0; 
for(int d = 1; d <= limit; d ++)
{
    if (d %2! = 0)
{
 sum += d*d;    
}    
}  
   return; }
   

//Question 3
    
public static double args_greatesr_common_divisor(double num1, double num2){
while (num2 ! = 0){double temporary = num2; 
num2 = num1 % num2; 
num1 = temporary;}   
return num1; 
}
