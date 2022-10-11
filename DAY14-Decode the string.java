class Solution{
    static String decodedString(String s){
        // code here
        
        Stack<Integer> res=new Stack<>();
        Stack<String> str=new Stack<>();
        
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                int cur=0;
                while(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    cur=cur*10+(s.charAt(i)-'0');
                    i++;
                }
                res.push(cur);
            }else{
                if(s.charAt(i)==']'){
                  int cur=res.pop();
                  StringBuilder cam=new StringBuilder();
                  while(!str.peek().equals("[")){
                      cam.append(str.pop());
                    
                   }
                    str.pop();
                    StringBuilder newstr=new StringBuilder();
                    while(cur>0){
                       newstr.append(cam);
                       cur--;
                    }
                    str.push(newstr.toString());
                }
                else{
                    str.push(""+s.charAt(i));
                }
                i++;
            }
            
        }
        StringBuilder sb=new StringBuilder();
        while(str.size()>0){
            sb.append(str.pop());
        }
        return sb.reverse().toString();
    }
}
