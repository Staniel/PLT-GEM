
public class VariableSymbol {
	String type;
	Object value;
	int arrayDimension;
	
	public VariableSymbol(String type, int arrayDimension) {
		this.type = type;
		this.arrayDimension = arrayDimension;
	}
	
	public VariableSymbol(String type, Object value, int arrayDimension) {
		this.type = type;
		this.value = value;
		this.arrayDimension = arrayDimension;
	}
}
