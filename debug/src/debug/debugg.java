package debug;	
import java.util.Scanner;
	 
	public class debugg {
	    public static void main(String[] args) {
	        Scanner leer=new Scanner(System.in);

	        System.out.println("Escriba una frase");
	        String frase=leer.nextLine();    
	        char caracteres[]=frase.toCharArray();
	        for(int i=0;i<frase.length();i++){
	            System.out.println(caracteres[i]);
	        } 
	    }
	}