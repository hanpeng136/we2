
//$(function(){
//	$("#vid").click(function (event) {
//	    event.stopPropagation();//阻止mousedown 事件冒泡（注意只阻止了mousedown事件）
//	    event.preventDefault();//阻止当前元素默认事件
//		 $(".videoFrame").show();   
//	});
//	$(document).click(function () {
//		$(".videoFrame").hide();
//	});
//})
$(function(){
	$(".del").click(function(){
		var sid=$(this).attr("han");
		alert(sid);
		DeleteContact(sid);
	})
	$(".up").click(function(){
		var sid=$(this).attr("peng");
			window.location.href="modifyContact.jsp?contact_id="+sid+"";
	})
//	$("#vid").click(function (event) {
//	    event.stopPropagation();//阻止mousedown 事件冒泡（注意只阻止了mousedown事件）
//	    event.preventDefault();//阻止当前元素默认事件
//		 $(".videoFrame").show();   
//	});
//	$(document).click(function () {
//		$(".videoFrame").hide();
//	});
})
function DeleteContact(contact_id){
	$.ajax({
		url: "DeleteContactServlet.do",
		data:{
			contact_id:contact_id
		},
		async:false,
        type: "POST",
        contentType:"application/x-www-form-urlencoded",
        success: function(re) {
        	window.location.reload();
        },
	    error:function (XMLHttpRequest, textStatus, errorThrown) {
	    	alert("失败")
         }   
	});
}

