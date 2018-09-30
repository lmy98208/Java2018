/**
 * 
 */
package stugrade;

/**
 * @author 19160209
 *
 */
public class StuGrade {
	private int grade=0;
	StuGrade(int grade)
	{
		this.grade=grade;
	}
	public void PrintGrade()
	{
		System.out.print(grade+"\t");
	}
	public int GetGrade()
	{
		return grade;
	}
}
