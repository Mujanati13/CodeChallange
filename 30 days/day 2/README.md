Algorithm:
<br>
<p>
  
`
Create an extra space dp, DP array to store the sub-problems.
Tackle some basic cases, if the length of the array is 0, print 0, if the length of the array is 1, print the first element, if the length of the array is 2, print maximum of two elements.
Update dp[0] as array[0] and dp[1] as maximum of array[0] and array[1]
Traverse the array from the second element (2nd index) to the end of array.
For every index, update dp[i] as maximum of dp[i-2] + array[i] and dp[i-1], this step defines the two cases, if an element is selected then the previous element cannot be selected and if an element is not selected then the previous element can be selected.
Print the value dp[n-1]
`
  </p>

