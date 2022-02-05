package edu.kis.vh.nursery;

/**
 * @author nwilicki
 *	klasa hanoiRhymer z metodą publiczną countIn
 */
public class hanoiRhymer extends defaultCountingOutRhymer {

private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
//	Koblinacja klawiszy alt i strzałka przełącza widok między otwartymi plikami
}
