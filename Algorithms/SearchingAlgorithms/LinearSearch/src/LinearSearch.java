public class LinearSearch {
    public static int search(int[] array, int target){
        int size = array.length-1;
        for(int i=0; i<=size ; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
}
