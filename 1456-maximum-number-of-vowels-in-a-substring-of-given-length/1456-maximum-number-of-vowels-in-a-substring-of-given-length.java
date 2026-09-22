class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
            int maxcount=count;
            for(int i=k;i<s.length();i++){
                char cho=s.charAt(i);
         if(cho=='a'||cho=='e'||cho=='i'||cho=='o'||cho=='u'){
            count++;

}
char gh=s.charAt(i-k);
if(gh=='a'||gh=='e'||gh=='i'||gh=='o'||gh=='u'){
    count--;
}
maxcount=Math.max(count,maxcount);
            }
            
        
        return maxcount;
        
    }
}