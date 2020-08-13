package session3;

public class array {

	public static void main(String[] args) {
		int[] a1= {10,12,45,85,52,86};
		int a2[]= {21,25,16,2,75,26};
		
		System.out.println("a1 is "+a1);
		System.out.println("a2 is "+a2);
		
		int a3[]=new int[] {10,12,45,85,52,86};
		int[] a4=new int[] {21,25,16,2,75,26};
		System.out.println("a1 is "+a1);
		System.out.println("a2 is "+a2);
		
		a4[1]=121;
		System.out.println(a4[1]);
		a2[2]=122;
		int[] a5 = new int[5]; 

		for(int element : a5) {
			System.out.print(element+"  ");
		}
		System.out.println();

		int a6[], a7[], a8;
		a6 = new int[5];	// a6 is reference to int[]
		a7 = new int[10];	// a7 is reference to int[]
		a8 = 100; // a8 is int

		int[] a9, a10; // // a9 and a10 are reference to int[]
		a9 = new int[10];
		a10 = new int[15];


	}

}
