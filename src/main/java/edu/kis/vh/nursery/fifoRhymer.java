package edu.kis.vh.nursery;

public class fifoRhymer extends defaultCountingOutRhymer {

	public final defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
