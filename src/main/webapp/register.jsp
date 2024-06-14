<%@include file="header.jsp" %>
<body>
<div class="flex justify-center items-center h-screen mx-auto my-auto">
	<div class="border w-[500px] px-10 py-5 rounded-lg">
	<p class="text-center text-2xl font-semibold">Sign up Here</p>
	<form action="SignupController" method="post">
		<div class="flex flex-col gap-7">
		<p class="text-red-500 font-medium">${message }</p>
		<input 
			type="text" 
			name="fullName" 
			class="border px-5 py-2 w-full rounded-lg focus:outline-none" 
			placeholder="Full name"/>
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
			<button type="submit" class="px-5 py-2 rounded-lg bg-green-400">Sign up </button>
			</div>
		</div>
	</form>
	<p class="text-center mt-5">Already have an account? <a href="index.jsp" class="underline text-green-400" >Sign in</a></p>
	</div>
</div>
</body>
</html>