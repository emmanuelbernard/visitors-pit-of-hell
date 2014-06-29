package foo;

/**
 * @author Emmanuel Bernard <emmanuel@hibernate.org>
 */
public class RunMe {
	public static void main(String[] foo) {
		ChainableEntityEntry entityEntry = getEntityEntry();
		DBObjectRetriever dbo = new DBObjectRetriever();

		Object maybeDBobject = entityEntry.visit( dbo );
		System.out.println( "Is an DBObject: " + ( maybeDBobject.getClass() == DBObject.class ) );
		//return -1;
	}

	public static ChainableEntityEntry getEntityEntry() {
		CoreOrmEntityEntry entry = new CoreOrmEntityEntry();
		entry.state1 = "foo";
		MongoDBEntityEntry mongoEntry = new MongoDBEntityEntry();
		mongoEntry.dbObject = new DBObject();
		mongoEntry.mongoSetting = new Setting();
		entry.addNext(mongoEntry);
		return entry;
	}
}
