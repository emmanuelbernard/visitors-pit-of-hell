package foo.ogm;

import foo.core.EntityEntryVisitor;

public interface OgmEntityEntryVisitor extends EntityEntryVisitor {
	
	Object accept(MongoDBEntityEntry entityEntityEntry);

}
