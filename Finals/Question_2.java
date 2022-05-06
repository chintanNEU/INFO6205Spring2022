package com.company;

public class Question_2 {


    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int res = 0;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1' && visited[i][j] == false) {
                    res++;
                    visitNeighbours(grid, visited, i, j);
                }
            }
        }
        return res;
    }

    private static void visitNeighbours(char[][] grid, boolean[][] visited, int row, int col) {
        // out of bound
        if(row < 0 || col < 0 || row > grid.length - 1 || col > grid[0].length - 1) {
            return;
        }
        // already visited
        if(visited[row][col] == true) {
            return;
        }
        // not island
        if(grid[row][col] == '0') {
            return;
        }
        visited[row][col] = true;
        visitNeighbours(grid, visited, row + 1, col);
        visitNeighbours(grid, visited, row - 1, col);
        visitNeighbours(grid, visited, row, col + 1);
        visitNeighbours(grid, visited, row, col - 1);
    }
    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(numIslands(grid1));

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(numIslands(grid2));
    }
}

