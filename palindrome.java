
public class palindrome {
    public static String reverseString(String string)
    {
        char ch[] = string.toCharArray();
        String rev = "";
        for(int i = ch.length-1;i>=0;i--)    
            rev+=ch[i];
    
        // System.out.println(rev);
        return rev;
    }


    public static void main(String[] args)
    {   
        String toReverse = "malaaalam";
        String reverse = reverseString(toReverse);
        System.out.println("Word: " + toReverse);
        // System.out.println(reverse);
        if(toReverse.equals(reverse))
            System.out.print("It's a palindrome");
        else
            System.out.print("It's not a palindrome");

    }

}