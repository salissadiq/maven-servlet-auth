<%@include file="header.jsp" %>
<body>
<div class="bg-green-300 flex justify-between items-center h-[70px] px-5">
	<div class="font-semibold">Maven Auth</div>
	<div>
	<a href="logout.jsp">Logout</a>
	</div>
</div>
<h2>Welcome ${user.getFullName() }</h2>
</body>
</html>