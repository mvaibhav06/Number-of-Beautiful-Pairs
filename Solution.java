class Solution {
    public boolean coPrime(int a, int b){
        int len = Math.min(a,b);
        for(int i=2; i<=len; i++){
            if(a%i==0 && b%i==0){
                return false;
            }
        }
        return true;
    }
    public int countBeautifulPairs(int[] nums) {
        int out = 0;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                String a = "" + nums[i];
                int a1 = Integer.parseInt(a.charAt(0)+"");
                String b = "" + nums[j];
                int b1 = Integer.parseInt(b.charAt(b.length()-1)+"");
                if(coPrime(a1,b1)){
                    out++;
                }
            }
        }
        return out;
    }
}
