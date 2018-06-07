package test0524_2;

public class TestSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray={20,10,50,40,30,70,60,80,90,100};
		int len=myArray.length;
		SortArray mysort= new SortArray();
		mysort.BubbleSort(myArray, len);
	}

}
