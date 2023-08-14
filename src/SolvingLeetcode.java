import java.util.Scanner;
public class SolvingLeetcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to check if it is a palindrome? = ");
        int x = scanner.nextInt();
        //System.out.println("hello world");
        System.out.println("Is x a Palindrome? = ");
        boolean a = palindrome(x);
        System.out.println(a);
        String word[] = {"abc","abd","aabd"};
        String bro = LongestCommonPrefix(word);
        System.out.print("longest common prefix is = ");
        System.out.println(bro);

    }

    public static String LongestCommonPrefix(String words[]){

        if(words.length == 0) return "";
        String prefix = words[0];
        for(int i=1;i<words.length;i++){
            while(words[i].indexOf(prefix) !=0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }

        return prefix;
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
