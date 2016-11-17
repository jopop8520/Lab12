interface StudentManager{
	abstract void show();
	abstract char grade();
}
class Student{
	String id, name, surname;
	static double score;
	static double midterm;
	static double fscore;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public static double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public static double getMidterm() {
		return midterm;
	}
	public void setMidterm(double midterm) {
		this.midterm = midterm;
	}
	public static double getFscore() {
		return fscore;
	}
	public void setFscore(double fscore) {
		this.fscore = fscore;
	}
	
	
}

public class TestInherit extends Student implements StudentManager{

	public static void main(String[] args) {
		TestInherit data = new TestInherit();
		data.setId("584277005");
		data.setName("Poomin");
		data.setSurname("Chinraj");
		data.setScore(20);
		data.setMidterm(25);
		data.setFscore(3);
		data.show();
		data.grade();

	}
	

	@Override
	public void show() {
		System.out.println("ID \t\t: "+getId());
		System.out.println("Name \t\t: "+getName());
		System.out.println("Surname \t: "+getSurname());
		System.out.println("Score \t\t: "+getScore());
		System.out.println("Midterm \t: "+getMidterm());
		System.out.println("Finalscore \t: "+getFscore());
		System.out.println("Totalscore \t: "+(getScore() + getMidterm() + getFscore()));
		System.out.println("Grade \t\t: "+grade());
	}

	@Override
	public char grade() {
		double Total=0;
		Total = getScore() + getMidterm() + getFscore();
		//System.out.println(Total);
		if(Total>=80)
			return 'A';
		if(Total>=70)
			return 'B';
		if(Total>=60)
			return 'C';
		if(Total>=50)
			return 'D';
		if(Total<50)
			return 'E';
		return 0;
		
	}

}
