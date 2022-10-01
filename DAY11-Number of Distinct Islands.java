class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    List<Integer> list=new ArrayList<>();
                    dfs(grid,i,j,list,i,j);
                    set.add(list);
                    
                }
            }
        }
        return set.size();
        
    }
    void dfs(int[][] grid,int i,int j,List<Integer>list,int sr,int sc){
        if(i<0 || j<0 || i==grid.length || j==grid[0].length || grid[i][j]==0) return;
        grid[i][j]=0;
        list.add(i-sr);
        list.add(j-sc);
        dfs(grid,i+1,j,list,sr,sc);
        dfs(grid,i-1,j,list,sr,sc);
        dfs(grid,i,j+1,list,sr,sc);
        dfs(grid,i,j-1,list,sr,sc);
    }
}
