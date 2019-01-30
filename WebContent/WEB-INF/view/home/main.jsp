<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:include page="top.jsp"/>
    <link rel="stylesheet" href="${css}/home/main.css" />
	<div class="grid-contect-container">
	  <div class="grid-item" id="item1"><b>고객 전용</b><br>
	    <a href="#" id="cust_join">회원가입</a>
	    <a href="#" id="cust_login">로 그 인</a><br>
	  </div>
	  <div class="grid-item" id="item2"><b>직원 전용</b><br>
	    <a href="#" id="emp_register">사원 등록</a>
	    <a href="#" id="emp_access">접속 요청</a><br>
	  </div>
	</div>

<jsp:include page="bottom.jsp"/>
<script>
	$('#emp_register').click(function(){
		location.assign('employee.do?cmd=move&page=register');
	});

</script>