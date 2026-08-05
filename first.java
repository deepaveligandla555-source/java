package patterns;

public class Pattern {

	public static void main(String[] args) {
		pattern1();
	    pattern2();
		pattern3();
		pattern4();
	    pattern5();
		pattern6();
		//pattern7();
	    //pattern8();
		//pattern9();
		pattern10();
		pattern11();
	    pattern12();
		pattern13();
	    pattern14();
		pattern15();
	}
	public static void pattern1() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			System.out.print(" * ");
		}
		System.out.println(" ");
	}
}

 
	public static void pattern2() {
	for(int i=0;i<8;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" * ");
		}
		System.out.println(" ");
	}
	System.out.println();
}


	public static void pattern3(){
	for(int i=0;i<5;i++) {
		for(int j=i;j<5;j++) {
			System.out.print(" * ");
		}
		System.out.println(" ");
	}
	System.out.println();
	}



	public static void pattern4() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<5-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
		System.out.print("*");
	}
		System.out.println();	
	}
	System.out.println();

}

	public static void pattern5() {
	for(int i=0;i<=5;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=5-i;k++) {
		System.out.print("*");
	}
		System.out.println();	
	}

}


	public static void pattern6(){
	for(int i=0;i<5;i++) {
		for(int j=0;j<4-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<(2*i+1);k++) {
		System.out.print("*");
	}
		System.out.println();	
	}

}

	
	



	public static void pattern10(){
	for(int i=0;i<5;i++) {
		for(int j=0;j<4-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<2*i+1;k++) {
		System.out.print("*");
	}
		System.out.println();	
	}

}

	public static void pattern11() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<5-i;k++) {
		System.out.print("*"+" ");
	}
		System.out.println();	
	}
}

	public static void pattern12() {
	for(int i=0;i<5;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<10-(2*i)-1;k++) {
		System.out.print("*");
	}
		System.out.println();	
	}

}

	public static void pattern13() {
		//int n=10;
		for(int i=0;i<10;i++) {
			for(int j=0;j<9-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
			System.out.print("*"+" ");
		}
			System.out.println();	
	}
	for(int i=0;i<9;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<8-i;k++) {
		System.out.print("*"+" ");
	}
		System.out.println();	
	}

}

	public static void pattern14() {
	for(int i=0;i<12;i++) {
		for(int j=0;j<12-i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<i;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	for(int i=0;i<8;i++) {
		for(int j=0;j<8;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<4;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	for(int i=0;i<12;i++) {
		for(int j=0;j<i;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<12-i;k++) {
			System.out.print("*"+" ");
		}
		System.out.println();
	}
	}


	public static void pattern15(){
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			System.out.print("*"+" ");
		}
	System.out.println(" ");
}
}
}









































