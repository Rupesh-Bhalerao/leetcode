class Solution {
    public void rotate(int[][] matrix) {

        //90 degree rotate 

        //step 1 --> transpose 

        // row


        //transpose
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix[i].length;j++)
            {
                 // exchange 
                 int temp=matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
            }
        }

        //step2--> reverse the row

        for(int i=0;i<matrix.length;i++)
        {
            int start=0;
            int end=matrix[i].length-1;

            while(start<end)
            {

                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;

                start++;
                end--;
            }
        }
        
    }
}