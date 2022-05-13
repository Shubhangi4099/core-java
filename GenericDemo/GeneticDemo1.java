package GenericDemo;

public class GeneticDemo1 <T extends Number> {
	T data;
	GeneticDemo1 (T f)
	{
		this.data=f;
	}
	void getDisplay() {
		System.out.println("data="+data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneticDemo1<Integer> ob= new GeneticDemo1<Integer>(30);
		ob.getDisplay();
		GeneticDemo1<Double> ob1= new GeneticDemo1<Double>(3.113d);
		ob1.getDisplay();
		GeneticDemo1<Float> ob2= new GeneticDemo1<Float>(1.2f);
		ob2.getDisplay();
	}

}
