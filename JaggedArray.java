package com.xworkz.java.Arrays.JaggedArray;
/*0 1 2 
3 4 5 6 
7 
8 9 */
public class JaggedArray {
	public static void main(String[] args) {
		int[][] jarray=new int[4][];
		jarray[0]=new int[3];
		jarray[1]=new int[4];
		jarray[2]=new int[1];
		jarray[3]=new int[2];
		
		int num=0;
		for(int i=0;i<jarray.length;i++) {
			for(int j=0;j<jarray[i].length;j++) {
				jarray[i][j]=num;
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
