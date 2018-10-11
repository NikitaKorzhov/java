
public class Main {
	public static void  swap(int[] arr,int i,int j) {
		int c=arr[i];
		arr[i]=arr[j];
		arr[j]=c;
	}
	public static int[] sort(int[] arr) {
		int[] b=new int[arr.length];
		for (int i=0; i<b.length;i++) {
			b[i]=arr[i];
		}
		for( int i=0;i<b.length;i++) {
			for(int j=1;j<b.length-i;j++) {
				if(b[j]<b[j-1]) {
					swap(b, j, j-1);
				}
			}
		}
		return b;
	}
public static void printArr(int[] arr) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {6,9,4,1,10,3,8,40,5};
		printArr(ar);
		System.out.println("");
		printArr(sort(ar));

	}

}
