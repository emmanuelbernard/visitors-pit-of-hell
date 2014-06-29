package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public interface EntityEntryVisitor {
	Object accept(ChainableEntityEntry entityEntityEntry);

}
