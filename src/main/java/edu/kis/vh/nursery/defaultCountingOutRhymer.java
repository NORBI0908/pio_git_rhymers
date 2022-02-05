package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	private static final int TOTAL_NUMBERS = 12;

	private static final int TOTAL_VALUE = -1;
	
	
	
	
	
	
	
	

	private final int[]numbers = new int[TOTAL_NUMBERS];
	
	public int total = TOTAL_VALUE;

	public int getTotal() {
		return total;
	}

	
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

		public boolean callCheck() {
			return total == TOTAL_VALUE;
		}
		
			public boolean isFull() {
				return total == 11;
			}
		
				protected int peekaboo() {
					if (callCheck())
						return TOTAL_VALUE;
					return numbers[total];
				}
			
					public int countOut() {
						if (callCheck())
							return TOTAL_VALUE;
						return numbers[total--];
					}
					

}
