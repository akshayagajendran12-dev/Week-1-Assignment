# Week-1-Assignment
Algorithm: Warehouse Inventory Balancer
Start.
Initialize two integer arrays, sectionA and sectionB, with equal lengths.
Initialize totalA and totalB to zero.
Traverse both arrays and calculate the total quantity of each section.
Compare totalA and totalB.
If both totals are equal, set the status to Balanced.
Otherwise, set the status to Not Balanced.
Initialize the maximum quantity to the smallest possible integer.
Traverse both arrays to find the highest quantity.
Store the highest quantity, its section name, and its item index.
Display the total quantities of both sections and the balance status.
Display the highest quantity, section name, and item number.
Stop.
Sample Input
Section A: {20, 15, 30}
Section B: {25, 10, 30}
Sample Output
Section A Total: 65 | Section B Total: 65 | Status: Balanced
Highest Quantity: 30 (Section A, Item 3)

Concepts Used
Arrays
Loops
Sum accumulation
Conditional statements
Finding the maximum value and its index
2)
Algorithm: Movie Review Word Length Profiler
Start.
Accept a movie review as a string.
Split the review into individual words using whitespace as the delimiter.
Initialize three counters: shortCount, mediumCount, and longCount to zero.
Traverse each word in the review.
Calculate the length of the current word.
Classify the word based on its length:
If the length is between 1 and 4 characters, increment shortCount.
If the length is between 5 and 8 characters, increment mediumCount.
If the length is 9 or more characters, increment longCount.
Repeat the process until all words have been examined.
Display the total number of short, medium, and long words.
Stop.
Sample Input
This movie was absolutely fantastic and thrilling

Sample Output
Short: 3 | Medium: 1 | Long: 3

Concepts Used
Strings
String splitting
Loops
Conditional statements
Counting and categorization
