 package Practicing;



public class Employee1 {
	private int id ;
    private String name;
    private String adress;
    
    
    public Employee1(int id, String name,String adress) {
    	this.id = id;
    	this.name = name;
    	this.adress= adress;
    	
    	
    	
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
		return id+" "+ name +" "+adress;
	}
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee1)) {
			return false;
			
		}
		Employee1 e = (Employee1) obj;
		boolean b = this.id==e.id && this.name==e.name && this.adress==e.adress;
		return b;

		}
		@Override
		public int hashCode() {
		String str = id +name +adress;
			return str.hashCode();
		}	

}
