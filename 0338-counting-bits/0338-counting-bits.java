class Solution {
    public int count(int i) {
       int count = 0;
       while(i != 0 ){
        int rem = i % 2; 
        if(rem == 1) {
            count++;
        }
        i/=2;
       }
       return count;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <=n; i++){
            ans[i] = count(i);
        }
        return ans;
    }
    }
