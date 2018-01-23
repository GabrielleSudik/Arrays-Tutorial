public class Application {
	public static void main(String[] args) {

		// ARRAYS tutorial:

		int value = 7;
		// "value" is value type.
		// pretend that typing int created a bucket just big enough for an
		// integer
		int[] values;
		// "values" is a reference type
		// it's more like it is labeling the array
		// it didn't create a bucket to hold the array
		// I gather that each element of the array gets its own bucket
		values = new int[3];
		// the reference of values points to those three things
		System.out.println(values[0]);
		// note that if you don't give an array its values,
		// java assigns some. or at least makes them 0.

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] + 2);
		}

		//ARRAYS OF STRINGS Tutorial:
		
		String[] words = new String[3];
		
		words[0] = "Hello";
		words[1] = "to";
		words[2] = "you";
		
		System.out.println(words[2]);
		
		String[] fruits = {"apples", "bananas", "kiwis", "oranges"};
		
		//here's the for each loop syntax:
		for(String fruit: fruits){
			System.out.println(fruit);
		}
		
		//more on reference vs value:
		//declare an int. it allocates a certain amount of memory for an int
		//declare a String. remember that String is a class, and we don't know its length.
		//so declaring a String creates a reference. (default value is null).
		//we don't know how much memory will be needed for a string until it is initialized.
		//arrays are also references. until we know how long the array is, we don't know how much memory is needed.
		//when each String or element is initialized, the memory is allocated.
		
	}
}
