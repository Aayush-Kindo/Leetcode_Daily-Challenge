   public boolean backspaceCompare(String s, String t) {

        Stack<Character>st1=new Stack<>();
        Stack<Character>t1=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#' && st1.size()>0 ){
                 st1.pop();
        }  // if and else cannot it be applied 
            //  bcuz if pop is not performed incase of char is # and stack size is zero ,we definetly dont want to add ele to stack in that iteration
            if(s.charAt(i)!='#'){
                st1.push(s.charAt(i));
            }
        }
    
        
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'  && t1.size()>0){
                t1.pop();
            }
             if(t.charAt(i)!='#')
            {
             t1.push(t.charAt(i));
            }
        }
        
       
        
        if(st1.size()!=t1.size()){
            return false;
        }
        
        while(st1.size()>0 &&  t1.size()>0){
            char a=st1.pop();
            char b=t1.pop();
            if(a!=b){
                return false;
            }
        }
       
        return true;
    }