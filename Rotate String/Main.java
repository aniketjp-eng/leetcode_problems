public class Main {
      public static boolean rotateString(String s, String goal) {
        if(s.equals(goal)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length()-1;i++){
           char first = sb.charAt(0);
           sb.deleteCharAt(0);
           sb.append(first);
           if(sb.toString().equals(goal)) {
            return true;
           }
        }
        return false;
    }
    public static void main(String [] args) {
        // String s = "abcde";
        // String goal = "cdeab";

        // String s = "abcde";
        // String goal = "abced";

    //     String s = "abc";
    //     String goal = "abc";
    //   boolean ans = rotateString(s, goal);
    //   System.out.println("Got the ans : "+ ans);
    }
}