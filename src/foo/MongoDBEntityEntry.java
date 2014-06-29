package foo;

import java.util.Map;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class MongoDBEntityEntry implements MongoChainableEntityEntry {
	ChainableEntityEntry next;
	DBObject dbObject;
	Setting mongoSetting;


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

	@Override
	public Object visit(OGmEntityEntryVisitor visitor) {
		return visitor.accept(this);
	}


}
