package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class DBObjectRetriever implements EntityEntryVisitor {

	public DBObject accept(MongoDBEntityEntry entry) {
		return entry.dbObject;
	}

	@Override
	public Object accept(ChainableEntityEntry entityEntityEntry) {
		if (entityEntityEntry.next() == null) return null;
		return entityEntityEntry.next().visit(this);
	}
}

