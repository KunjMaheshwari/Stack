import java.util.*;

class Solution{
    public int celebrity(int mat[][]){
        int n = mat.length;
        int candidate = 0;

        for(int i=1;i<n;i++){
            if(mat[candidate][i] == 1){ // if candidate knows i
                candidate = i; // candidate cannot be a celebrity
            }
        }

        for(int i=0;i<n;i++){
            if( i != candidate){
                // everyone knows celebrity but celebrity does not know anyone
                if(mat[candidate][i] == 1 && mat[i][candidate] == 0){
                    return -1;
                }
            }
        }
        return candidate;
    }
}