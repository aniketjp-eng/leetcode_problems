
public class Main {

  

  // public static int thirdMax(int[] nums) {
  //   int m1 = Integer.MIN_VALUE;
  //   int m2 = Integer.MIN_VALUE;
  //   Integer m3 = null;
  //   for (int term : nums) {
  //     // System.out.println("loop 1 : ");
  //     if (term > m1) {
  //       m1 = term;
  //       // System.out.println("m1 updated to : " + m1 + "=========>");
  //     }
  //   }
  //   for (int term : nums) {
  //     // System.out.println("loop 2 : ");
  //     if (term < m1 && term > m2) {
  //       m2 = term;
  //       // System.out.println("m2 updated to : " + m2 + "=========>");
  //     }
  //   }
  //     for (int term : nums) {
  //       // System.out.println("loop 3 : ");
  //       if (term < m2 && (m3 == null || term > m3)) {
  //         m3 = term;
  //         // System.out.println("m3 updated to: " + m3 + "=========>");
  //       }
  //     }
  //     if(m3 != null){
  //       int ans = m3;
  //       return ans;
  //     }
  //   return m1;
  // }
// --------------- more optimal in sense of passes ------------
 public static int thirdMax(int[] nums) {

        Integer m1 = null;
        Integer m2 = null;
        Integer m3 = null;

        for (int num : nums) {

            // skip duplicates
            if ((m1 != null && num == m1) ||
                (m2 != null && num == m2) ||
                (m3 != null && num == m3)) {
                continue;
            }
            // first max
            if (m1 == null || num > m1) {

                m3 = m2;
                m2 = m1;
                m1 = num;

            }
            // second max
            else if (m2 == null || num > m2) {

                m3 = m2;
                m2 = num;

            }
            // third max
            else if (m3 == null || num > m3) {

                m3 = num;
            }
        }

        return (m3 == null) ? m1 : m3;
    }
//   Conclusion : 
// Time Complexity: O(3N) = O(N)
// Space Complexity: O(1)

  public static void main(String[] args) {
    // edge test cases : 
    // int []num = {2,2,3,1};
    int []num = {1,2,-2147483648};
    // int []num = {2,1}; 
    // int[] num = { 1, 2, 2, 5, 3, 5 }; //pass
    int j = thirdMax(num);
    System.out.println("Ans is : " + j);

  }
}
