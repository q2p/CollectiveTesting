package q2p.collectivetesting;

final class CollectiveTesting {
	static final int imgs = 37_263;
	static final int peeps = 7_000_000;
	
	private static final Algorithm[] algorithms = new Algorithm[] {
		new MergeSort(),
		new BestOfSearch(),
		new BinarySort()
	};
	
	public static final void main(final String[] args) {
		for(final Algorithm algorithm : algorithms)
			algorithm.print();
	}
}