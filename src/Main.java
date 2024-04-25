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

                        for(int i = 0; i <= 6; i++) {
                            if(i==0){
                                cliente.setcCliente(iC,i,reader.name());
                            } else if(i==1){
                                cliente.setcCliente(iC,i,reader.cpf());
                            } else if(i==2){
                                cliente.setcCliente(iC,i,reader.email());
                            } else if(i==3){
                                cliente.setcCliente(iC,i,reader.cep());
                            } else if(i==4){
                                cliente.setcCliente(iC,i,reader.endereco());
                            }else if(i==5) {
                                cliente.setcCliente(iC,i,reader.telefone());
                            }

                        }iC = iC + 1;
                        c = c +1;
                        break;

                    case (2):

                        produto.setcProduto(iP, 0, reader.productName());
                        produto.setcProduto(iP, 1, reader.productPrice());
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