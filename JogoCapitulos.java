import java.util.Scanner;
public class JogoCapitulos {
    public static boolean fimHistoria (int contador, Finais final1, Finais final2, Finais finalerro){
        boolean b = true;
        if (contador == 0){
            final1.mostrarFinal();
            b = false;
        }
        if ((contador == 100)){
            final2.mostrarFinal();
            b = false;
        }
        return b;
    }
    public static boolean fimHistoriaFinal (int contador, Finais final1, Finais final2, Finais finalerro){
        boolean b = true;
        if (contador == 0){
            final1.mostrarFinal();
            b = false;
        }
        else if ((contador == 100)){
            finalerro.mostrarFinal();
            b = false;
        }
        else{
            final2.mostrarFinal();
            b = false;

        }
        return b;
    }

    public static int MenosEnergia(int escolha) {

        int finais = escolha-1;
        return finais;

    }
    public static int EscolherNivel(){
        System.out.println("MENU DE ESCOLHA. SELECIONE A DIFICULDADE DO JOGO:");
        System.out.println("  - DIGITE 1 PARA FÁCIL");
        System.out.println("  - DIGITE 2 PARA DIFÍCIL");
        Scanner escolhernivel = new Scanner(System.in);
        int dificuldade = escolhernivel.nextInt();
        int contador = 0;
        if (dificuldade == 1){
            contador = 4;
        }
        else if (dificuldade == 2){
            contador = 2;
        }
        else {
            contador = 100;
        }
        return contador;
    }
    public static void main (String[] args) throws Exception {
//final 1
        Finais final1 = new Finais();
            final1.nome = "\n FINAL: Esgotado";
            final1.texto = "Aparentemente você só... não aguenta mais. Em casa, você se joga na cama e espera o dia acabar.\n Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.\n Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!\n Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.\n Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho. \n Felicidades. Agradecemos por jogar.";
//final 2
        Finais final2 = new Finais();
            final2.nome = "\n FINAL: Um Bom Dia";
            final2.texto = "Você conseguiu chegar ao fim do dia bem! Meus parabéns.\n Quando se preocupa demais com as coisas, coisas essas que aconteceram ou não a tendência é cansar.\n Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas o importante é seguir em frente.\n Mais uma vez, seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.\n Felicidades. Agradecemos por jogar.";
//final de erro
        Finais finalerro = new Finais();
            finalerro.nome = "\n OPÇÃO NÃO IDENTIFICADA";
            finalerro.texto = "Acho que você está cansado e não pretende jogar agora. Até uma próxima!";
//capitulo 1
        Capitulo Cap1 = new Capitulo();
            Cap1.nome = "\n CAPITULO UM: Bom Dia";
            Cap1.texto = "Você acorda com o sol passando pelas frestas da janela. É tão cedo... \n Você sente que deve começar o dia... mas bate uma preguicinha... Dormir mais um pouco?";
            Cap1.escolhas [0] = "- DIGITE 1 PARA SIM";
            Cap1.escolhas [1] = "- DIGITE 2 PARA NÃO";
        //    Cap1.decorrer = 5;
        //    Cap1.persona = nivel1;
//capitulo 2
        Capitulo Cap2 = new Capitulo();
            Cap2.nome = "\n CAPITULO DOIS: Café da Manhã";
            Cap2.texto = "Ah, você levantou! Que bom. Hora de iniciar o dia. \n Você sente seu estômago roncar, é bom preparar um café da manhã... Mas você está meio atrasado. \n Vai preparar o café da manhã ou vai para o trabalho assim mesmo?";
            Cap2.escolhas [0] = "- DIGITE 1 PARA IR ASSIM MESMO";
            Cap2.escolhas [1] = "- DIGITE 2 PARA PREPARAR O CAFÉ";
      //      Cap2.decorrer = 5;
      //      Cap2.persona = nivel1;
//capitulo 3           
        Capitulo Cap3 = new Capitulo();
            Cap3.nome = "\n CAPITULO TRÊS: Mais Um Dia";
            Cap3.texto = "Você segue o dia normalmente. Sai para cumprir suas obrigações e ser alguém na vida.\n Muito embora ninguém saiba quem é esse 'alguém', seve ser uma pessoa importante, afinal, é um parâmetro para todos. \n Mesmo sem conhecê-lo, esse alguém te incomoda. Ele é a meta e você nem sabe como é que se faz para chegar lá. \n Supondo que está no caminho certo, você segue seu dia que... não é bem como você esperava. \n Algumas coisas não saíram como planejado. Deseja continuar ou descansar?";
            Cap3.escolhas [0] = "- DIGITE 1 PARA DESCANSAR";
            Cap3.escolhas [1] = "- DIGITE 2 PARA CONTINUAR";
       //     Cap3.decorrer = 5;
       //     Cap3.persona = nivel1;
//capitulo 4            
        Capitulo Cap4 = new Capitulo();
            Cap4.nome = "\n CAPITULO QUATRO: Fim de Expediente";
            Cap4.texto = "O dia continua e aquele pessoal que você vê todo dia está bem animado. Aparentemente vão sair para uma noite de karaokê.\n Eles chegam perto de você e te convidam para ir com eles com muita animação... Mas... sei lá... \n Você está bem cansado do dia que se passou, e apesar da boa energia, a pequena festa iria te cansar um pouco mais.\n Você pretende ir à festa?";
            Cap4.escolhas [0] = "- DIGITE 1 PARA SIM";
            Cap4.escolhas [1] = "- DIGITE 2 PARA SIM";
       //     Cap4.decorrer = 5;
       //     Cap4.persona = nivel1;
//capitulo 5
        Capitulo Cap5 = new Capitulo();
            Cap5.nome = "\n CAPITULO FINAL: Em Casa";
            Cap5.texto = "Você chega em casa e joga os sapatos de um lado. Definitivamente o dia foi um daqueles.\n Você vê a geladeira... pensa em fazer um jantar. Vê a televisão, pensa em ver uma série.\n Pensa em ouvir música por um tempo. Pensa em um banho quente.\n Pensa também na quantidade de coisas que ainda tem que fazer para amanhã. Definitivamente as coisas estão atrasadas.\n Você vai descansar ou adiantar o trabalho?";
            Cap5.escolhas [0] = "- DIGITE 1 PARA ADIANTAR O TRABALHO";
            Cap5.escolhas [1] = "- DIGITE 2 PARA DESCANSAR";
        //    Cap5.decorrer = 5;
        //    Cap5.persona = nivel1; 
        Boolean i = true;
        int contador = EscolherNivel();
        while (i){
            int opcao = 0;
            Cap1.Mostrar();
            Scanner e = new Scanner(System.in);
            opcao = e.nextInt();
            if(opcao == 1){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador, final1, final2, finalerro);
            if (i == false){
                break;
            }
            Cap2.Mostrar();
            Scanner a = new Scanner(System.in);
            opcao = a.nextInt();
            if(opcao == 1){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador, final1, final2, finalerro);
            if (i == false){
                break;
            }
            Cap3.Mostrar();
            Scanner b = new Scanner(System.in);
            opcao = b.nextInt();
            if(opcao == 2){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador, final1, final2, finalerro);
            if (i == false){
                break;
            }
            Cap4.Mostrar();
            Scanner c = new Scanner(System.in);
            opcao = c.nextInt();
            if(opcao == 2){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoria(contador, final1, final2, finalerro);
            if (i == false){
                break;
            }
            Cap5.Mostrar();
            Scanner z = new Scanner(System.in);
            opcao = z.nextInt();
            if(opcao == 1){
                contador = MenosEnergia(contador);
            }
            if((opcao != 1) & (opcao != 2)){
                contador = 100;
            }
            i = fimHistoriaFinal(contador, final1, final2, finalerro);
            if (i == false){
                break;
            }

            e.close();
            a.close();
            b.close();
            c.close();
            z.close();
        }

    }
}
