class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> x(n);
        int i,j;
        for(i=0;i<n;i++){
            x[i].resize(i+1,1);
            for(j=1;j<i;j++){ 
                x[i][j]=x[i-1][j-1]+x[i-1][j];
            }
        }
        return x;
    }
};