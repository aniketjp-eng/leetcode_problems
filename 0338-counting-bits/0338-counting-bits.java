class Solution {
    public int deciToBin(int i) {
       int count1 = 0;
       int ans = 0;
       while(i != 0 ){
        int rem = i % 2; // 0
        if(rem == 1) {
            count1++;
        }
        ans = (ans * 10 ) +  rem; //10
        i/=2;
       }
       return count1;
    }
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i <=n; i++){
            ans[i] = deciToBin(i);
        }
        return ans;
    }
    }
