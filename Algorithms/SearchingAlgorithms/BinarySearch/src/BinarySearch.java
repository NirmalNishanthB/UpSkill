public class BinarySearch {
    public static int initiateSearch(int[] array, int x){
        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int middlePosition = low+high/2;
            int middleNumber = array[middlePosition];
            if(x==middleNumber){
                return middlePosition;
            }
            else if(x<middleNumber){
                high = middlePosition-1;
            }
            else if(x>middleNumber){
                low = middlePosition+1;
            }
        }
        return -1;
    }
}
