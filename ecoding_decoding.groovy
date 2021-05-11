<<<<<<< HEAD

def ecoding(){
	String uname="bhagyashri"
	String password="12345"
	
	def cat = uname.concat(":" + password)
	println	"concated string is " +cat
	
	def arr = cat.getBytes()
	println "Array of string in byte format is " +arr
	
	//Encoding byte array to encoded string using encodebase64
	encode = arr.encodeBase64()
	println "Encoded version of the byte array is "+encode
	
	return encode
	}
	
	//b. Decode the string by using the decodeBase64 method, and using the result as an argument to the String constructor.
	//Use the split method to return the original username and password.
	
	def decoding()
	{
		def prev=encoding().toString()
		decode = prev.decodeBase64()
		String S = new String(decode)
		println "Decoded byte array is "+ S.split(";")
		
	}

=======

def ecoding(){
	String uname="bhagyashri"
	String password="12345"
	
	def cat = uname.concat(":" + password)
	println	"concated string is " +cat
	
	def arr = cat.getBytes()
	println "Array of string in byte format is " +arr
	
	//Encoding byte array to encoded string using encodebase64
	encode = arr.encodeBase64()
	println "Encoded version of the byte array is "+encode
	
	return encode
	}
	
	//b. Decode the string by using the decodeBase64 method, and using the result as an argument to the String constructor.
	//Use the split method to return the original username and password.
	
	def decoding()
	{
		def prev=encoding().toString()
		decode = prev.decodeBase64()
		String S = new String(decode)
		println "Decoded byte array is "+ S.split(";")
		
	}

>>>>>>> 760d4c0003f496b2ae08770c6986ddc8c4a7bc26
