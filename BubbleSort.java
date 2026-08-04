//BUBBLE SORT IS USED TO COMPARE THE ADJACENT ELEMENTS
//{2,4,8,4,2,6,8}={2,2,4,4,6,8,8}
public class BubbleSort {

	public static void main(String[] args) {
		
   int arr[] = {2,4,5,8,4,5,6,7,1,2,3,4};
   for(int i=0;i<arr.length-1;i++) {
	   for(int j=0;j<arr.length-1;j++) {
		   if(arr[j]>arr[j+1]) {
			   int temp = arr[j];
			   arr[j] = arr[j+1];
			   arr[j+1] = temp;
		   }
	   }
   }
   for(int i=0;i<arr.length-1;i++) {
	   System.out.print(arr[i]+ " ");
   }
	}

}
