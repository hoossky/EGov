var user = user || {}
user = (function(){
	let _
	let init = function(){
		 _ = sessionStorage.getItem('context'),
		 javascript = sessionStorage.getItem('javascript'),
		 session = sessionStorage.getItem('session')
	}
	let join = function(payload){
		$.ajax({
			url : _+`/user`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				
				location.href = _+`/location/user/Login`
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url : _+`/user/${payload.userid}`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				alert(res)
			},
			error: function(err){
				alert(err)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userid')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
	}
	return {init, join, login, logout}
})()