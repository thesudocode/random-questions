# Random Questions

## Question1.java

##### Question 1.   
We have two arrays as input  
   ***Array1***: [7,12,11,4]  
   ***Array2***: [1,3,2,0] --> This is the index array (i.e. positions of Array1 if it is sorted).
   
   Now we need to sort **Array1** using index array, **Array2**.
   
   **Time complexity** should be O(N).  
   **Space complexity** can be greater than O(1) but should be less than O(N).
   
   **P.S.** You should not use extra array because that becomes O(N) space complexity.
   
##### Solution 1.
As the index array has all the information we need to sort Array1.  
Thus, we will sort Array1 by implementing any sorting algorithm on Array2, 
we will get the desired result.  

So, all we need to do is at the time of sorting Array2, 
place the corresponding elements of Array1 at the right positions.  