

	
	
	class Money
	{
		double amt = 50
		String cry = 'USD'
		Money(String cry, double amt)
		{
			this.amt = amt
			this.cry = cry
			
		}
		def plus(Money m1)
		{
			return new Money(this.cry + ","+m1.cry,this.amt+m1.amt)
		}
		def minus(Money m2)
		{
			return new Money(this.cry + ","+m2.cry,this.amt-m2.amt)
		}
		 public static void main(args)
		 {
			 Money m3 = new Money("USD",60)
			 
			 Money m4 = new Money("USD",70)
			 
			 Money m5 = m3+m4
			 println m5.amt
			 println m5.cry
			 
		 }
	}
	
	
	
	class MoneyTest{
		
		public static void main(args)
		 {
			 Money m3 = new Money("USD",60)
			 
			 Money m4 = new Money("USD",70)
			 
			 Money m5 = m3+m4
			 println m5.amt
			 println m5.cry
			 
		 }
	}

