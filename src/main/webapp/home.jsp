<%@include file="header.jsp" %>
    <%
    response.setHeader("cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    response.setHeader("pragma", "no-cache"); //HTTP 1.0
    response.setHeader("Expires", "0"); // Proxys
    %>
<body>
<div class="bg-green-300 flex justify-between items-center h-[70px] px-5">
	<div class="font-semibold">Maven Auth</div>
	<div>
	<a href="logout">Logout</a>
	</div>
</div>
<h2>Welcome ${user.getFullName() }</h2>
</body>
</html>