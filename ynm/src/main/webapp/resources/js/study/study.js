/**
 * 
 */
$(document).ready(function(){ 
	var idx = $("#IDX").val();
	
	$("a[name='title']").on("click", function(e){ 
		//e.preventDefault();
		movePage("/ynm/study/edit/"+idx);
	});
	
	$("#btnWrite").on("click", function(e){ 
		idx *= 1;
		idx = idx + 1;
		movePage("/ynm/study/edit/"+idx);
	});

});




