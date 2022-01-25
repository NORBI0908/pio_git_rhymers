package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.fifoRhymer;
import edu.kis.vh.nursery.hanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {

	@Override
	public defaultCountingOutRhymer GetStandardRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
		return new fifoRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetHanoiRhymer() {
		return new hanoiRhymer();
	}

}
