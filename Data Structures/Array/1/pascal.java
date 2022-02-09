public class Solution {
    public List<Integer> getRow(int k) {
        List list = new ArrayList<>();
        int[] arr = new int[k+1];
        Arrays.fill(arr , 0);
        arr[0] = 1;

        for(int i = 1 ; i<k ; i++){
            for(int j = i ; j>0 ; j--){
                arr[j] = arr[j] + arr[j-1];
            }
        }
        return Arrays.asList(arr);
    }
}