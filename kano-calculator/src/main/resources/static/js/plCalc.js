/**
 * 
 */
function calcTotalMoney(){
	var storeMoney = parseFloat(document.getElementById("storeMoney").value);
	var income = parseFloat(document.getElementById("income").value);
	var totalMoney = storeMoney + income;
	document.getElementById("totalMoney").value = totalMoney
}

const storeMoneyForm = document.getElementById("storeMoney");
const incomeForm = document.getElementById("income");

storeMoneyForm.addEventListener('blur', calcTotalMoney);
incomeForm.addEventListener('blur', calcTotalMoney);
