package Com.bhavna.task1;

public class Nodes {
	private String data;
	private Nodes nxt;
	private Nodes prv;
	
	protected String getData() {
		return data;
	}
	protected void setData(String data) {
		this.data = data;
	}
	protected Nodes getNxt() {
		return nxt;
	}
	protected void setNxt(Nodes nxt) {
		this.nxt = nxt;
	}
	protected Nodes getPrv() {
		return prv;
	}
	protected void setPrv(Nodes prv) {
		this.prv = prv;
	}
	
	public static Nodes getNode(String data) {
		Nodes node = new Nodes();
		node.data = data;
		node.nxt = null;
		node.prv = null;
		return node;
		
	}

}
