import java.util.HashMap;

public class First {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> table = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(table.containsKey(s.charAt(i))){
                int value=table.get(s.charAt(i));
                table.put(s.charAt(i),value++);
            }else{
                table.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            int value=table.get(s.charAt(i));
            if(value==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        First f=new First();
        String s="leetcode";
        System.out.println(f.firstUniqChar(s));
    }
    
}
