
	
	
		def isprime(int num) {
			int i=2
			for (i; i< num/2; i++) {
				
				if (num%2==0) {
					return false
				
				}else {
					
					return true
				}
			}
					
		}
		
		def x= isprime(5)
		println "Is the entered number a prime number?\n" +x
		

