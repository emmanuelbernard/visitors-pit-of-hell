package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public interface ChainableEntityEntry {
	ChainableEntityEntry next();
	void addNext(ChainableEntityEntry mongoEntry);
	Object visit(EntityEntryVisitor visitor);
}
