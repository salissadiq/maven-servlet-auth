<%@include file="header.jsp" %>
<%
if(session.getAttribute("user") != null){
	response.sendRedirect("home.jsp");
}
%>
<body>
<div class="flex justify-center items-center h-screen mx-auto my-auto">
	<div class="border w-[500px] px-10 py-5 rounded-lg">
	<form action="LoginController" method="post">
		<div class="flex flex-col gap-7">
		<p class="text-red-500 font-medium">${message }</p>
			<input 
			type="text" 
			name="email" 
			class="border px-5 py-2 w-full rounded-lg focus:outline-none" 
			placeholder="Email"/>
			
			<input 
			type="password" 
			name="password" 
			class="border px-5 py-2 w-full rounded-lg focus:outline-none"  
			placeholder="Password"/>
			
			<div>
			<button type="submit" class="px-5 py-2 rounded-lg bg-green-400">Login </button>
			</div>
		</div>
	</form>
	<p class="text-center mt-5">Don't have an account yet? <a href="register.jsp" class="underline text-green-400" >Sign up</a></p>
	</div>
</div>
</body>
</html>
