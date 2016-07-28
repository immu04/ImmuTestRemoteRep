
public class ImmuTest {

	public static void main(String[] args) {
		ImmuTest immuTest = new ImmuTest();
		immuTest.display();
		System.out.println("End of the Program");
	}

	private void display() {
		int[] items = {1,2,3,4,5,6};
		for(int item : items){
			System.out.println(item);
		} 
		
	}

}
