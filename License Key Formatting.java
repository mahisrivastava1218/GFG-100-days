class Solution{
    static String ReFormatString(String S, int K){
        // code here
        int res=0;
        StringBuilder sb=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
            char c=S.charAt(i);
            if(c=='-') continue;
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
                
            }else{
                sb.append(c);
            }
            res++;
            if(res==K){
                sb.append('-');
                res=0;
            }
        }
        sb.reverse();
        if(sb.length()>0 && sb.charAt(0)=='-')sb.deleteCharAt(0);
        return sb.toString();
    }
}
