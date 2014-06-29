package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class CoreOrmEntityEntry implements ChainableEntityEntry {
	ChainableEntityEntry next;
	String state1;
	Integer state2;


	@Override
	public ChainableEntityEntry next() {
		return next;
	}

	@Override
	public void addNext(ChainableEntityEntry newEntityEntry) {
		if (next == null) {
			next = newEntityEntry;
		}
		else {
			next.addNext( newEntityEntry );
		}
	}

	@Override
	public Object visit(EntityEntryVisitor visitor) {
		return visitor.accept(this);
	}
}
