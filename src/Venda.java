import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Venda {
    private int icP = 1;
    private int iP;
    private int qtd = 1;
    Venda(int iC, int iP){

    }
    String[][][] pedido = new String[icP][qtd][2];
    Produto produto = new Produto(iP);
    Cliente cliente = new Cliente(icP);

    public void pedido (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente");
        String name = scanner.nextLine();
        /*if(cliente.listCliente(name).equals("Sem Cadastro")){
            iC = iC + 1;
            for(int i = 0; i < 6; i++) {
                String[][] cadastro = cliente.getcCliente();
            }
        }*/
           pedido[icP][0][0]=name;
            produto.listProduto();
            do{
                System.out.println("Qual o ID do Produto a ser adicionado?\n" +
                        "Digite (fechar) para fechar o pedido");
                String id = scanner.nextLine();
                try{
                    int iPedido = Integer.parseInt(id);
                    pedido[icP][qtd][0] = produto.getcProduto()[iPedido][0];
                    pedido[icP][qtd][1] = produto.getcProduto()[iPedido][1];
                    qtd++;
                }catch (NumberFormatException e){
                    double pTot = 0;
                    for (int i = 0; i < qtd; i++){
                        System.out.println(i+ "- " + pedido[icP][i][0] +
                                " R$" + pedido[icP][qtd][1]);
                        double preco = Double.parseDouble(pedido[icP][qtd][1]);
                        pTot = pTot + preco;
                        System.out.println("Valor total: " + pTot);
                    }
                    break;
                }

            }while(true);

        icP = icP + 1;
    }

}
