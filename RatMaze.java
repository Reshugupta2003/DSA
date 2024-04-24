package DSA.BackTracing;

public class RatMaze{
    
    public static void printSolution(int[][] Output, int n){
        for(int i=0; i<n; i++)
        {
            for(int j= 0; j<n; j++)
            {
              System.out.print(Output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int i, int j, int n)
    {
       if (i >= 0 && i < n && j>= 0 && j < n && maze[i][j] == 1)
       {
           return true;
       } 
       else 
       {
         return false;
       }
    }
    public static boolean solveMaze(int maze[][], int Output[][], int i, int j, int n){

        if(i == n-1 && j == n-1 && maze[i][j] == 1)
        {
           Output[i][j]  = 1;
           return true;
        }
        if (isSafe(maze, i, j, n) == true) 
        {
            if(Output[i][j] == 1) 
            {
                return false;
            }
             
            // Otherwise mark is as par solution
            Output[i][j] = 1;

            // down direction
            if (solveMaze(maze, Output, i +1, j, n) == true) 
            {
                return true;
            }
            // right direction
            if (solveMaze(maze, Output, i, j + 1, n) == true) 
            {
                return true;
            }
            // left direction
            if (solveMaze(maze, Output, i , j - 1, n) == true) 
            {
                return true;
            }
             
            //backtrack
            Output[i][j] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        
        int [][] maze = {{1, 1, 1, 1, 1},
                         {0, 0, 0, 0, 1},          
                         {1, 1, 1, 1, 1},
                         {1, 0, 0, 0, 0},
                         {1, 1, 1, 1, 1}   };
   
        int n = maze.length;
        int Output[][] = new int [n][n];

        if(solveMaze(maze, Output, 0, 0, n) == true)
        {
            printSolution(Output, n);
        }
        else
        {
          System.out.println("Solution does not exist.");
        }

    }                     
}


