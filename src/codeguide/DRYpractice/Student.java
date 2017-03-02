package codeguide.DRYpractice;

/**
 * Show student grade.
 * 
 * @author Dacharat Pankong
 *
 */
public class Student {
	
	public String name;
	
	public double score;
	
	/**
	 * Student have name and score.
	 * 
	 * @param name of student.
	 * @param score of student.
	 */
	public Student(String name, double score){
		this.name = name;
		this.score = score;
	}
	
	/**
	 * Check grade from score.
	 * 
	 * @return A if score more or equal 80.
	 * 		   B if score more or equal 70.
	 *         C if score more or equal 60.
	 *		   D if score more or equal 50.
	 *		   F if score is not in other case.
	 */
	public String grade(){ 
		//TODO rewrite more small code.
		//Hint : it can return with "A".
		String grade = "";
		if(this.score >= 80){
			grade = "A";
			return grade;
		}
		else if(this.score >= 70){
			grade = "B";
			return grade;
		}
		else if(this.score >= 60){
			grade = "C";
			return grade;
		}
		else if(this.score >= 50){
			grade = "D";
			return grade;
		}else{
			grade = "F";
			return grade;
		} 
	}
	
	/**
	 * Return student grade.
	 * 
	 * @return name and grade.
	 */
	public String toString(){
		//TODO rewrite code in one line.
		String text = "Student " + this.name + " gets grade " + this.grade() + ".";
		return text;
	}
	

}
