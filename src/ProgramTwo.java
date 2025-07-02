
class Invoice{
	private String prt_num; //part number
	private String prt_des;	//part description 
	private int prt_qua;	//part quantity 
	private double prt_pri;	//part price
	
	//Constructor
	public Invoice(String prt_num, String prt_des, int prt_qua, double prt_pri){
		this.prt_num = prt_num;
		this.prt_des = prt_des;
		
		if(!(prt_qua<=0)) {
			this.prt_qua = prt_qua;
		} else {
			this.prt_qua = 0;
		}
		
		if(!(prt_pri<=0)) {
			this.prt_pri = prt_pri;
		} else {
			this.prt_pri = 0;
		}
	}
	
	//@return the prt_num
	public String getPrt_num() {
		return prt_num;
	}

	
	//@param prt_num the prt_num to set
	public void setPrt_num(String prt_num) {
		this.prt_num = prt_num;
	}

	
	//@return the prt_des
	public String getPrt_des() {
		return prt_des;
	}

	
	//@param prt_des the prt_des to set
	public void setPrt_des(String prt_des) {
		this.prt_des = prt_des;
	}

	
	//@return the prt_qua
	public int getPrt_qua() {
		return prt_qua;
	}

	
	//@param prt_qua the prt_qua to set
	public void setPrt_qua(int prt_qua) {
		if(!(prt_qua==0)) {
			this.prt_qua = prt_qua;
		} else {
			this.prt_qua = 0;
		}
	}

	
	//@return the prt_pri
	public double getPrt_pri() {
		return prt_pri;
	}

	
	//@param prt_pri the prt_pri to set
	public void setPrt_pri(double prt_pri) {
		if(!(prt_pri==0)) {
			this.prt_pri = prt_pri;
		} else {
			this.prt_pri = 0;
		}
	}
	
	double invoiceCal(){
		return this.prt_qua*this.prt_pri;
	}
	
}

class InvoiceTest {
	
	//Init
	Invoice i1 = new Invoice("123456789","Tin, Steel",5,55.5);
	
	void invoiceDis() {
		System.out.println("Part Number: "+i1.getPrt_num());
		System.out.println("Part Description: "+i1.getPrt_des());
		System.out.println("Part Quantity: "+i1.getPrt_qua());
		System.out.println("Part Price: "+i1.getPrt_pri());
	}
}

public class ProgramTwo {

	
	public static void main(String[] args) {
		InvoiceTest it = new InvoiceTest();
		
		it.invoiceDis();
		System.out.println("------Total Price: "+it.i1.invoiceCal()+"------");

	}

}
