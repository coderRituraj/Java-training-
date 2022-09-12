package Com.bhavna.task2;
/*
 Write Program to accept the Company records as cId,name,city,turnover,number of emloyees
and
1.Display All Companies
2.Display All Companies having employee greater than 100
3. Display All Companies  from Patan
4. Display All Companies Record having turnover between 1000-10000
 */
public class CompanyDetail {
	private int cid;
	private String cname;
	private String city;
	private double turnover;
	private int emp_number;
	
	protected int getCid() {
		return cid;
	}
	protected void setCid(int cid) {
		this.cid = cid;
	}
	protected String getCname() {
		return cname;
	}
	protected void setCname(String cname) {
		this.cname = cname;
	}
	protected String getCity() {
		return city;
	}
	protected void setCity(String city) {
		this.city = city;
	}
	protected double getTurnover() {
		return turnover;
	}
	protected void setTurnover(double turnover) {
		this.turnover = turnover;
	}
	protected int getEmp_number() {
		return emp_number;
	}
	protected void setEmp_number(int emp_number) {
		this.emp_number = emp_number;
	}
	public CompanyDetail(int cid, String cname, String city, double turnover, int emp_number) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
		this.turnover = turnover;
		this.emp_number = emp_number;
	}
	public void display() {
		System.out.println(cid+" "+cname+" "+city+" "+turnover+" "+emp_number);
	}
	

}
