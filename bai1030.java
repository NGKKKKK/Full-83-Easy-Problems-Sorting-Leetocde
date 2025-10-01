
import java.util.LinkedList;
import java.util.Queue;

// 1030. Matrix Cells in Distance Order

public class bai1030 {

    //Solution
    class Solution {
        public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
            int[][] cells= new int[rows*cols][2];
            boolean[][] visited = new boolean[rows][cols];
            Queue<int[]> que = new LinkedList<>();
            que.add(new int [] {rCenter, cCenter});
            visited[rCenter][cCenter] = true;
            int[][] direct = {{0,1}, {1,0}, {0,-1}, {-1,0}};
            
            int indx = 0;
            cells[indx++] = new int[] {rCenter, cCenter};
            while (!que.isEmpty()) {
                int[] tmp = que.poll();    
                
                for (int[] dir : direct) {
                    int newRow = tmp[0] + dir[0];
                    int newCol = tmp[1] + dir[1];
                    if (newRow < 0 || newCol < 0 || newRow >= rows || newCol >= cols || visited[newRow][newCol]) continue;
                    visited[newRow][newCol] = true;
                    que.add(new int[] {newRow, newCol});
                    cells[indx++] = new int[] {newRow, newCol};
                }
            } 
            return cells;
        }
    }
}
