

//Using the Groovy JDK, access your home page and display the source code. Print the length of each line of the home page. 


class homepage {

	static void main(args) {
	def urlContents= "http://v1.ewedding.com/".toURL().getText();
	println urlContents.eachLine { println it }
	println urlContents.eachLine {  it -> println "the line is :" + "and its size :" +it.size()}
	
		
	}
	
	}
