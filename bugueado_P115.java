import java.util.*;

public class Solution115{
	
	public static void casoDePrueba(){
		
		long k=in.nextLong();

		// Caso de salida
		if (k == 0){
			System.exit(0);
		}

		long cuadrado = k*k;
		
		String scuadrado = Long.toString(cuadrado);
		boolean esKaprekar=false;
		int f=0;
		String izq="", der="";

		if (k==1) esKaprekar=true;

		while (f<=scuadrado.length() && !esKaprekar){
		
			// Recorremos el chars
		
			if (f==0){
				izq=String.valueOf(scuadrado.charAt(f));
			}	
			else{
				izq = scuadrado.substring(0,f);
			}
				
			der = scuadrado.substring(f,scuadrado.length()); 
			if (der.equals("")){
				der="0";
			}
		
			if(Integer.parseInt(der)!=0){	
				int suma = Integer.parseInt(izq)+Integer.parseInt(der)+1;
			
				if (suma == k){
					esKaprekar=true;
				}
			}

			f++;
		
		}
		if(esKaprekar){
			System.out.println("SI.");
		}else{
			System.out.println("NO.");
		}

	}

	public static void main (String args[]){
		in = new java.util.Scanner(System.in);
		while (in.hasNext()){
      System.out.print(" No no nooooo, no has dicho la palabra mágica ");
			casoDePrueba();
      System.out.println();
		}
		System.exit(0);	
	}

}
