package foo.ogm;

import foo.core.ChainableEntityEntry;
import foo.core.EntityEntryVisitor;

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

