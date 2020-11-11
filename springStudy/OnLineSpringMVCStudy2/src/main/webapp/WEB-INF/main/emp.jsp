<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>사원 정보</h1>
	<form method="post" action="../main/emp_ok.do">
      <input type=text namd=empno size=15><br>
      <input type=text namd=ename size=15><br>
      <input type=text namd=ejob size=15><br>
      <input type=text namd=dept size=15><br>
      <input type=text namd=loc size=15><br>
      <button>전송</button>
   </form>
</body>
</html>