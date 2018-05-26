package google;

public class GameOfLife {

	
	public static void gameOfLife(int board[][]){
		int m = board.length;
		int n = board[0].length;
		int[][] future = new int[m][n];
		
		for(int i=1;i<m-1;i++){
			for(int j=1;j<n-1;j++){
				future[i][j]=board[i][j];
			}
		}
		
		for(int i=1;i<m-1;i++){
			for(int j=1;j<n-1;j++){
				
				int alive = 0;
					for(int k=-1;k<=1;k++){
						for(int l=-1;l<=1;l++){							
							alive=board[i+k][j+l]+alive;
						}
					}
				alive = alive-board[i][j]; // Subtract cell itself
					
			if(alive<2 && board[i][j]==1){
				future[i][j]=0;
			}
			else if(alive>3 && board[i][j]==1){
				future[i][j]=0;
			}
			else if(alive==3 && board[i][j]==0){
				future[i][j]=1;
			}
					
			}
		}	
	}
		public static void main(String[] args)
	    {
	        int M = 10, N = 10;
	 
	        // Intiliazing the grid.
	        int[][] grid = 
	        {
	        	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
	            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
	        };
	 
	        // Displaying the grid
	        System.out.println("Original Generation");
	        for (int i = 0; i < M; i++)
	        {
	            for (int j = 0; j < N; j++)
	            {
	                if (grid[i][j] == 0)
	                    System.out.print(".");
	                else
	                    System.out.print("*");
	            }
	            System.out.println();
	        }
	        System.out.println();
	        gameOfLife(grid);
	        
	        System.out.println();
	    }

}
