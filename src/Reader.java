import java.util.Scanner;

public class Reader {
    Scanner scanner = new Scanner(System.in);

    public int menu (){
        System.out.println("Bem Vindo(a) a Ferrí" +"\n" + "Digite:" +
                "\n 1- Cadastrar Cliente" +
                "\n 2- Cadastrar Produto" +
                "\n 3- Listar Produto" +
                "\n 4- Frente de Caixa" +
                "\n 5- Sair");
        return scanner.nextInt();

    }

    public String name (){
        System.out.println("Qual o nome do cliente");
        String nick = scanner.nextLine();
        return scanner.nextLine();
    }
    public String email(){
        System.out.println("Qual o e-mail do cliente");
        String email = scanner.nextLine();
        return email;
    }
    public String cep(){
        System.out.println("Qual o CEP do cliente");
        String cep = scanner.nextLine();
        return cep;
    }
    public String endereco(){
        System.out.println("Qual o endereco do cliente");
        String endereco = scanner.nextLine();
        return endereco;
    }
    public String telefone(){
        System.out.println("Qual o telefone do cliente");
        String telefone = scanner.nextLine();
        return telefone;
    }
    public String cpf(){
        System.out.println("Qual o CPF do cliente");
        String cpf = scanner.nextLine();
        return cpf;
    }
    public String productName(){
        System.out.println("Qual o nome do Produto");
        String productName = scanner.next();
        return productName;
    }
    public String productPrice(){
            System.out.println("Qual o preço");
            String productPrice = scanner.next();
            return productPrice;

    }



}
