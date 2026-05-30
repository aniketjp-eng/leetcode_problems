// package Length of Last Word;

public class Main {
    // ------------------- This is first try--------------------
    // public static int lengthOfLastWord(String s) {
    //     int count = 0;
    //     String S = s.trim();
    //     for(int i = S.length()-1; i >=0; i--){
    //         if(S.charAt(i) == ' ') {
    //             return count;
    //          }
    //         count++;
    //     }
    //     return count;
    // }
    // Conclusion : 
    // TC = o(N) --loop peron N operration in Worst case
    // SC =O(N) -- since trim() method ceates new object of size N 
    // ----------------------------- This is second try.-----------------------------------
    //     public static int lengthOfLastWord(String s) {
    //     int start = 0;
    //     int end = 0;
    //     for(int i = s.length()-1; i >=0; i--){
    //         System.out.println("loop start");
    //         if(s.charAt(i) != ' ') {
    //             end = i;
    //             System.out.println("end mila : e = "+ end+", if condition me");
    //             for(int k = end-1; k >=0; k--){
    //                   System.out.println("chota loop start");
    //                 if(s.charAt(k) == ' '){
    //                     start = k;
    //                     System.out.println("start mila : s = "+ start+", if condition me");
    //                     break;
    //                 } else if(k == 0) {
    //                    start = k;
    //                     System.out.println("start mila : s = "+ start+", else if condition me");
    //                    break;
    //                 }
    //             }  
    //             break;
    //          }
    //     }
    //     if(start == 0 && (s.charAt(start) != ' ')){                                                                    
    //         return (end - start) +1;
    //     }
    //     return  (end - start);
    // }
// conclusion : 
// TC :	O(n) --> loop peron N operration in Worst case
// Sc : O(1) --> Since no extra trim() method use here
// ------------------------------ This is third try.------------------------------------------/
public static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1; i >=0; i--){
            System.out.println("loop start");
            if(s.charAt(i) != ' ') {
                count++;
            } else if(count > 0){
                break;
            }
    }
        return count;
}
    public static void main(String[] args) {
        // String s = "Hello World"; //done
        // String s = "World"; //done/
        // String s = "the moon  "; //done//
        // String s = " a";// -----> edge cases 
        // String s = "luffy is still joyboy";
        String s = "b a ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
        
    }
}
   
