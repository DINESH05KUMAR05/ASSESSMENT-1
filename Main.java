public class Main {  
    
    public static void main(String[]args){
int n[][]={
    {1,2,3},
    {4,5,6},
    {7,8,9}};
    int first=0;
    int second=0;
    int third=0;
     int row=n.length;
     int col=n[0].length;

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(n[i][j]>first){
                
                third=second;
                second=first;
                first=n[i][j];
            }
            else if((n[i][j]>second)&&(n[i][j]!=first)){
                third=second;
                second=n[i][j];
            }
             else if((n[i][j]>third)&&(n[i][j]!=second)){
                 third=n[i][j];
             }
        }
        
        
    
    } 
    System.out.println("The first maxium is  "+first);
   System.out.println("The second maxium is "+second);
      System.out.println("The third maxium is "+third);
}
}
