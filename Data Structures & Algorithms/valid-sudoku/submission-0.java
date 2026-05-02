class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i=0;i<9;i++)
        for(int j=0;j<9;j++){
            char num;
            if(board[i][j]=='.')
            continue;
            else
            num = board[i][j];

           for(int c=0;c<9;c++)
           if(c!=i && board[c][j]==num)
           return false;

           for(int r=0;r<9;r++)
           if(r!=j&&board[i][r]==num)
           return false;

           int boxStartRow= (i/3)*3;
             int boxStartColumn= (j/3)*3;

             for(int br= boxStartRow;br<boxStartRow+3;br++)
              for(int bc= boxStartColumn;bc<boxStartColumn+3;bc++)
              if((br!=i||bc!=j)&&board[br][bc]==num)
              return false;

        }

        return true;
        
        
    }
}
