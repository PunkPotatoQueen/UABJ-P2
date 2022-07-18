import java.util.Scanner;
public class Potencia {
    public static int Potencial(int base, int potencia) {
        int r = base;
        if (potencia == 0){   
            r = 1;
        } 
        else{
            int cont = potencia -1;
            int result = 0;
            for (int i = 0; i< cont; i++){
                result = 0;
                for (int j = 0; j< base; j++){
                    result = result + r;
                }
                r = result;
            }
        }
        return r;
    } {
        
    }
    public static void main(String[] args) {
         System.out.println("Digite o número que será a base da potência:");    
         Scanner base = new Scanner(System.in);
         int b = base.nextInt(); 
         
         System.out.println("Digite o número que será a potência:");    
         Scanner potencia = new Scanner(System.in);
         int p = potencia.nextInt(); 
         int resultado = Potencial(b,p);
         System.out.println("O resultado da potência é: " + resultado);
         
         base.close();
         potencia.close();

    }
}
