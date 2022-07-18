
import java.util.Scanner;
public class Chatbotjava {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Bem vindo(a) ao Portal JAVA. Aqui você vai aprender programar nessa linguegem. Vamos começar seu cadastro.");
        System.out.println("Digite seu nome completo:");
        Scanner nome = new Scanner(System.in);
        String nomec = nome.nextLine();
        System.out.println(nomec + " é um bom nome. Agora vamos definir um apelido para você. Digite como quer ser chamado(a) na plataforma:");
        Scanner apl = new Scanner(System.in);
        String apelido =apl.nextLine();
        System.out.println("Olá, " + apelido + "! Seja bem vindo(a)! Vamos perdir apenas mais algumas informações e o cadastro será feito!");
        System.out.println("Informe a sua idade:");
        Scanner id = new Scanner(System.in);
        int idade = id.nextInt();
        if(idade < 18){
            System.out.println("Vejo que é menor de idade. Tem um longo caminho na tecnologia pela frente!");
        } else {
            System.out.println("Vejo que é maior de idade. Seja muito bem vindo ao portal!");
        }
        System.out.println("Digite seu melhor e-mail:");
        Scanner e = new Scanner(System.in);
        String email = e.nextLine();
        System.out.println("A seu login é '"+ email + "' Não a esqueça!");
        System.out.println("Insira agora a sua senha:");
        Scanner s1 = new Scanner(System.in);
        String senha = s1.nextLine();
        System.out.println("A sua senha é '"+ senha + "' Não a esqueça!");
        System.out.println("Cadastro completo! Aproveite a plataforma!");
        e.close();
        nome.close();
        apl.close();
        id.close();
        s1.close();
    }
}

