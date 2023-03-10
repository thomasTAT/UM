/* add loop and other code here ... in this simple exercise we are not
   going to concern ourselves with minimizing globals, etc */

var amount = 0;
var subtotal = 0;
for(var i=0; i<titles.length; i++) {
	amount = calculateTotal(quantities[i], prices[i]);
	subtotal += amount;
	outputCartRow(filenames[i], titles[i], quantities[i], prices[i], amount);
}
grandTotal(subtotal);

