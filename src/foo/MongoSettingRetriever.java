package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class MongoSettingRetriever implements EntityEntryVisitor {

	public Setting accept(MongoDBEntityEntry entry) {
		return entry.mongoSetting;
	}

	@Override
	public Object accept(ChainableEntityEntry entityEntityEntry) {
		if (entityEntityEntry.next() == null) return null;
		return entityEntityEntry.next().visit( this );
	}
}

