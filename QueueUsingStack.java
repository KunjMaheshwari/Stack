import java.util.*;

class Solution{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public int enqueue(){
        if(input.isEmpty()){
            return -1;
        }

        while(!input.isEmpty()){
            output.push(input.pop());
        }

        int x = output.pop();

        while(!output.isEmpty()){
            input.push(output.pop());   
        }
        return x;
    }

    public void dequeue(int x){
        input.add(x);
    }
}