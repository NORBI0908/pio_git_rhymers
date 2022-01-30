package edu.kis.vh.nursery;

public class hanoiRhymer extends defaultCountingOutRhymer {

int totalRejected = 0;

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
