package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][] array = new int[10][10];
        for(int i=0;i<2;i++){
            for (int j=0;j<10;j++){
                array[i][j]=j+1;
            }
        }
        for(int i=0;i<10;i++){
            array[2][i]=array[1][i]*array[0][i];
        }
            for (int j=0;j<10;j++) {
                System.out.println(array[0][j]+" * "+array[1][j]+" = "+array[2][j]);
            }
    }
}
