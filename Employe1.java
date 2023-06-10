package Practicing;

public class Employe1 implements Comparable<Employe1> {
	private  int id ;
	private String name;
	private String adress;
	
	public Employe1() {
	
	}
	
	
	public Employe1(int id , String name, String adress) {
		this.id = id;
		this.adress= adress;
		this.name= name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	@Override
	public String toString() {

		return id+" "+name+" "+adress;
		
	}


	@Override
	public int compareTo(Employe1 o) {
		if (this.id==o.id) {
			return  this.name.compareTo(o.name)	;
		}
		
		return this.id-o.id;
	}

}
