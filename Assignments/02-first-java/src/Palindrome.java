public class Palindrome {
    public static void main(String[] args) {
        // To find out whether the given String is Palindrome or not

        String palindrome = "whatiitahw";

        int strLength = palindrome.length();
        int first = 0;
        int last = strLength - 1;

        while(first < last && first != last){
            if(palindrome.charAt(first) != palindrome.charAt(last)){
                System.out.println("Not a Palindrome");
                return;
            }
            first++;
            last--;
        }

        System.out.println("Is a palindrome");

    }
}
