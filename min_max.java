
public class min_max_arr {
	public static class pair{
		int min,max;
	}
	public static pair getminmax(int arr[]) {
		pair minmax = new pair();
		minmax.max = arr[0];
		minmax.min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>minmax.max) {
				minmax.max = arr[i];
			}
			if(arr[i]<minmax.min) {
				minmax.min = arr[i];
			}
		}
		return minmax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,8,6,-96,1,2,6,222,5,1,52,4,5,6,3};
		
		pair as = getminmax(a);
		System.out.printf("Max is %d \n",as.max);
		System.out.printf("Min is %d",as.min);
	}
}
