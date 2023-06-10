package rays.com;

public class Ex18 {
public static void main(String[] args) {
	int [] arr = {1,2,3,4,5,6,41};
	int number = 41;
	int index = 1;
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==number) {
			index = -1;
		}
	}
	System.out.println(index);
}
}
