import java.util.*;

public class p362 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int ncasos = sc.nextInt();
		int dia;
		int mes;

		for(int i=0; i<ncasos; i++){
			dia=sc.nextInt();
			mes=sc.nextInt();
			if(dia==25 && mes==12) {
				System.out.println("SI");
			} else {
				System.out.println("NO");
			}			
			
		}

	}
}
