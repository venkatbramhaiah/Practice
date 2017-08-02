$(document).ready(function(){
	
	$("#button").click(function(){
		
		validateForm();
		
		if( fnCheck == false || lnameCheck == false || ageCheck == false ){
			return;
		}
		
		var fname=$("#fname").val();
		var lname=$("#lname").val();
		var age=$("#AgeDropdownId").val();
		var dob=$("#dob").val();
		var gen=$("#gen").val();
		
		var sendData={FirstName:fname, LastName:lname, Age:age, DOB:dob, Gender:gen};
		var getData= JSON.stringify(sendData);
		
		
		
		$.ajax({
			type:"POST", url:"/firstservlet", dataType:'json',data:'data='+getData, success:function(data){alert(data)}
		});
	});
	
	
	
});