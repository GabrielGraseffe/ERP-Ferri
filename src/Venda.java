import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Venda {
    private int iC;
    private int iP;
    private int qtd = 0;
    Venda(int iC, int iP){
        this.iC = iC;
        this.iP = iP;
    }
    String[][][] pedido = new String[iC][qtd][2];
    Produto produto = new Produto(iP);
    Cliente cliente = new Cliente(iC);

    public void pedido (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente");
        String name = scanner.nextLine();
        if(cliente.listCliente(name).equals("Sem Cadastro")){
            iC = iC + 1;
            for(int i = 0; i < 6; i++) {
                String[][] cadastro = cliente.getcCliente();
            }
        }else{
           /* pedido[iC][0][0]=name;
            produto.listProduct(iP);
            do{
                System.out.println("Qual o ID do Produto a ser adicionado?\n" +
                        "Digite (fechar) para fechar o pedido");
                String id = scanner.nextLine();
                try{
                    int iPedido = Integer.parseInt(id);
                    pedido[iC][qtd][0] = produto.cProduto[iPedido][0];
                    pedido[iC][qtd][1] = produto.cProduto[iPedido][1];
                    qtd++;
                }catch (NumberFormatException e){
                    double pTot = 0;
                    for (int i = 0; i < qtd; i++){
                        System.out.println(i+ "- " + pedido[iC][i][0] +
                                " R$" + pedido[iC][qtd][1]);
                        double preco = Double.parseDouble(pedido[iC][qtd][1]);
                        pTot = pTot + preco;
                        System.out.println("Valor total: " + pTot);
                    }
                    break;
                }

            }while(true);*/
        }


    }

}
