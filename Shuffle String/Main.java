public class Main {
  public static String restoreString(String s, int[] indices) {
    char[] ans = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
        ans[indices[i]] = s.charAt(i);
    }
    return new String(ans);
}

// Time Complexity: O(n)
// Space Complexity: O(n)
    public static void main(String []args) {
      // String s = "codeleet"; // leetc
      // int []indices = {4,5,6,7,0,2,1,3};
      String s = "abc"; // leetc
      int []indices = {0,1,2};

      String result = restoreString(s, indices);
      System.out.println(result);

    }
}