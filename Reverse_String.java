
public class Reverse_String {

	public static void main(String[] args) {
		System.out.println(rev("Kishore reddy"));

	}
	static String rev (String S) {
		String S1=" ";
		for(int i=S.length()-1;i>0;i--) {
			S1+=S.charAt(i);
		}
		return S1;
	}

}
