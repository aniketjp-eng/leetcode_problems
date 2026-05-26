import java.sql.Time;

public class Main {
  public static int thirdMax(int[] nums) {
    int m1 = Integer.MIN_VALUE;
    int m2 = Integer.MIN_VALUE;
    Integer m3 = null;
    for (int term : nums) {
      // System.out.println("loop 1 : ");
      if (term > m1) {
        m1 = term;
        // System.out.println("m1 updated to : " + m1 + "=========>");
      }
    }
    for (int term : nums) {
      // System.out.println("loop 2 : ");
      if (term < m1 && term > m2) {
        m2 = term;
        // System.out.println("m2 updated to : " + m2 + "=========>");
      }
    }
      for (int term : nums) {
        // System.out.println("loop 3 : ");
        if (term < m2 && (m3 == null || term > m3)) {
          m3 = term;
          // System.out.println("m3 updated to: " + m3 + "=========>");
        }
      }
      if(m3 != null){
        int ans = m3;
        return ans;
      }
    return m1;
  }

//   Conclusion : 
// Time Complexity: O(3N) = O(N)
// Space Complexity: O(1)

  public static void main(String[] args) {
    // int []num = {2,2,3,1};
    // int []num = {1,2,-2147483648};
    // int []num = {2,1};
    int[] num = { 1, 2, 2, 5, 3, 5 };
    int j = thirdMax(num);
    System.out.println("Ans is : " + j);

  }
}