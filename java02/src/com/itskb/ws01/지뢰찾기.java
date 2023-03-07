package com.itskb.ws01;

import java.util.Random;
import java.util.Scanner;

public class 지뢰찾기 {
	public static void main(String[] args) {
		int mineMap[][] = new int[12][12];  //지뢰 정보 저장
		//임의의 좌표에 지뢰 5개 지정
		Random r = new Random(100);
		for (int i = 0; i < 5; i++) {
			int x = r.nextInt(10)+1;
			int y = r.nextInt(10)+1;
			mineMap[x][y] = 9; //9 : 지뢰 위치
			//지뢰 주위 좌표값을 1 증가
			mineMap[x-1][y-1]++; mineMap[x-1][y]++; mineMap[x-1][y+1]++;
			mineMap[x][y-1]++; 						mineMap[x][y+1]++;
			mineMap[x+1][y-1]++; mineMap[x+1][y]++; mineMap[x+1][y+1]++;
		}
		
		for (int[] mm : mineMap) {
			for (int i : mm) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		//게이머로부터 좌표 입력받아 열어주기
		boolean[][] userMap = new boolean[12][12]; //사용자 입력 좌표 표시 배열
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {
			System.out.println("X좌표 입력하세요(1~10) ");
			int ux = sc.nextInt();
			System.out.println("Y좌표 입력하세요(1~10) ");
			int uy = sc.nextInt();
			userMap[ux][uy] = true; //게이머가 입력한 좌표
			
			//게이머가 입력한 좌표 결과 표시하기
			for (int i = 0; i < userMap.length; i++) {
				for (int j = 0; j < userMap[i].length; j++) {
					if (userMap[i][j] == true) //게이머가 오픈한 좌표
						System.out.print(mineMap[i][j] + " ");
					else
						System.out.print("X ");
				}
				System.out.println();
			}
			
			if (mineMap[ux][uy]>=9) {
				count++;
				if (count==5) break;
			}
		}
		
		
	}
}
