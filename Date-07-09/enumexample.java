package Com.bhavna.task1;

public class enumexample {
	
	    Var1("First Variable"),
	    Var2("Second Variable"),
	    Var3("Third Variable");
	    
	    private final String info;
	    
	    private EnumExample(String info) {
	        this.info=info;
	    }
	    
	    public String getInfo() {
	        return info;
	    }
	}

