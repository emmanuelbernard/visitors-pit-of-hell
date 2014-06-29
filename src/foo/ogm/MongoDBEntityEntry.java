package foo.ogm;

import foo.core.ChainableEntityEntry;
import foo.core.EntityEntryVisitor;
import foo.other.DBObject;

public class MongoDBEntityEntry implements ChainableEntityEntry {
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
		if ( visitor instanceof OgmEntityEntryVisitor ) {
			OgmEntityEntryVisitor v = (OgmEntityEntryVisitor) visitor;
			return v.accept(this);
		}
		return visitor.accept(this);
	}

}
