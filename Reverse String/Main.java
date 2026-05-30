// package Reverse String;

public class Main {
      public static void reverseString(char[] s) {
        int i = 0;
        while(i < (s.length-i-1)){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
            i++;
        }
    }
// Conclusion : 
// Type	Complexity
// Time	O(n)
// Space	O(1)
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l','o'};
        reverseString(s);
        
    }
}
