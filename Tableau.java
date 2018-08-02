import java.util.Scanner;

public class Tableau{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int tab [] = new int [4];
        for (int i=0; i < tab.length ;i++){
        	System.out.println("entrer un chiffre ");
        	tab[i] = sc.nextInt() ;
        	
        }
        for (int j =0;j < tab.length;j++){
        	System.out.println("la case numero"+(j+1)+"contien"+tab[j]);
        }
        int tnombre [] = {2,10,8,7,1,4,6,9,1};
		int i=0;
		boolean condition = false;
		while(condition == false && i < tnombre.length){
			if(tnombre[i] < 10){
				System.out.println("la valeur de la case " + (i+1) + " est: "
			+ tnombre[i]);
				i++;
			}else{
				condition = true;
			}
		}
		System.out.println("FIN DU PRGM");
		
	}

}
