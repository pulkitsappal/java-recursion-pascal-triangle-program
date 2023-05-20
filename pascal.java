class HelloWorld {
    static int n = 5;
   static int[][] arr = new int[n][n];
    static void pascal(int row){
        if(row==1){
            arr[0][0] = 1;
            System.out.println(arr[0][0]);
            return;
        }
        
        pascal(row-1);
        
        for(int col = 0; col<row; col++){
            if(col==0 || (col==row-1)){
            arr[row-1][col] = 1;
            System.out.print(arr[row-1][col] + " ");
            } 
            else {
                arr[row-1][col] = arr[row-2][col] + arr[row-2][col-1];
                 System.out.print(arr[row-1][col] + " ");
            }
        }
         System.out.println();
    }
    public static void main(String[] args) {
        int row = n;
        pascal(row);
    }
}