import java.util.Scanner;
public class JogoPersonagens {
    public static int MenosEnergia(int escolha) {

        int finais = escolha-1;
        return finais;

    }
    public static boolean fimHistoria (int contador){
        boolean b = true;
        if (contador == 0){
            System.out.println("\n FINAL: Esgotado");
            System.out.println("Aparentemente você só... não aguenta mais. Em casa, você se joga na cama e espera o dia acabar.");
            System.out.println("Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!");
            System.out.println("Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.");
            System.out.println("Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
            b = false;
        }
        if ((contador == 100)){
            System.out.println("\n OPÇÃO NÃO IDENTIFICADA");
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
            b = false;
        }
        return b;

    }
    public static boolean fimHistoriaFinal (int contador){
        boolean b = true;
        if (contador == 0){
            System.out.println("\n FINAL: Esgotado");
            System.out.println("Aparentemente você só... não aguenta mais. Em casa, você se joga na cama e espera o dia acabar.");
            System.out.println("Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!");
            System.out.println("Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.");
            System.out.println("Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
            b = false;
        }
        else if ((contador == 100)){
            System.out.println("\n OPÇÃO NÃO IDENTIFICADA");
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
            b = false;
        }
        else{
            b = false;
            System.out.println("\n FINAL: Um Bom Dia");
            System.out.println("Você conseguiu chegar ao fim do dia bem! Meus parabéns.");
            System.out.println("Quando se preocupa demais com as coisas, coisas essas que aconteceram ou não a tendência é cansar.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas o importante é seguir em frente.");
            System.out.println("Mais uma vez, seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
        }
        return b;

    }
    public static void main (String[] args) throws Exception {
        Personagem nivel1 = new Personagem();
        nivel1.nivel = 1;
        nivel1.energia = 4;
        Personagem nivel2 = new Personagem();
        nivel2.nivel = 2;
        nivel2.energia = 2;

// menu do jogo

        System.out.println("MENU DE ESCOLHA. SELECIONE A DIFICULDADE DO JOGO:");
        System.out.println("  - DIGITE 1 PARA FÁCIL");
        System.out.println("  - DIGITE 2 PARA DIFÍCIL");
        Scanner d = new Scanner(System.in);
        int dificuldade = d.nextInt();
        int contador = 0;
        if (dificuldade == 1){
            contador = nivel1.energia;
        }
        else if (dificuldade == 2){
            contador = nivel2.energia;
        }
        else {
            contador = 100;
        }
        boolean i = true;
        fimHistoria(contador);

        while (i == true) {
 // parte 1
            System.out.println("\n \n \n CAPITULO UM: Bom Dia");
            System.out.println("Você acorda com o sol passando pelas frestas da janela. É tão cedo...");
            System.out.println("Você sente que deve começar o dia... mas bate uma preguicinha... Dormir mais um pouco?");
            System.out.println("- DIGITE 1 PARA SIM");
            System.out.println("- DIGITE 2 PARA NÃO \n");
            Scanner o = new Scanner(System.in);
            int opcao = o.nextInt();
            if(opcao == 1){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador);
            if (i == false){
                break;
            }
// fim parte 1
// inicio parte 2
            System.out.println("\n CAPITULO DOIS: Café da Manhã");
            System.out.println("Ah, você levantou! Que bom. Hora de iniciar o dia.");
            System.out.println("Você sente seu estômago roncar, é bom preparar um café da manhã... Mas você está meio atrasado.");
            System.out.println("Vai preparar o café da manhã ou vai para o trabalho assim mesmo?");
            System.out.println("- DIGITE 1 PARA PREPARAR O CAFÉ");
            System.out.println("- DIGITE 2 PARA IR ASSIM MESMO \n");
            Scanner a = new Scanner(System.in);
            opcao = a.nextInt();
            if(opcao == 2){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador);
            if (i == false){
                break;
            }
// fim parte 2
// inicio parte 3
            System.out.println("\n CAPITULO TRÊS: Mais Um Dia");
            System.out.println("Você segue o dia normalmente. Sai para cumprir suas obrigações e ser alguém na vida.");
            System.out.println("Muito embora ninguém saiba quem é esse 'alguém', seve ser uma pessoa importante, afinal, é um parâmetro para todos.");
            System.out.println("Mesmo sem conhecê-lo, esse alguém te incomoda. Ele é a meta e você nem sabe como é que se faz para chegar lá.");
            System.out.println("Supondo que está no caminho certo, você segue seu dia que... não é bem como você esperava.");
            System.out.println("Algumas coisas não saíram como planejado. Deseja continuar ou descansar?");
            System.out.println("- DIGITE 1 PARA DESCANSAR");
            System.out.println("- DIGITE 2 PARA CONTINUAR \n");
            Scanner b = new Scanner(System.in);
            opcao = b.nextInt();
            if(opcao == 2){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador);
            if (i == false){
                break;
            }
// fim parte 3
// inicio parte 4
            System.out.println("\n CAPITULO QUATRO: Fim de Expediente");
            System.out.println("O dia continua e aquele pessoal que você vê todo dia está bem animado. Aparentemente vão sair para uma noite de karaokê.");
            System.out.println("Eles chegam perto de você e te convidam para ir com eles com muita animação... Mas... sei lá...");
            System.out.println("Você está bem cansado do dia que se passou, e apesar da boa energia, a pequena festa iria te cansar um pouco mais.");
            System.out.println("Você pretende ir à festa?");
            System.out.println("- DIGITE 1 IR À FESTA");
            System.out.println("- DIGITE 2 VOLTAR PARA CASA \n");
            Scanner c = new Scanner(System.in);
            opcao = c.nextInt();
            if(opcao == 2){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador);
            if (i == false){
                break;
            }
// fim parte 4
// inicio parte 5
            System.out.println("\n CAPITULO FINAL: Em Casa");
            System.out.println("Você chega em casa e joga os sapatos de um lado. Definitivamente o dia foi um daqueles.");
            System.out.println("Você vê a geladeira... pensa em fazer um jantar. Vê a televisão, pensa em ver uma série.");
            System.out.println("Pensa em ouvir música por um tempo. Pensa em um banho quente.");
            System.out.println("Pensa também na quantidade de coisas que ainda tem que fazer para amanhã. Definitivamente as coisas estão atrasadas.");
            System.out.println("Você vai descansar ou adiantar o trabalho?");
            System.out.println("- DIGITE 1 PARA DESCANSAR");
            System.out.println("- DIGITE 2 PARA ADIANTAR O TRABALHO \n");
            Scanner e = new Scanner(System.in);
            opcao = e.nextInt();
            if(opcao == 1){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoriaFinal(contador);
            if (i == false){
                break;
            }

            o.close();
            a.close();
            b.close();
            c.close();
            e.close();
        }
        d.close();

    }
}
