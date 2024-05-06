package Homework4;

public class Homework4_6 {
	public static void main(String args[]) {
		int[][] score = {{10, 35, 40, 100, 90, 85, 75, 70 }, {37, 75, 77, 89, 64, 75, 70, 95 },
						{100, 70, 79, 90, 75, 70, 79, 90 }, {77, 95, 70, 89, 60, 75, 85, 89 },
						{98, 70, 89, 90, 75, 90, 89, 90 }, {90, 80, 100, 75, 50, 20, 99, 75 }};

		int [] num = new int[8];
		int highScore, studentID;
		
		for(int i = 0; i < score.length; i++) {
			highScore = score[i][0];
			studentID = 0;
			for(int j = 1; j < score[i].length; j++) {
				if(highScore < score[i][j]) {
					highScore = score[i][j];
					studentID = j;  //此為陣列索引值
				}
			}
			num[studentID]++;  //計算最高分次數
		}
		for(int k = 0; k < 8; k++) {
			System.out.println(k+1 + "號同學最高分次數為" + num[k]);
		}
	}
}
