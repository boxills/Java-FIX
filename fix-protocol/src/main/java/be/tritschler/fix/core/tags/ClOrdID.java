package be.tritschler.fix.core.tags;

public class ClOrdID extends Tag {

	public static final String TAG = "11";
	public static final String NAME = "ClOrdID"; 
	
	public ClOrdID () {
		this.tagId = TAG;
		this.tagName = NAME;
	}

	@Override
	public boolean isValid(String tag) {
		if (!isValidStructure(tag)) return false;
		
		return true;
	}

	@Override
	public int getGroupId() {
		return Constants.BODY;
	}
	
}
