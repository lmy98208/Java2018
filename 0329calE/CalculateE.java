package java0329;

public class CalculateE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calE());
	}
	
	public static double calE()
	{
		double e=1;	
		double factor=1;//ЅЧіЛ	
		for(int i=1;;i++)
		{
			factor=i*factor;
			double term=1.0/factor;//По
			System.out.println(factor);
			e=e+term;
			if(term<0.0001) break;
		}
		return e;
	}

}
