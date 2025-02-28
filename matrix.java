public class matrix{
    public static void main(String args[]){
        int arr[][]={
            {5,4,7},
            {1,8,3},
            {9,6,2}};
            int row=arr.length;
            int col=arr[0].length;
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]==1){
                        arr[i][j]=4;
                    }
                    else if(arr[i][j]==9){
                        arr[i][j]=7;
                    }
                    else if (arr[i][j]==6){
                        arr[i][j]=3;
                                            }
                }
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
            }System.out.println();
            
    }
    }
}
