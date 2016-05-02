package template;

public class Main {

	public static void main(String args[]) {
		System.out.println(reverse("AMOS"));
		
	}
	
	public static String reverse(String string){
		if(string.length()==0)return string;
		String first = ""+string.charAt(0);
		return reverse(string.substring(1))+first;
	}
}
