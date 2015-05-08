import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.misc.NotNull;

public class GEMExtendedListener extends GEMBaseListener {
	LinkedList<HashMap<String, VariableSymbol>> symbols = new LinkedList<HashMap<String, VariableSymbol>>();
	
	private void print(String str) {
		System.out.print(str);
	}
	
	private void ce() {
		print("Compile Error.\n");
	}

}
