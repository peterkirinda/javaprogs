import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int org = inp.nextInt();
        int rem=0,rev=0,num=org;
        while (num>0){
            rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        if(org!=rev){
            System.out.println(num+" is not a palindrome number.");
        }else{
            System.out.println(num+" is a palindrome number.");
        }
    }
}
