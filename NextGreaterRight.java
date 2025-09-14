import java.util.*;

class Solution{
    public ArrayList<Integer> nextElement(int arr[]){
        ArrayList<Integer> nextGreaterRight = new ArrayList<>();

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[i] >= s.peek()){
                s.pop();
            }

            if(s.isEmpty()){
                nextGreaterRight.add(0, -1);
            }else{
                nextGreaterRight.add(0, s.peek());
            }
            s.push(arr[i]);
        }
        return nextGreaterRight;
    }
}