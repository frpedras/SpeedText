# SpeedText 
A plugin to [Pidesco](https://github.com/andre-santos-pt/pidesco.git) (IDE created for learning purposes) based on Eclipse autocomplete

About the extensions points:

- Sort List:
	Implement the interface "SpeedTextSortList" so you can receive the sugestion list. After changing the order you must return it with the same elements.
- Extra Info:
	Implement the interface "SpeedTextExtraInfo" so you can receive the sugestion list and the file where the methods/variables can be found. Returns a list with extra informations, must have the same size and order as the list received.
	