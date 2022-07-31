package Classes;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static Conexao c = null;
    private static Entrega e = null;
    private static Venda ve = null;
   
    private static Vendedor v = null;
    private static Cliente cli = null;
    private static Produto p = null;
    private static Motorista m = null;
    private static List<Venda> lve = null;
    private static List<Entrega> le = null;
    private static List<Vendedor> lv = null;
    private static List<Motorista> lm = null;
    private static List<Cliente> clp = null;
    private static List<Produto> lp = null;
    private static int opcao = 0;
    private static int menu = 0;
    private static Scanner entrada = new Scanner(System.in);
    private static int codPro, preco, codCli, codMot, codVdd, numVen;
    private static String nome, descricao, tel, endereco, email, hora, placa,date;
    private static double custo, cpf, comissao, valorTotal;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        do {
            System.out.println("Loja de Veículos");
            System.out.println("1 - Produto");
            System.out.println("2 - Clientes");
            System.out.println("3 - Motorista");
            System.out.println("4 - Vendedor");
            System.out.println("5 - Entrega");
            System.out.println("6 - Nova Venda");
            menu = entrada.nextInt();
            
             switch (menu) {
                case 1:
                    produtos();
                    break;
                case 2:
                    clientes();
                    break;
                case 3:
                    motoristas();
                    break;
                case 4:
                    vendedor();
                    break;
                case 5:
                    entregas();
                    break;
                case 6:
                    vendas();
                default:
                    System.out.println("Opção inválida.");
            }
        } while (menu != 0);
    }
    
    private static void vendas(){
        do {
            System.out.println("Cadastro de produtos");
            System.out.println("1 - Realizar nova venda;");
            System.out.println("2 - Exibir todos as vendas;");
            
            System.out.println("3 - Sair.");
            System.out.println("Informe o número da opção desejada");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    realizarVenda();
                    break;
                case 2:
                    exibirVendas();
                    break;
                
                case 3:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        
    }
    private static void entregas(){
        do {
            System.out.println("Cadastro de produtos");
            System.out.println("1 - Inserir novo registro;");
            System.out.println("2 - Exibir todos os registros;");
            System.out.println("3 - Exibir registro individual;");
            System.out.println("4 - Alterar informações no registro;");
            System.out.println("5 - Apagar registro;");
            System.out.println("6 - Sair.");
            System.out.println("Informe o número da opção desejada");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gravarEntrega();
                    break;
                case 2:
                    exibirTodosEntrega();
                    break;
                case 3:
                    exibirRegistroEntrega();
                    break;
                case 4:
                    alterarDadosEntrega();
                    break;
                case 5:
                    apagarRegistroEntrega();
                    break;
                case 6:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        
    }
    private static void produtos(){
        do {
            System.out.println("Cadastro de produtos");
            System.out.println("1 - Inserir novo registro;");
            System.out.println("2 - Exibir todos os registros;");
            System.out.println("3 - Exibir registro individual;");
            System.out.println("4 - Alterar informações no registro;");
            System.out.println("5 - Apagar registro;");
            System.out.println("6 - Sair.");
            System.out.println("Informe o número da opção desejada");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gravarProduto();
                    break;
                case 2:
                    exibirTodos();
                    break;
                case 3:
                    exibirRegistro();
                    break;
                case 4:
                    alterarDados();
                    break;
                case 5:
                    apagarRegistro();
                    break;
                case 6:
                    System.out.println("Sair.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);
        
    }
    
    private static void vendedor(){
        do {
            System.out.println("Cadastro de vendedores");
            System.out.println("1 - Inserir novo registro;");
            System.out.println("2 - Exibir todos os registros;");
            System.out.println("3 - Exibir registro individual;");
            System.out.println("4 - Alterar informações no registro;");
            System.out.println("5 - Apagar registro;");
            System.out.println("6 - Sair.");
            System.out.println("Informe o número da opção desejada");      
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gravarVendedor();
                    break;
                case 2:
                    exibirTodosVendedor();
                    break;
                case 3:
                    exibirRegistroVendedor();
                    break;
                case 4:
                    alterarDadosVendedor();
                    break;
                case 5:
                    apagarRegistroVendedor();
                    break;
          
                    
                
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
    }
    
    
    private static void motoristas(){
        do {
            System.out.println("Cadastro de motorista");
            System.out.println("1 - Inserir novo registro;");
            System.out.println("2 - Exibir todos os registros;");
            System.out.println("3 - Exibir registro individual;");
            System.out.println("4 - Alterar informações no registro;");
            System.out.println("5 - Apagar registro;");
            System.out.println("6 - Sair.");
            System.out.println("Informe o número da opção desejada");      
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gravarMotorista();
                    break;
                case 2:
                    exibirTodosMotoristas();
                    break;
                case 3:
                    exibirRegistroMotorista();
                    break;
                case 4:
                    alterarDadosMotorista();
                    break;
                case 5:
                    apagarRegistroMotorista();
                    break;
          
                    
                
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
        
    }
    private static void clientes(){
        do {
            System.out.println("Cadastro de cliente");
            System.out.println("1 - Inserir novo registro;");
            System.out.println("2 - Exibir todos os registros;");
            System.out.println("3 - Exibir registro individual;");
            System.out.println("4 - Alterar informações no registro;");
            System.out.println("5 - Apagar registro;");
            System.out.println("6 - Sair.");
            System.out.println("Informe o número da opção desejada");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    gravarCliente();
                    break;
                case 2:
                    exibirTodosClientes();
                    break;
                case 3:
                    exibirRegistroCliente();
                    break;
                case 4:
                    alterarDadosCliente();
                    break;
                case 5:
                    apagarRegistroCliente();
                    break;
                    
                
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        
    }
    
    
    private static void gravarMotorista(){
        c = new Conexao();
        m = new Motorista();
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Gravar novo registro:");
        System.out.println("Informe o código do mototirsta: ");
        codMot = entrada.nextInt();
        System.out.println("Informe o cpf do motorista: ");
        cpf = entrada.nextDouble();
        System.out.println("Informe o nome do motorista: ");
        nome = entradaTexto.nextLine();
        System.out.println("Informe o endereço do motorista: ");
        endereco = entradaTexto.nextLine();
        
        m.setCodMot(codMot);
        m.setCpf(cpf);
        m.setNome(nome);
        m.setEndereco(endereco);
        c.insertMotorista(m);
        
        
    }
    
    private static void realizarVenda(){
        c = new Conexao();
        ve = new Venda();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Registrar nova venda: ");
        System.out.println("Informe o número da venda ");
        numVen = entrada.nextInt();
        System.out.println("Informe o valor total ");
        valorTotal = entrada.nextDouble();
        
        ve.setNumVen(numVen);
        ve.setValorTotal(valorTotal);
        c.insertVenda(ve);    
        
    }
    
    private static void gravarEntrega(){
        c = new Conexao();
        e = new Entrega();
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Gravar novo registro:");
        
        System.out.println("Informe o número da entrega: ");
        numVen = entrada.nextInt();
        System.out.println("Informe a hora da entrega: ");
        hora = entradaTexto.nextLine();
        System.out.println("Informe a data da entrega: ");
        date = entradaTexto.nextLine();
        System.out.println("Informe a placa do veículo: ");
        placa = entradaTexto.nextLine();
        
        e.setNumVen(numVen);
        e.setHora(hora);
        e.setDate(date);
        e.setPlaca(placa);
        c.insertEntrega(e);
        
    }
    
    private static void gravarCliente(){
        c = new Conexao();
        cli = new Cliente();
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Gravar novo registro:");
        System.out.println("Informe o código do cliente: ");
        codCli = entrada.nextInt();
        System.out.println("Informe o nome do cliente: ");
        nome = entradaTexto.nextLine();
        System.out.println("Informe o telefone do cliente: ");
        tel = entradaTexto.nextLine();
        System.out.println("Informe o endereço do cliente: ");
        endereco = entradaTexto.nextLine();
        System.out.println("Informe o cpf do cliente: ");
        cpf = entrada.nextDouble();
        
        cli.setCodCli(codCli);
        cli.setNome(nome);
        cli.setTel(tel);
        cli.setEndereco(endereco);
        cli.setCpf(cpf);
        c.insertCliente(cli);
      
    }
    
    
    
    private static void gravarVendedor(){
        c = new Conexao();
        v = new Vendedor();
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Gravar novo registro:");
        System.out.println("Informe o código do vendedor: ");
        codVdd = entrada.nextInt();
        System.out.println("Informe o cpf do vendedor: ");
        cpf = entrada.nextDouble();
        
        System.out.println("Informe o valor da comissao do vendedor: ");
        comissao = entrada.nextDouble();
        System.out.println("Informe o nome do vendedor: ");
        nome = entradaTexto.nextLine();
        System.out.println("Informe o endereço do vendedor: ");
        endereco = entradaTexto.nextLine();

        v.setCodVdd(codVdd);
        v.setCpf(cpf);
        v.setComissao(comissao);
        v.setNome(nome);
        v.setCpf(cpf);
        c.insertVendedor(v);
        
    }
    
     private static void exibirTodosClientes() {
        c = new Conexao();
        System.out.println("Todos os registros cadastradados:");
        clp = c.selectAllCliente();
        for (Cliente clpl : clp) {
            System.out.println(clpl);
            
        }
    }
     
     private static void exibirTodosVendedor() {
        c = new Conexao();
        System.out.println("Todos os registros cadastradados:");
        lv = c.selectAllVendedor();
        for (Vendedor lvl : lv) {
            System.out.println(lvl);
            
        }
    }
     
     private static void exibirVendas(){
         c = new Conexao();
         System.out.println("Todos os registros cadastradados:");
         lve = c.selectAllVenda();
         for (Venda lvel : lve){
             System.out.println(lvel);
         }
     }
    
     private static void exibirTodosMotoristas() {
        c = new Conexao();
        System.out.println("Todos os registros cadastradados:");
        lm = c.selectAllMotorista();
        for (Motorista lml : lm) {
            System.out.println(lml); 
        }    
     }
     
     private static void exibirTodosEntrega(){
         c = new Conexao();
         System.out.println("Todos os registros cadastradados:");
         le = c.selectAllEntrega();
         for (Entrega lel : le){
             System.out.println(lel);
         }
         
     }
     private static void exibirRegistroCliente(){
        c = new Conexao();
        cli = new Cliente();
        System.out.println("Exibir registro escolhido:");
        System.out.println("Informe o código do cliente:");
        codCli = entrada.nextInt();
        cli.setCodCli(codCli);
        Cliente cresult = c.selectCliente(cli);
        System.out.println(cresult);
    }
     
     private static void exibirRegistroMotorista(){
        c = new Conexao();
        m = new Motorista();
        System.out.println("Exibir registro escolhido:");
        System.out.println("Informe o código do motorista:");
        codMot = entrada.nextInt();
        m.setCodMot(codMot);
        Motorista mresult = c.selectMotorista(m);
        System.out.println(mresult);
         
     }
     
      private static void exibirRegistroEntrega(){
          c = new Conexao();
          e = new Entrega();
          System.out.println("Exibir registro escolhido:");
          System.out.println("Informe o numero da venda:");
          numVen = entrada.nextInt();
          e.setNumVen(numVen);
          Entrega eresult = c.selectEntrega(e);
          System.out.println(eresult);
          
      }
     
   
    
    
    private static void gravarProduto() {
        c = new Conexao();
        p = new Produto();
        
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Gravar novo registro:");
        
        System.out.println("informe o código do produto:");
        codPro = entrada.nextInt();
        
        System.out.println("informe o nome do produto:");
        nome = entradaTexto.nextLine();
        
        System.out.println("informe a descrição do produto:");
        descricao = entradaTexto.nextLine();
        
        System.out.println("informe o preço do produto: ");
        preco = entrada.nextInt();
        
        System.out.println("informe o custo do produto: ");
        custo = entrada.nextDouble();
       
        p.setCodPro(codPro);
        p.setCusto(custo);
        p.setDescricao(descricao);
        p.setPreco(preco);     
        p.setNome(nome);   
        c.insertProduto(p);
    }

    private static void exibirTodos() {
        c = new Conexao();
        System.out.println("Todos os registros cadastradados:");
        lp = c.selectAllProduto();
        for (Produto lp1 : lp) {
            System.out.println(lp1);
        }
    }
    
    private static void exibirRegistro(){
        c = new Conexao();
        p = new Produto();
        System.out.println("Exibir registro escolhido:");
        System.out.println("Informe o código do produto:");
        codPro = entrada.nextInt();
        p.setCodPro(codPro);
        Produto presult = c.selectProduto(p);
        System.out.println(presult);
    }
    
    private static void exibirRegistroVendedor(){
        c = new Conexao();
        v = new Vendedor();
        System.out.println("Exibir registro escolhido:");
        System.out.println("Informe o código do vendedor:");
        codVdd = entrada.nextInt();
        v.setCodVdd(codVdd);
        Vendedor vresult = c.selectVendedor(v);
        System.out.println(vresult);
        
    }
    
    private static void alterarDados(){
        c = new Conexao();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Alterar dados do registro cadastrado:");
        System.out.println("Informe o código do produto ");
        codPro = entrada.nextInt();
        System.out.println("Informe o nome alterado:");
        nome = entradaTexto.nextLine();
        System.out.println("Informe a descrição alterada:");
        descricao = entrada.nextLine();
        System.out.println("Informe o preço alterado:");
        preco = entrada.nextInt();
        System.out.println("Informe o custo alterado:");
        custo = entrada.nextInt();
        
        
        c.updateProduto(codPro, custo, descricao, preco,nome);
    }
    
    private static void alterarDadosEntrega(){
        c = new Conexao();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Alterar dados do registro cadastrado:");
        System.out.println("Informe o num da entrega ");
        numVen = entrada.nextInt();
        System.out.println("Informe a hora alterado:");
        hora = entradaTexto.nextLine();
        System.out.println("Informe a data alterado:");
        date = entradaTexto.nextLine();
        System.out.println("Informe a placa alterado:");
        placa = entradaTexto.nextLine();
        
        c.updateEntrega(numVen, hora, date, placa);
        
        
        
        
        
        
        
    }
    
    
    private static void alterarDadosCliente(){
        c = new Conexao();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Alterar dados do registro cadastrado:");
        System.out.println("Informe o código do cliente ");
        codCli = entrada.nextInt();
        System.out.println("Informe o nome alterado:");
        nome = entradaTexto.nextLine();
        System.out.println("Informe o telefone alterado:");
        tel = entradaTexto.nextLine();
        System.out.println("Informe o endereço alterado:");
        endereco = entradaTexto.nextLine();
        System.out.println("Informe o cpf alterado:");
        cpf = entrada.nextDouble();
        email = entradaTexto.nextLine();
        
        c.updateCliente(codCli, nome, tel, endereco, cpf, email);
        
    }
    //cod, cpf, comissao, nome, endereco
    private static void alterarDadosVendedor(){
        c = new Conexao();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Alterar dados do registro cadastrado:");
        System.out.println("Informe o código do cliente ");
        codVdd = entrada.nextInt();
        System.out.println("Informe o cpf alterado:");
        cpf = entrada.nextDouble();
        System.out.println("Informe a comissão alterado:");
        comissao = entrada.nextDouble();
        System.out.println("Informe o nome alterado:");
        nome = entrada.nextLine();
        System.out.println("Informe o endereço alterado:");
        endereco = entrada.nextLine();
        
        c.updateVendedor(codVdd, cpf, comissao, nome, endereco);
        
        
        
        
    }
    
    private static void alterarDadosMotorista(){
        c = new Conexao();
        Scanner entradaTexto = new Scanner(System.in);
        System.out.println("Alterar dados do registro cadastrado:");
        System.out.println("Informe o código do motorista ");
        codMot = entrada.nextInt();
        System.out.println("Informe o cpf alterado:");
        cpf = entrada.nextDouble();
        System.out.println("Informe o nome alterado:");
        nome = entradaTexto.nextLine();
        System.out.println("Informe o endereço alterado:");
        endereco = entradaTexto.nextLine();
        
        c.updateMotorista(codMot, cpf, nome, endereco);
        
        
    }
    private static void apagarRegistroCliente(){
        c = new Conexao();
        System.out.println("Apagar um dos registro:");
        System.out.println("Informe o código do produto escolhido para apagar:");
        codCli = entrada.nextInt();
        c.deleteCliente(codCli);
    }
    
    private static void apagarRegistroMotorista(){
        c = new Conexao();
        System.out.println("Apagar um dos registro:");
        System.out.println("Informe o código do motorista escolhido para apagar:");
        codMot = entrada.nextInt();
        c.deleteMotorista(codMot);
        
    }
    
    public static void apagarRegistroEntrega(){
        c = new Conexao();
        System.out.println("Apagar um dos registro:");
        System.out.println("Informe o código do motorista escolhido para apagar:");
        numVen = entrada.nextInt();
        c.deleteMotorista(numVen);
        
    }
    
    private static void apagarRegistroVendedor(){
        c = new Conexao();
        System.out.println("Apagar um dos registros:");
        System.out.println("Informe o código do vendedor escolhido para apagar:");
        codVdd = entrada.nextInt();
        c.deleteVendedor(codVdd);
    }
    private static void apagarRegistro(){
        c = new Conexao();
        System.out.println("Apagar um dos registro:");
        System.out.println("Informe o código do produto escolhido para apagar:");
        codPro = entrada.nextInt();
        c.deleteProduto(codPro);
    }
    
}