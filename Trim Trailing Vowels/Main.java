public class Main {
   // public static String trimTrailingVowels(String s) {
   //    StringBuilder sb = new StringBuilder(s);
   //     for(int i = sb.length()-1; i >=0; i--){
   //         if(sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u'){
   //          sb.deleteCharAt(i);
   //         } else {
   //          break;
   //         }
   //      } 
   //      return sb.toString();
   //  }
   //  Conclusion : SC = O(n) ceated new StringBuilder and also New String i.e O(n) + O(n) = O(n)
   //  TC = O(n) worst case loop runs n times and in deleteCharAt =always deleting the 
   // last character. so no O(1) it is constant process 
   // --------------------------------------------------------------------------------------------
   public static String trimTrailingVowels(String s) {
      StringBuilder sb = new StringBuilder(s);
       for(int i = sb.length()-1; i >=0; i--){
           if(sb.charAt(i) != 'a' && sb.charAt(i) != 'e' && sb.charAt(i) != 'i' && sb.charAt(i) != 'o' && sb.charAt(i) != 'u'){
            return sb.substring(0, i+1).toString();
           } 
        } 
        return "";
    }
// TC = O(n) : loop traversal + substring copy
// SC = O(n) : StringBuilder copy + returned substring
     public static void main(String[] args) {
        String s = "idea";
        String ans = trimTrailingVowels(s);
        System.out.println(ans);
     }
}
