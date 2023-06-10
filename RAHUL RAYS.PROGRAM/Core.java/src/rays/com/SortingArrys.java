package rays.com;

public class SortingArrys {
public static void main(String[] args) {
	int[]arr = {11,1,2,401,1000,80,1009,949,410};
	int temp =0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1;j<arr.length;j++) {
			if (arr[i]>arr[j]) {
				temp = arr[i];
				arr[i]= arr[j];
				arr[j]= temp;
			}
			
		}
		System.out.println(arr[i]);
	}
	
}
}
