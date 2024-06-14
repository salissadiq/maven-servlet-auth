<%@include file="header.jsp" %>
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
	</div>
</div>
</body>
</html>
