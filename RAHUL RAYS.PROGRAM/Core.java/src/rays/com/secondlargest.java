package rays.com;

public class secondlargest {
	public static void main(String[] args) {
		int [] s = {6,5,2,9,4,7,54,87};
		int a=0;
		int b= s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i]>b) {
				a=b;
				b=s[i];
				}
			if (a<s[i]&& s[i]<b) {
				a=s[i];
				
			}
		}
		System.out.println(a);
	}

}
