import java.util.Scanner;
import java.util.Arrays;
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
        String bro2 = LongestCommonPrefix2(word);
        System.out.print("longest common prefix is = ");
        //System.out.println(bro);
        System.out.println(bro2);
    }
    public static String LongestCommonPrefix2(String words[]){
            StringBuilder prefix = new StringBuilder();
            Arrays.sort(words);
            String front = words[0];
            String rear = words[words.length-1];
            for(int i=0; i<front.length(); i++)
            {
                if(front.charAt(i) != rear.charAt(i))
                    break;
                prefix.append(front.charAt(i));
            }

            return prefix.toString();
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
