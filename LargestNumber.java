public class Solution{
    public  String largestNumber(int[] num) {
        if(num==null || num.length==0)
            return "";
        String[] Snum = new String[num.length];
        for(int i=0;i<num.length;i++)
            Snum[i] = num[i]+"";
        //to understand more about java comparator
        Comparator<String> comp = new Comparator<String>(){
            public int compare(String str1, String str2){
                String s1 = str1+str2;
                String s2 = str2+str1;
                return s2.compareTo(s1);
            }
        };
        Arrays.sort(Snum,comp);
        if(Snum[0].charAt(0) =='0') return "0"
        StringBuilder sb = new StringBuilder();
        for(String s: Snum)
            sb.append(s);
        return sb.toString();
    
    }
}