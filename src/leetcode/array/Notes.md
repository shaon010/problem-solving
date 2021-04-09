##Array Notes
This is the note section for arrays.
I will note down special notes here while learning the theory
and solving the problems.

####Sliding window notes:
Initially two point of an Array is set up.
Then we just need to move the two point together based on requirement, like for substring,
we moved i, when character[j] found in current subarray character listed in a set.
This is all about changing the initial location of array and calculating.

We can use this sliding concept in various way. Like for maximum subArray,
we moved from our initial sum value when we got new sum less than zero. (as
we know, there is no chance of increasing sum value by adding next array
index value with a value less than zero)