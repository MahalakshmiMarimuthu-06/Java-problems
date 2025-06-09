import java.util.*;
public class github1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter the Range ");
        int numbers = input.nextInt();

        if(numbers>=10 && numbers<=100){
            System.out.println("The given value is within range");
        }
        else{
            System.out.println("the given value is not in range");
        }
        }
    }
