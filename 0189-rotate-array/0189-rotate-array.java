class Solution {
    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0||k<=0) return;
        k=k%n;
        if(k==0) return;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
        }
        public static void main(String[]args){
            int k=2;
            int arr[]={1,2,3,4,5};
            int n=5;
            System.out.println("The array after right rotation by 2 elements is: ");
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+" ");
            }
        }
}