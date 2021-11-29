/*Precondition: data is sorted (increasing order)
 *@param data: the numbers to search through
 *@param target: the number you want to find
 *@return the index of data that contains the target value. Return -1 if the value is not in the array.
 *If there are multiple copies return the one you find first using
 *(min+max)/2 method described.
 */
public static int binarySearch(int[]data, int target){
  int start = 0;
  int end = data[data.length - 1];
  int mid = (start + end) / 2;
  if (data.length > 1){
    while (end > start){
      if (data[mid] == target){
        return mid;
      } else if (data[mid] > target){
        start = mid + 1;
        int mid = (start + end) / 2;
      } else if (data[mid] < target){
        end = mid - 1;
        int mid = (start + end) / 2;
      }
    }
  }
}
