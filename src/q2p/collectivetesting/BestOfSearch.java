package q2p.collectivetesting;

final class BestOfSearch extends Algorithm {
	BestOfSearch() {
		super("Best of all");
	}

	protected final int worstCase(final int items) {
		if(items < 2)
			return 0;
		
		final int mid = items / 2;
		return worstCase(mid) + worstCase(items-mid) + 1;
	}

	protected final int bestCase(final int items) {
		return items < 2 ? 0 : items-1;
	}
}