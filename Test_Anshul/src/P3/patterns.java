package P3;

public class patterns {
	
	public static void main(String[] args) {
		patterns pt = new patterns();
		
		System.out.println("double loop1");
		pt.patt1(5);
		System.out.println("double loop2");
		pt.revpatt1(5);
		System.out.println("double loop3");
		pt.countpatt1(5);
		System.out.println("double loop4");
		pt.revcountpatt1(5); 
		System.out.println("three loop1");
		pt.spacepatt1(5); 
		System.out.println("three loop2");
		pt.patt3(5); 
		
	}
	
	public void patt1(int rownum) {
		for(int i=1;i<=rownum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void revpatt1(int rownum) {
		for(int i=1;i<=rownum;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	public void countpatt1(int rownum) {
		for(int i=1;i<=rownum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
	public void revcountpatt1(int rownum) {
		int temp = 1;
		for(int i=1;i<rownum;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(temp + " ");
				temp++;
			}
			System.out.println("");
		}
	}
	
	public void spacepatt1(int rownum) {
		for(int i=1;i<=rownum;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	
	public void patt3(int rownum) {
		for(int i=1;i<=rownum;i++) {
			for(int k=5;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
	}
}
	
