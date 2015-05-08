public class Solution {
    public int countPrimes(int n) {
        if(n < 3) 
            return 0;
        boolean[] status = new boolean[n];  //hold status for number [2 ... n -1]
        int result = n - 2;
        for(int i = 2; i <= Math.sqrt(n - 1); i++) {
            if(status[i])  //number i has been traversed, skip it
                continue;
            for(int j = i; j <= (n - 1) / i; j++) {
                if (status[i * j] == false){
                    status[i * j] = true;
                    result --;
                }
            }
        }
        return result;
    }
}