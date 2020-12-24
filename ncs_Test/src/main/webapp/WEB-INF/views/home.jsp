<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
</head>
<body>
<h1>hello home!</h1>

 <%= request.getAttribute("BoardList") %>

	 <table>
        <thead>
            <tr>
                <th>아이디</th>
                <th>비밀번호</th>
                <th>이름</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${BoardList}" var="vo" varStatus="vs">
                <tr>
                    <td>${vo.id}</td>
                    <td>${vo.pw}</td>
                    <td>${vo.name}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
   



</body>
</html>