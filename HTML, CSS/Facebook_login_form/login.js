/**
 * 
 * neu username la admin va pass la 12345 thi moi thong qua
 */
function checkLogin(username, password){
	var usn = document.getElementById("username");
	var pass = document.getElementById("password");
	if(usn.value == "admin" && pass.value == "12345"){
		alert("Login sucess!!! Welcome "+ usn.value);
	}
	else alert("Login fail!!!");
}