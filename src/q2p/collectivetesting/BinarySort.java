package q2p.collectivetesting;


final class BinarySort extends Algorithm {
	BinarySort() {
		super("Binary sort");
	}

	protected final int bestCase(final int items) {
		int q = 0;
		for(int i = 1; i < items; i++)
			q += best(i);
		
		return q;
	}
	
	private final int best(final int length) {
		if(length == 1)
			return 1;
		
		final int mid = length / 2;
		
		final int min = Math.min(length - (mid + 1), mid);
		
		return min == 0 ? 0 : 1 + best(min);
	}

	protected final int worstCase(final int items) {
		int q = 0;
		for(int i = 1; i < items; i++)
			q += worst(i);
		
		return q;
	}
	
	private final int worst(final int length) {
		if(length == 1)
			return 1;
		
		final int mid = length / 2;
		
		return 1 + worst(Math.max(length - (mid + 1), mid));
	}
}