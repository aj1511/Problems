
public class kth_smallest {
	
	
	static int kth(int arr[],int k) {
		
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if (arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int e:arr) {
			System.out.print(e+" ");
		}
		
		return arr[k-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,96,12,75,42,36,11};
		// 4,11,12,36,42,75,96
		// 0  1  2  3  4  5  6
		System.out.println("\n"+kth(a,3));

	}

}
