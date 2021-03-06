var user = user || {}
user = (function(){
	let _
	let init = function(){
		 _ = sessionStorage.getItem('context')		 
	}
	let join = function(payload){
		$.ajax({
			url : _+`/user/join`,
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
				location.href = _+`/location/main/Home`
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