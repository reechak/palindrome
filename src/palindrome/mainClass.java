package palindrome;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean x= isPalindrome("malayalam");
		System.out.println(x);
		boolean y =isEfficientPalindrome("malayalam");
		System.out.println(y);

	}

	public static boolean isPalindrome (String s)
	{
		final long startTime = System.nanoTime();
		if(s.length()==0)
			return false;
		
		int x = 0;
		int y = s.length() -1 ;
		 while(x<y)
		 {
			 if(s.charAt(x++)!=s.charAt(y--))
				 return false;
		 }
		 final long duration = System.nanoTime() - startTime;
		 System.out.println(duration);
		 return true;
	}
	
	public static boolean isEfficientPalindrome(String s) {
		final long startTime = System.nanoTime();
		int n= s.length();
		for(int i=0 ; i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n - i - 1)) {
				return false;
			}
		}
		 final long duration = System.nanoTime() - startTime;
		 System.out.println(duration);

		return true;
	}
	
	
}
