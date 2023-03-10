/* define functions here */

function calculateTotal(quantity, price) {
	return quantity * price;
}

function outputCartRow (file, title, quantity, price, total) {
	document.write('<tr>'
					+ '<td><img src="images/' + file + '"></td>'
					+ '<td>' + title + '</td>'
					+ '<td>' + quantity + '</td>'
					+ '<td>$' + price.toFixed(2) + '</td>'
					+ '<td>$' + total.toFixed(2) + '</td>'
					+ '</tr>');
}

function grandTotal (subtotal) {
	var tax = subtotal * 0.1;
	var shipping = (subtotal<1000) ? 40 : 0;
	var total = subtotal + tax + shipping;
	document.write('<tr class="totals">'
						+ '<td colspan="4">Subtotal</td>'
						+ '<td>$' + subtotal.toFixed(2) + '</td>'
					+ '</tr>'
					+ '<tr class="totals">'
						+ '<td colspan="4">Tax</td>'
						+ '<td>$' + tax.toFixed(2) + '</td>'
					+ '</tr>'
			        + '<tr class="totals">'
			            + '<td colspan="4">Shipping</td>'
			            + '<td>$' + shipping.toFixed(2) + '</td>'
			        + '</tr>'
			        + '<tr class="totals focus">'
			            + '<td colspan="4">Grand Total</td>'
			            + '<td>$' + total.toFixed(2) + '</td>'
			        + '</tr>');
}


        
