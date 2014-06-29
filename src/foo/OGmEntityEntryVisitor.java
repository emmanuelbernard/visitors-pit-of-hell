package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public interface OGmEntityEntryVisitor extends EntityEntryVisitor {
	Object accept(MongoDBEntityEntry entityEntityEntry);
}
