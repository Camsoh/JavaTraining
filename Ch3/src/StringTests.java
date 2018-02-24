
// https://stackoverflow.com/questions/19339088/main-method-not-found-even-if-ive-declared-it
// looks like you've declared a String class among your own classes.
public class StringTests {

	public static void main(String[] args) {
		String s = "HelloWorld";
		System.out.println(s.length());
	}

}
