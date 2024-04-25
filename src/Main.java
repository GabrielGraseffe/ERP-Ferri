import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int iP = 0;
        int p = 1;
        int c = 1;
        int iC = 0;
        Reader reader = new Reader();
        Cliente cliente = new Cliente(c);
        Produto produto = new Produto(p);
        Venda venda = new Venda(c, p);
        Boolean m = true;
        while(m = true)
        {
            int menu = reader.menu();
            switch(menu){
                case (1):
                    cliente.setcCliente(iC,reader.name(), reader.cpf(), reader.email(),
                            reader.cep(),reader.endereco(), reader.telefone());

                    iC = iC + 1;
                    c = c +1;
                    break;

                case (2):

                    produto.setcProduto(iP, reader.productName(), reader.productPrice());
                    iP = iP + 1;

                    break;


                    case (3):
                        produto.listProduto();
                        break;

                    case(4):
                        venda.pedido();
                        break;

                    case(5):
                       m = false;
                }
            }


    }
}