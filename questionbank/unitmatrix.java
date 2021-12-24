package questionbank;




public class unitmatrix {
    public static void main(String[] args) {
int i,j;
        int A[][]={{1,0,0},{0,1,0},{0,0,1}};
    
       
        System.out.println("The matrix is ");

        for(i=0;i<=2;i++)//rows 
        {
            for(j=0;j<=2;j++)//columns 
            {
                System.out.print(A[i][j]+"");
            
               
            }
            System.out.println(" ");
        }
        
        
    }
    
}
