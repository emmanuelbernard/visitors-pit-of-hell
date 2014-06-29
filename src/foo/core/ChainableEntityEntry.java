package foo.core;


public interface ChainableEntityEntry {
	ChainableEntityEntry next();
	void addNext(ChainableEntityEntry mongoEntry);
	Object visit(EntityEntryVisitor visitor);
}
