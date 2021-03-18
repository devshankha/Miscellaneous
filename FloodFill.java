//This is an implementation of the floodfill algorithm,
//code is taken from here -https://www.geeksforgeeks.org/flood-fill-algorithm-implement-fill-paint/
//with slight modifications, appears to be working


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	int first;
	int second;

	public Pair(int first, int second) {
		this.first = first;
		this.second = second;
	}

}

public class FloodFill {
	public static int validCoord(int x, int y, int n, int m) {
		if (x < 0 || y < 0) {
			return 0;
		}
		if (x >= n || y >= m) {
			return 0;
		}
		return 1;
	}

	public static void bfs(int n, int m, int data[][], int x, int y, int color) {
		// Visiing array
        int vis[][]=new int[n][m];
        
       // Initialing all as zero
       for(int i=0;i< n;i++){
           for(int j=0;j< m;j++){
               vis[i][j]=0;
           }
       }
    // Creating queue for bfs
       Queue<Pair> obj = new LinkedList<>();
 
      // Pushing pair of {x, y}
       Pair pq=new Pair(x,y);
       obj.add(pq);
        
      // Marking {x, y} as visited
       vis[x][y] = 1;
		while (!obj.isEmpty()) {
			// Extrating front pair
            Pair coord = obj.peek();
            int x1 = coord.first;
            int y1 = coord.second;
            int preColor = data[x1][y1];
             
            data[x1][y1] = color;
     
            // Poping front pair of queue
            obj.remove();
         // For Upside Pixel or Cell
            if ((validCoord(x1 + 1, y1, n, m)==1) && vis[x1 + 1][y1] == 0 && data[x1 + 1][y1] == preColor)
            {
                Pair p=new Pair(x1 +1, y1);
                obj.add(p);
                vis[x1 + 1][y1] = 1;
            }
     
            // For Downside Pixel or Cell
            if ((validCoord(x1 - 1, y1, n, m)==1) && vis[x1 - 1][y1] == 0 && data[x1 - 1][y1] == preColor) 
            {
                Pair p=new Pair(x1-1,y1);
                obj.add(p);
                vis[x1- 1][y1] = 1;
            }
         // For Right side Pixel or Cell
            if ((validCoord(x1, y1 + 1, n, m)==1) && vis[x1][y1 + 1] == 0 && data[x1][y1 + 1] == preColor) 
            {
                Pair p=new Pair(x1,y1 +1);
                obj.add(p);
                vis[x1][y1 + 1] = 1;
            }
     
            // For Left side Pixel or Cell
            if ((validCoord(x1, y1 - 1, n, m)==1) && vis[x1][y1 - 1] == 0 && data[x1][y1 - 1] == preColor) 
            {
                Pair p=new Pair(x1,y1 -1);
                obj.add(p);
                vis[x1][y1 - 1] = 1;
            }
            // Printing The Changed Matrix Of Pixels
           /** for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < m; j++) 
                {  
                //	System.out.println("Values are i and j "+i+" "+j);
                 System.out.print(data[i][j]+" ");
                }
                System.out.println();
            } */
            System.out.println();

		}

	}
	public static void main(String[] args) {
		int nn, mm, xx, yy, colorr;
        nn = 5;
        mm = 5;
 
        int dataa[][] = {{ 1, 1, 1, 1, 1 },
                         { 1, 1, 2, 2, 1 },
                         { 1, 1, 2, 2, 1 },
                         { 1, 1, 2, 2, 1 },
                         { 1, 1, 2, 2, 1 },
                         };
 
        xx = 2; yy = 2; colorr = 7;
        
        System.out.println(Arrays.deepToString(dataa));
        
   
        // Function Call
        bfs(nn, mm, dataa, xx, yy, colorr);
        System.out.println();
        System.out.println(Arrays.deepToString(dataa));
	}

}
