//https://leetcode.com/problems/climbing-stairs/

public class ClimbingStairs {

    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int temp []=  new int[n+1];
        temp[0]=0;temp[1]=1;temp[2]=2;

        for(int i=3;i<=n;i++){
            temp[i]=temp[i-2]+temp[i-1];
        }
        return temp[n];

    }
}
