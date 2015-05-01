
public class VariableSymbol {
	String type;
	Object value;
	int arrayDimension;
	
	public VariableSymbol(String type) {
		this.type = type;
	}
	
	public VariableSymbol(String type, Object value) {
		this.type = type;
		this.value = value;
	}
}
