package q2p.collectivetesting;

final class MergeSort extends Algorithm {
	MergeSort() {
		super("Merge sort");
	}

	protected final int worstCase(final int items) {
		return bestCase(items);
	}

	protected final int bestCase(final int items) {
		if(items < 2)
			return 0;
		
		final int mid = items / 2;
		return bestCase(mid) + bestCase(items-mid) + items - 1;
	}
}