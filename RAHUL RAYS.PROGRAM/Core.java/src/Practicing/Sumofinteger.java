package Practicing;

public class Sumofinteger {
	public static void main(String[] args) {
		String[] s = { "ab11", "ah2jkb", "hj96y78" };
		int sum = 0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				if (c >= '0' && c <= '9') {
					
					int num = Integer.parseInt(String.valueOf(s[i].charAt(j)));
					System.out.println(num);
					//System.out.println("\t");
					sum = sum + num;
					num = 0;
				}

			}

		}
		System.out.println("");
		System.out.println("sum = "+sum);
	}

}
