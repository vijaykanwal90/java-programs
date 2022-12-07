public class firstRepeatingValue {
    static int repeatingvalue(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[i] == arr[j]){/* return break the whole method */
                    ans = arr[i];
                    break;
                    // return arr[i];
                }
            }
        }
return ans;
    }
    public static void main(String[] args) {
       int[] array = {1,5,3,4,6,3,4};
       System.out.println(repeatingvalue(array));
    }
}
