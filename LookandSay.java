
public class LookandSay {
	//  This is the famous Look and Say algorithm
	// code is taken from https://www.youtube.com/watch?v=-wB1xj-kOe0&t=137s
	
	public static String lookandSay(int n) {
		if (n <= 0)
			return "";
		String res = "1";
		while (n > 1) {
			StringBuilder cur = new StringBuilder();
			for (int i=0; i < res.length();i++) {
				int count = 1;
				while (i < res.length()-1 && res.charAt(i) == res.charAt(i+1)) {
					++count;
					++i;
				}
				cur.append(count).append(res.charAt(i));
			}
			res = cur.toString();
			--n;
			System.out.println("Printing the res "+res);
		}
		return res;
		
	}
	/**static String countnndSay(int n) {
		// Base cases
		if (n == 1)
			return "1";
		if (n == 2)
			return "11";

		// Find n'th term by generating
		// all terms from 3 to n-1.
		// Every term is generated
		// using previous term

		// Initialize previous term
		String str = "11";
		for (int i = 3; i <= n; i++) {
			// In below for loop, previous
			// character is processed in
			// current iteration. That is
			// why a dummy character is
			// added to make sure that loop
			// runs one extra iteration.
			str += '$';
			int len = str.length();
			System.out.println("Entering the main for loop with "+str);

			int cnt = 1; // Initialize count
							// of matching chars
			String tmp = ""; // Initialize i'th
								// term in series
			char[] arr = str.toCharArray();

			// Process previous term
			// to find the next term
			for (int j = 1; j < len; j++) {
				// If current character
				// does't match
				if (arr[j] != arr[j - 1]) {
					// Append count of
					// str[j-1] to temp
					tmp =tmp+ cnt;
					System.out.println("The value of tmp is before"+tmp);

					// Append str[j-1]
					tmp =tmp+ arr[j - 1];

					// Reset count
					cnt = 1;
					System.out.println("The value of j-1 is "+(j-1));
					System.out.println("The value of tmp is "+tmp);
				}

				// If matches, then increment
				// count of matching characters
				else
					cnt++;
			}

			// Update str
			str = tmp;
		}

		return str;
	}    */
	public static void main(String[] args) {
		  int N = 3; 
	       // System.out.println(countnndSay(N)); 
		  System.out.println(lookandSay(N)); 
	}

}
