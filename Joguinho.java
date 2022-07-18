import java.util.Scanner;

public class Joguinho {
    public static int Escolha2(int escolha2) {

        System.out.println("\n Você decide ficar e lutar, mas um mero navio de mercadores não é páreo para tantos piratas bem armados.");
        System.out.println("Uma vez que você é capturado, os piratas decidem o que fazer com você e seus companheiros enquanto os prendem no porão. \n");
        System.out.println("Preso no porão, você tem tempo para pensar no que fazer, e encontra duas opções:");
        System.out.println("   - Digite 1 se quer resistir junto a seus companheiros até o fim.");
        System.out.println("   - Digite 2 se quer tentar se soltar e fugir durante a noite utilizando o bote do navio.");
        Scanner prox = new Scanner(System.in);
        int finais = prox.nextInt();
        prox.close();
        return finais;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("'Olá marujo! Bem vindo ao porto! Vamos, pegue suas coisas e suba no navio!' \n");
        System.out.println("'É muito bom velejar pelo mar afora, certamente descobriremos grandes terras, e... '");
        System.out.println("'Espere! O que é aquilo ao fundo? Oh, não! Navios piratas! Vamos, não podemos deixar que nos capturem!' \n");
        System.out.println("Você se encontra em frente a vários piratas. O que vai fazer?");
        System.out.println("   - Digite 1 se quiser se jogar do navio com seu companheiro");
        System.out.println("   - Digite 2 se quiser se juntar aos marujos e lutar");
        Scanner prox = new Scanner(System.in);
        int p = prox.nextInt();
        int finais = 0;
        if(p == 1){
            System.out.println("Você se joga do navio com seu companheiro e ficam à deriva por dois dias até serem encontrados pela marinha");
            System.out.println("Uma vez recuperados, vocês se juntam a ela e se tornam grandes caçadores de piratas. \n");
            System.out.println("Parabéns! Você encontrou um dos finais da história!");
        } else if (p == 2) {
            finais = Escolha2(p);
        } else{
            System.out.println("O despertador toca e você percebe que tudo aquilo não passava de um sonho. Hora de levantar!\n");
            System.out.println("Parabéns! Você encontrou o final easter egg da história!");
            System.out.println("\n Agradecemos por jogar!");
        }
        if(finais == 0){
            System.out.println("\n Agradecemos por jogar!");
        } 
        else if (finais == 1){
            System.out.println("\n Vocês resistem e conseguem manter alguns piratas como reféns.");
            System.out.println("Conversando com eles por um tempo, você consegue convencê-los a iniciar um motim contra o atual capitão.");
            System.out.println("Com o barco dominado, você decide se juntar aos piratas, assumindo o postor de capitão e navegando atrás de aventuras. \n");
            System.out.println("Parabéns! Você encontrou um dos finais da história!");
            System.out.println("\n Agradecemos por jogar!");
        } else if (finais ==2) {
            System.out.println("\n Vocês fazem um plano para causar explosões em cantos específicos do porão. É perigoso, mas vocês conseguem.");
            System.out.println("Uma vez que os piratas estão preocupados com os buracos feitos no navio, você consegue roubar um facão e se solta ds amarras.");
            System.out.println("Você liberta a si mesmo e os outros marujos e lutam pelo bote do navio, conseguindo derrotar os piratas.");
            System.out.println("Vocês conseguem remar até a costa, e desembarcam numa pequena cidade pesqueira onde pedem socorro e conseguem voltar para casa. \n");
            System.out.println("Parabéns! Você encontrou um dos finais da história!");
            System.out.println("\n Agradecemos por jogar!");
        } else{
            System.out.println("O despertador toca e você percebe que tudo aquilo não passava de um sonho. Hora de levantar!\n");
            System.out.println("Parabéns! Você encontrou o final easter egg da história!");
            System.out.println("\n Agradecemos por jogar!");
        }
        prox.close();
    }
    
}
