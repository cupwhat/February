function ajaxFunc(url,data,callback){
	$.ajax({
		type: "POST",
		url: url,
		data: data,
		success: callback
	});
}