import java.util.Scanner;

public class Clientes
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //iniciar o scanner

        System.out.println("Bom dia, Bem vindo a Pc Mania");

        System.out.println("Qual o seu nome: ");
        String nome = input.nextLine();

        System.out.println("Para Efetuarmos a sua compra precisamos do seu cpf: (apenas os numeros)");
        long cpf = input.nextLong();

        System.out.println("qual oferta voce deseja?: ");
        int oferta = input.nextInt();

        if(oferta == 0){ // caso 0, que encerra a compra
            System.out.println("Espero ver voce de novo aqui em breve!");
        }
        else{
            Compudores pc = new Compudores(oferta);
            System.out.println("Otima escolha, O computador da ");
            pc.mostrarPCConfig();
            System.out.println();
            System.out.println( "Está Promocao esta custando:" +Calculartotalcompra(oferta,pc) +" Reais, qual a forma de pagamento ??");
        }

        input.close();
    }
    static float Calculartotalcompra(int promo, Compudores pc) {
        return pc.preco;

    }
}
