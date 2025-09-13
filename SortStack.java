import java.util.*;

class Solution{
    public static void sortedUtils(Stack<Integer> s, int x){
        if(s.isEmpty() || x > s.peek()){
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedUtils(s, x);
        s.push(temp);

    }
    public static void sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int x = s.pop();
            sort(s);
            sortedUtils(s, x);
        }
    }
}