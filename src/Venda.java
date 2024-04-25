import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Venda {
    private int icP = 1;
    private int iP;
    private int qtd = 1;
    Venda(int iC, int iP){

    }
    String[][][] pedido = new String[icP][qtd][3];
    Produto produto = new Produto(iP);
    Cliente cliente = new Cliente(icP);

    public void novoPedido(int tcP, int tQtd){
        pedido = new String[tcP][tQtd][3];
        icP = tcP;
        qtd = tQtd;
    }

    public void pedido (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do cliente");
        String name = scanner.nextLine();
        if (1 <= icP || 1 <= qtd) {
            String[][][] novoPedido = new String[icP][qtd][3];
            for (int j = 0; j < pedido.length; j++) {
                for (int i = 0; i < pedido[i].length; i++) {
                    novoPedido[j][i][1] = this.pedido[j][i][1];
                    novoPedido[j][i][2] = this.pedido[j][i][2];
                }
            }
            this.novoPedido(icP, qtd);
            for (int j = 0; j < pedido.length; j++) {
                for (int i = 0; i < pedido[i].length; i++) {
                    this.pedido[j][i][1] = novoPedido[j][i][1];
                    this.pedido[j][i][2] =  novoPedido[j][i][2];
                }
            }
        }
        pedido[icP][0][0]=name;
        produto.listProduto();
            do{
                System.out.println("Qual o ID do Produto a ser adicionado?\n" +
                        "Digite (fechar) para fechar o pedido");
                String id = scanner.nextLine();
                try{
                    int iPedido = Integer.parseInt(id) - 1;
                    pedido[icP][qtd][1] = produto.getcProduto()[iPedido][1];
                    pedido[icP][qtd][2] = produto.getcProduto()[iPedido][2];
                    qtd++;
                }catch (NumberFormatException e){
                    double pTot = 0;
                    for (int i = 0; i < qtd; i++){
                        System.out.println(i+ "- " + pedido[icP][i][1] +
                                " R$" + pedido[icP][qtd][2]);
                        double preco = Double.parseDouble(pedido[icP][qtd][2]);
                        pTot = pTot + preco;
                        System.out.println("Valor total: " + pTot);
                    }
                    break;
                }

            }while(true);

        icP = icP + 1;
    }

}
