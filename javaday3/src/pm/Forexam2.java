package pm;

public class Forexam2 {
	public static void main(String[] args) {
		
		
		int[] marks = {90,25,67,45,80};
		
		String grade = "A";
		for( int i =0; i<marks.length; i++) {
			if(marks[i] >=90) {
				grade = "A";
			} else if (marks[i] >= 80) {
				grade = "B";
			} else if (marks[i] >= 70) {
				grade = "C";
			} else if (marks[i] >= 60) {
				grade = "D";
			} else if (marks[i] <= 50) {
				grade = "F";
			}
			System.out.println((i+1)+"번 학생은 " + grade + "학점 입니다." );
			continue;
		}
	}

}
