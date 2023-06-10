package rays.com.oop;

public class TestAutomobile {
	public static void main(String[] args) {
		Automobile a =new Automobile();
		a.setColour("white");
		a.setMake("2021");
		a.setSpeed(50);
		a.Break(20);
		a.Accelaration(30);
		System.out.println("intial speed --->"+a.getSpeed());
		 
		int s =a.getSpeed();     //( 1 st gear)
		int t =  s+30 ;          //(2 nd gear)
		int u = t+30;            //(3rd gear)
		int v =u +30;           //(4th gear)
		
		if (gear()==1) {
			System.out.println("speed in 1 st gear is --->"+s+"km/h");
		}
		else if (gear()==2) {
             System.out.println("speed in 2 nd gear is --->"+ t+"km/h");			
		}
		else if (gear()==3) {
			System.out.println("speed in 3 rd gear is --->"+u+"km/h"); 
		}	
		else if (gear()==4) {
			System.out.println("speed in 4th gear is --->"+v+"km/h"); 
			}
		else {
			System.out.println("speed in  0 km/h"); 
		}
	}

	private static int gear() {
		
		return 2;
	}

	
	}

