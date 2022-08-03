class Solution {
    int color;
    public int[][] floodFill(int[][] image, int sr, int sc, int nc) {
        int m = image.length;
        int n = image[0].length;
        
        color = image[sr][sc];
        
        if(color!=nc)
        {
            dfs(sr,sc,image,nc,m,n);
        }
        
        return image;
    }
    
    void dfs(int sr,int sc,int[][] image,int c,int m,int n)
    {
        if(sr<0 || sr>=m || sc<0 || sc>=n || image[sr][sc]!=color)
        {
            return;
        }
        
        image[sr][sc] = c;
        
        dfs(sr+1,sc,image,c,m,n);
        dfs(sr,sc+1,image,c,m,n);
        dfs(sr-1,sc,image,c,m,n);
        dfs(sr,sc-1,image,c,m,n);
    }
}
