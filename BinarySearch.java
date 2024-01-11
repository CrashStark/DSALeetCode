class BS{
	public int search(int arr[],int low ,int high, int element){
		while(low<=high){
			int mid=low+(high+low/2);

			if(arr[mid]==element){
				return arr[mid];
			}
			if(arr[mid]<element)
			{
				low=mid+1;
			}else if(arr[mid]>element)
			{
				high=mid -1;
			}
		}

		return -1;
	}
}

class BinarySearch{
	public static void main(String[] args) {
		int arr[]={2,3,4,5,6,7,8,9};
		int low=0;
		int high=arr.length-1;
		int element=7;
		BS bs =new BS();
		int result=bs.search(arr,low,high,element);
		if(result==-1){
			System.out.println("Element is not found -_-");
		}else{
			System.out.println("Element found"+result);
		}
	}
}