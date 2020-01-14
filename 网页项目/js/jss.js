let person ={
	useName;
	password;
}
fuction check(name){
	if(name.equals()){
		alert('该用户名已存在');
	}else{
		var newpassword=prompt('请输入密码');
		person.password =newpassword;
		alert('注册成功');
	}
}
fuction check2(name){
	if(name.equals()){
		var midpassword =prompt('请输入密码');
		if(person.password.equals(midpassword)){
			alert('登录成功');
		}else{
			alert('密码错误');
		}
	}
}