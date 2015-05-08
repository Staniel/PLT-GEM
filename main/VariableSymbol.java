import java.util.ArrayList;


public class VariableSymbol {
	String type;
	int arrayDimension;
//	Object value;
	boolean isFunction;
	ArrayList<VariableSymbol> paras;
	
	public VariableSymbol(String type) {
		this.type = type;
		this.arrayDimension = 0;
		this.isFunction = false;
		this.paras = null;
	}
	
	public VariableSymbol(String type, int arrayDimension) {
		this.type = type;
		this.arrayDimension = arrayDimension;
		this.isFunction = false;
		this.paras = null;
	}
	
	public VariableSymbol(String type, boolean isFunction, ArrayList<VariableSymbol> paras) {
		this.type = type;
		this.arrayDimension = 0;
		this.isFunction = isFunction;
		this.paras = paras;
	}

}
