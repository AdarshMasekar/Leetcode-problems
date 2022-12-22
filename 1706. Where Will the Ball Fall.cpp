class Solution {
public:
    vector<int> findBall(vector<vector<int>>& grid) {
        int cnt = grid[0].size();
        int m = grid.size();
        vector<int> ans;
        for(int i = 0; i < cnt; ++i) {
            int start = i;
            int f = 0;
            for(int j = 0; j < m; ++j) {
                int next = start + grid[j][start];
                if(next < 0 || next >= cnt) {  // hit the wall.
                    f = -1;
                    break;
                }
                if(grid[j][start] ==  grid[j][next]) {   //it is not V shape.
                    start = next;
                    
                }else {
                    f = -1; break;   // it is V shape
                }
            }
            if(f == -1) ans.push_back(f);
            else ans.push_back(start);
        }
        return ans;
    }
};
