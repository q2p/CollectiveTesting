package q2p.collectivetesting;

abstract class Algorithm {
	final String name;
	protected Algorithm(final String name) {
		this.name = name;
	}
	
	final void print() {
		final int best  = bestCase(CollectiveTesting.imgs);
		final int worst = worstCase(CollectiveTesting.imgs);
		
		System.out.println(name);
		if(worst == best) {
			System.out.println("\tTotal: " + best);
		} else {
			System.out.println("\tBest:  " + best);
			System.out.println("\tWorst: " + worst);
		}
	}

	protected abstract int bestCase(final int items);
	protected abstract int worstCase(final int items);
}