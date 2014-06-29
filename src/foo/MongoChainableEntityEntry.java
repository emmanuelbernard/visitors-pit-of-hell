package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public interface MongoChainableEntityEntry extends ChainableEntityEntry {

	public Object visit(OGmEntityEntryVisitor visitor);

}
