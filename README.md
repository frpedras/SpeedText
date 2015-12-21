# SpeedText 
A plugin to [Pidesco](https://github.com/andre-santos-pt/pidesco.git) (IDE created for learning purposes) based on Eclipse autocomplete

It has 2 extension points, know more about them here:
- [Sort List](https://github.com/frpedras/SpeedText/wiki/Extension-point:-Sort-List)
- Extra Info:
	Implement the interface "SpeedTextExtraInfo" so you can receive the suggestion list and the file where the methods/variables can be found. Returns a list with extra informations, must have the same size and order as the list received.
	