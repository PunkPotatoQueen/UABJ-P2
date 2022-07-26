import java.util.Scanner;

public class Jogo extends Personagem{
    public static void VerificarProgresso5(int escolha) {
        if (escolha == -1){
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
        }
        else if (escolha != 0){
            System.out.println("Você passou o dia bem, e provavelmete em algum momento foi mais gentil consigo mesmo.");
            System.out.println("Quando se preocupa demais com as coisas, coisas essas que aconteceram ou não a tendência é cansar.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas o importante é seguir em frente.");
            System.out.println("Mais uma vez, seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
        }
        else {
            System.out.println("Aparentemente você não aguenta mais todo seu esforço e volta para casa, se joga na cama e espera o dia acabar.");
            System.out.println("Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!");
            System.out.println("Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.");
            System.out.println("Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
        }
    }
    public static void HistoriaP5(int energia) {
        int decorrer = energia;
        System.out.println("CAPITULO FINAL: Em Casa");
        System.out.println("Você chega em casa e joga os sapatos de um lado. Definitivamente o dia foi um daqueles.");
        System.out.println("Você vê a geladeira... pensa em fazer um jantar. Vê a televisão, pensa em ver uma série.");
        System.out.println("Pensa em ouvir música por um tempo. Pensa em um banho quente.");
        System.out.println("Pensa também na quantidade de coisas que ainda tem que fazer para amanhã. Definitivamente as coisas estão atrasadas.");
        System.out.println("Você vai descansar ou adiantar o trabalho?");
        System.out.println("- DIGITE 1 PARA DESCANSAR");
        System.out.println("- DIGITE 2 PARA ADIANTAR O TRABALHO \n");
        Scanner o = new Scanner(System.in);
        int opcao1D1 = o.nextInt();
        o.close();
        if(opcao1D1 == 2){
            decorrer = MenosEnergia(opcao1D1);
        }
        if((opcao1D1 != 1) & (opcao1D1 != 2)){
            decorrer = -1;
        }
        VerificarProgresso5(decorrer);
    }
    public static void VerificarProgresso4(int escolha) {
        if (escolha == -1){
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
        }
        else if (escolha != 0){
            HistoriaP5 (escolha);
        }
        else {
            System.out.println("Aparentemente você não aguenta mais todo seu esforço e volta para casa, se joga na cama e espera o dia acabar.");
            System.out.println("Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!");
            System.out.println("Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.");
            System.out.println("Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
        }
    }
    public static void HistoriaP4(int energia) {
        int decorrer = energia;
        System.out.println("CAPITULO QUATRO: Fim de Expediente");
        System.out.println("O dia continua e aquele pessoal que você vê todo dia está bem animado. Aparentemente vão sair para uma noite de karaokê.");
        System.out.println("Eles chegam perto de você e te convidam para ir com eles com muita animação... Mas... sei lá...");
        System.out.println("Você está bem cansado do dia que se passou, e apesar da boa energia, a pequena festa iria te cansar um pouco mais.");
        System.out.println("Você pretende ir à festa?");
        System.out.println("- DIGITE 1 IR À FESTA");
        System.out.println("- DIGITE 2 VOLTAR PARA CASA \n");
        Scanner o = new Scanner(System.in);
        int opcao1D1 = o.nextInt();
        o.close();
        if(opcao1D1 == 2){
            decorrer = MenosEnergia(decorrer);
        }
        if((opcao1D1 != 1) & (opcao1D1 != 2)){
            decorrer = -1;
        }
        VerificarProgresso3(decorrer);
    }
    public static void VerificarProgresso3(int escolha) {
        if (escolha == -1){
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
        }
        else if (escolha != 0){
            HistoriaP4 (escolha);
        }
        else {
            System.out.println("Aparentemente você não aguenta mais todo seu esforço e volta para casa, se joga na cama e espera o dia acabar.");
            System.out.println("Provavelmete você acha que nada faz sentido ou está se preocupando com o que poderia ter acontecido ou com o que vai acontecer.");
            System.out.println("Às vezes as coisas saem do nosso controle e tudo bem ficar chateado, mas por favor... não desista!");
            System.out.println("Vários problemas podem ser gerados a partir da falta de cuidado consigo mesmo e preocupação extrema.");
            System.out.println("Seja gentil consigo mesmo: descanse quando precisar, saia com seus amigos, atenda suas necessidades com carinho.");
            System.out.println("Felicidades. Agradecemos por jogar.");
        }
    }
    public static void HistoriaP3(int energia) {
        int decorrer = energia;
        System.out.println("CAPITULO TRÊS: Mais Um Dia");
        System.out.println("Você segue o dia normalmente. Sai para cumprir suas obrigações e ser alguém na vida.");
        System.out.println("Muito embora ninguém saiba quem é esse 'alguém', seve ser uma pessoa importante, afinal, é um parâmetro para todos.");
        System.out.println("Mesmo sem conhecê-lo, esse alguém te incomoda. Ele é a meta e você nem sabe como é que se faz para chegar lá.");
        System.out.println("Supondo que está no caminho certo, você segue seu dia que... não é bem como você esperava.");
        System.out.println("Algumas coisas não saíram como planejado. Deseja continuar ou descansar?");
        System.out.println("- DIGITE 1 PARA DESCANSAR");
        System.out.println("- DIGITE 2 PARA CONTINUAR \n");
        Scanner o = new Scanner(System.in);
        int opcao1D1 = o.nextInt();
        o.close();
        if(opcao1D1 == 2){
            decorrer = MenosEnergia(decorrer);
        }
        if((opcao1D1 != 1) & (opcao1D1 != 2)){
            decorrer = -1;
        }
        VerificarProgresso3(decorrer);
    }
    public static void VerificarProgresso2(int escolha) {
        if (escolha == -1){
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
        }
        else {
            HistoriaP3 (escolha);
        }
    }
    public static void HistoriaP2(int energia) {
        int decorrer = energia;
        System.out.println("CAPITULO DOIS: Café da Manhã");
        System.out.println("Ah, você levantou! Que bom. Hora de iniciar o dia.");
        System.out.println("Você sente seu estômago roncar, é bom preparar um café da manhã... Mas você está meio atrasado.");
        System.out.println("Vai preparar o café da manhã ou vai para o trabalho assim mesmo?");
        System.out.println("- DIGITE 1 PARA PREPARAR O CAFÉ");
        System.out.println("- DIGITE 2 PARA IR ASSIM MESMO \n");
        Scanner o = new Scanner(System.in);
        int opcao1D1 = o.nextInt();
        if(opcao1D1 == 2){
            decorrer = MenosEnergia(decorrer);
        }
        if((opcao1D1 != 1) & (opcao1D1 != 2)){
            decorrer = -1;
        }
        o.close();
        VerificarProgresso2(decorrer);
    }

    public static void VerificarProgresso1(int escolha) {
        if (escolha == -1){
            System.out.println("Acho que você está cansado e não pretende jogar agora. Até uma próxima!");
        }
        else {
            HistoriaP2 (escolha);
        }
    }
    public static int MenosEnergia(int escolha) {
        
        int finais = escolha-1;
        return finais;
    }

    public static void Historia(int energia) {
        int decorrer = energia;
        System.out.println("\n \n \n CAPITULO UM: Bom Dia");
        System.out.println("Você acorda com o sol passando pelas frestas da janela. É tão cedo...");
        System.out.println("Você sente que deve começar o dia... mas bate uma preguicinha... Dormir mais um pouco?");
        System.out.println("- DIGITE 1 PARA SIM");
        System.out.println("- DIGITE 2 PARA NÃO \n");
        Scanner o = new Scanner(System.in);
        int opcao1D1 = o.nextInt();
        o.close();
        if(opcao1D1 == 1){
            decorrer = MenosEnergia(decorrer);
        }
        if((opcao1D1 != 1) & (opcao1D1 != 2)){
            decorrer = -1;
        }
        VerificarProgresso1(decorrer);
    }

    public static void main (String[] args) throws Exception {
        Personagem nivel1 = new Personagem();
        nivel1.nivel = 1;
        nivel1.energia = 5;
        Personagem nivel2 = new Personagem();
        nivel2.nivel = 2;
        nivel2.energia = 3;

        //Menu de escolha do jogo

        System.out.println("MENU DE ESCOLHA. SELECIONE A DIFICULDADE DO JOGO:");
        System.out.println("  - DIGITE 1 PARA FÁCIL");
        System.out.println("  - DIGITE 2 PARA DIFÍCIL");
        Scanner d = new Scanner(System.in);
        int dificuldade = d.nextInt();

        if (dificuldade == nivel1.nivel){
            int energia = nivel1.energia;
            Historia(energia);
        } 
        else if (dificuldade == nivel2.nivel){
            int energia = nivel2.energia;
            Historia(energia);
        }
        else {
            System.out.println("Valor não aceito. Reinicie o jogo e escolha uma dificuldade");
        }
        d.close();

    }
    
}
