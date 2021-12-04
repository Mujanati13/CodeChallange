# Rotate Array By K  number
### METHOD : (Rotate one by one)  

```
leftRotate(arr[], d, n)
start
  For i = 0 to i < d
    Left rotate all elements of arr[] by one
end
```

To rotate by one, store arr[0] in a temporary variable temp, move `arr[1]` to `arr[0]`, `arr[2]` to `arr[1]` …and finally temp to `arr[n-1]`
Let us take the same example `arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2 `
Rotate `arr[]` by one 2 times 
We get `[2, 3, 4, 5, 6, 7, 1]` after first rotation and `[ 3, 4, 5, 6, 7, 1, 2]` after second rotation.
Below is the implementation of the above approach : 

**Java solution**

```java
class RotateArray {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[n-1] = temp;
    }
 
    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
```
