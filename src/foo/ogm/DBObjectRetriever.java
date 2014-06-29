package foo.ogm;

import foo.core.ChainableEntityEntry;
import foo.other.DBObject;

public class DBObjectRetriever implements OgmEntityEntryVisitor {

	@Override
	public DBObject accept(MongoDBEntityEntry entry) {
		return entry.dbObject;
	}

	@Override
	public Object accept(ChainableEntityEntry entityEntityEntry) {
		if (entityEntityEntry.next() == null) return null;
		return entityEntityEntry.next().visit(this);
	}
}

