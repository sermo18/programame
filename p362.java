import java.util.Scanner;

public class Fechasnavidad {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
	 int n,i,dia,mes;
	 i=0;
	 n= sc.nextInt(); 
	 
	while(i <n) {
		
		dia= sc.nextInt();
		mes = sc.nextInt();
		
		if(dia==25 && mes==12) {
			System.out.println("SI");
		} else {
			System.out.println("NO");
		}
		i++;
		
		}
	}
}
