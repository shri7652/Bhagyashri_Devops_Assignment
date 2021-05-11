
class wrapper {
	
	static void main(args) {
		
		//byte
		println Byte.MIN_VALUE
		
		//variable x
		def x=1+1.5
		print x
		print x.getClass().getName()
		
		def y=5/2
		println y
		println y.getClass().getName();
		
		//Create a byte variable with its maximum value. What do you get when you add 1 to it? 
		def byte B=Byte.MAX_VALUE
		println(B)
		B=B+1;
		println B 
		
		}
}
