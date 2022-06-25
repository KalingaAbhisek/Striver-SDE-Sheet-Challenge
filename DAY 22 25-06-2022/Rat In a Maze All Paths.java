import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        int vis[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                vis[i][j]=0;
            }
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int di[]={1,0,0,-1};
        int dj[]={0,-1,1,0};
        if(maze[0][0]==1){
            vis[0][0] = 1;
            solve(0,0,maze,n,res,vis,di,dj);
        }
        return res;
    }
    public static void solve(int i,int j,int maze[][], int n,ArrayList<ArrayList<Integer>> res,int[][] vis,int di[],int dj[]){
        if(i==n-1 && j==n-1){
            ArrayList<Integer> ds = new ArrayList<>();
            for (int k = 0 ; k < n ; k++) {
                for (int l = 0 ; l < n ; l++) {
                    ds.add(vis[k][l]);
                }
            }
            res.add(ds);
            return;
        }
        for(int ind=0;ind<4;ind++){
            int nexti=i+di[ind];
            int nextj=j+dj[ind];
            if (nexti >= 0 && nextj >= 0 && nexti < n && nextj < n && vis[nexti][nextj] == 0 && maze[nexti][nextj] == 1) {
                vis[nexti][nextj] = 1;
                solve(nexti, nextj, maze, n, res, vis, di, dj);
                vis[nexti][nextj] = 0;
            }
        }
    }
}
