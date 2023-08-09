import java.util.Scanner;
public class Palindromeint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("hello world");
        System.out.println("Is x a Palindrome? = ");
        boolean a = palindrome(x);
        System.out.println(a);
    }
    public static boolean palindrome(int x){

        boolean f = false;
        int  temp=x;
        int r,sum=0;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(sum==temp)
            f=true;
        //System.out.println("f = "+ f);
        return f;
    }
}
