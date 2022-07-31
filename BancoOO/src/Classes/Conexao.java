package Classes;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import java.util.List;


public class Conexao {
    private ObjectContainer db = null;
    
    private void abrirBanco(){
        db = Db4oEmbedded.openFile("banco");
    }
    
    private void fecharBanco(){
        db.close();
    }
    
    public void insertProduto(Produto p){
        abrirBanco();
        db.store(p);
        fecharBanco();
    }
    
    public void insertCliente(Cliente cli){
        abrirBanco();
        db.store(cli);
        fecharBanco();
    }
    public void insertMotorista(Motorista m){
        abrirBanco();
        db.store(m);
        fecharBanco();
    }
    void insertEntrega(Entrega e) {
        abrirBanco();
        db.store(e);
        fecharBanco();
        
    }
    
    public void insertVenda(Venda ve){
        abrirBanco();
        db.store(ve);
        fecharBanco();
        
    }
    
    public void insertVendedor(Vendedor v){
        abrirBanco();
        db.store(v);
        fecharBanco();
    }
    
     public List<Venda> selectAllVenda(){
        abrirBanco();
        ObjectSet listVenda = db.queryByExample(Venda.class);
        List<Venda> lve = new ArrayList<>();
        for (Object listVendas : listVenda) {
            lve.add((Venda)listVendas);
        }
        fecharBanco();
        return lve;
        
    }
    public List<Entrega> selectAllEntrega(){
        abrirBanco();
        ObjectSet listEntrega = db.queryByExample(Entrega.class);
        List<Entrega> le = new ArrayList<>();
        for (Object listEntregas : listEntrega) {
            le.add((Entrega)listEntregas);
        }
        fecharBanco();
        return le;
        
    }
    public List<Cliente> selectAllCliente(){
        abrirBanco();
        ObjectSet listCliente = db.queryByExample(Cliente.class);
        List<Cliente> clp = new ArrayList<>();
        for (Object listClientes : listCliente) {
            clp.add((Cliente)listClientes);
        }
        fecharBanco();
        return clp;
    }
    
    public List<Vendedor> selectAllVendedor(){
        abrirBanco();
        ObjectSet listVendedor = db.queryByExample(Vendedor.class);
        List<Vendedor> lv = new ArrayList<>();
        for (Object listVendedores : listVendedor) {
            lv.add((Vendedor)listVendedores);
        }
        fecharBanco();
        return lv;
    }
    
    public List<Motorista> selectAllMotorista(){
        abrirBanco();
        ObjectSet listMotorista = db.queryByExample(Motorista.class);
        List<Motorista> lm = new ArrayList<>();
        for (Object listMotoristas : listMotorista) {
            lm.add((Motorista)listMotoristas);
        }
        fecharBanco();
        return lm;
        
    }
    
    
    public List<Produto> selectAllProduto(){
        abrirBanco();
        ObjectSet listProduto = db.queryByExample(Produto.class);
        List<Produto> lp = new ArrayList<>();
        for (Object listProdutos : listProduto) {
            lp.add((Produto)listProdutos);
        }
        fecharBanco();
        return lp;
    }
    
    public Cliente selectCliente(Cliente cli){
        abrirBanco();
        ObjectSet result = db.queryByExample(cli);
        Cliente cliente = (Cliente) result.next();
        fecharBanco();
        return cliente;
    }
    
    public Motorista selectMotorista(Motorista m){
        abrirBanco();
        ObjectSet result = db.queryByExample(m);
        Motorista motorista = (Motorista) result.next();
        fecharBanco();
        return motorista;
        
    }
    public Produto selectProduto(Produto p){
        abrirBanco();
        ObjectSet result = db.queryByExample(p);
        Produto produto = (Produto)  result.next();
        fecharBanco();
        return produto;
    }
    public Entrega selectEntrega(Entrega e){
        abrirBanco();
        ObjectSet result = db.queryByExample(e);
        Entrega entrega = (Entrega)  result.next();
        fecharBanco();
        return entrega;
    }
    public Vendedor selectVendedor(Vendedor v){
        abrirBanco();
        ObjectSet result = db.queryByExample(v);
        Vendedor vendedor = (Vendedor)  result.next();
        fecharBanco();
        return vendedor;
        
    }
    
    public void updateProduto(int codPro, double ccusto, String ddescricao, int ppreco, String nnome){
        abrirBanco();
        Produto p = new Produto();
        p.setCodPro(codPro);
        ObjectSet result = db.queryByExample(p);
        Produto presult = (Produto) result.next();
        presult.setCusto(ccusto);
        presult.setDescricao(ddescricao);
        presult.setPreco(ppreco);
        presult.setNome(nnome);
        db.store(presult);
        fecharBanco();       
    }
    
    void updateEntrega(int numVen, String hhora, String ddate, String pplaca) {
        abrirBanco();
        Entrega e = new Entrega();
        e.setNumVen(numVen);
        
        ObjectSet result = db.queryByExample(e);
        Entrega eresult = (Entrega) result.next();
        
        eresult.setHora(hhora);
        eresult.setDate(ddate);
        eresult.setPlaca(pplaca);
        db.store(eresult);
        fecharBanco();
        
    }


    public void updateCliente(int codCli, String nnome, String ttel, String eendereco, double ccpf, String eemail){
        abrirBanco();
        Cliente cli = new Cliente();
        cli.setCodCli(codCli);
        
        ObjectSet result = db.queryByExample(cli);
        Cliente cresult = (Cliente) result.next();
        
        cresult.setNome(nnome);
        cresult.setTel(ttel);
        cresult.setEndereco(eendereco);
        cresult.setCpf(ccpf);
        cresult.setEmail(eemail);
        db.store(cresult);
        fecharBanco();       
    }
    
    public void updateVendedor(int codVdd, double ccpf, double ccomissao, String nnome, String eendereco){
        abrirBanco();
        Vendedor v = new Vendedor();
        v.setCodVdd(codVdd);
        ObjectSet result = db.queryByExample(v);
        Vendedor vresult = (Vendedor) result.next();
        
        vresult.setCpf(ccpf);
        vresult.setComissao(ccomissao);
        vresult.setNome(nnome);
        vresult.setEndereco(eendereco);
      
        db.store(vresult);
        fecharBanco();       
    }
    
    
    
    
    public void updateMotorista(int codMot, double ccpf, String nnome, String eendereco){
        abrirBanco();
        Motorista m = new Motorista();
        m.setCodMot(codMot);
        ObjectSet result = db.queryByExample(m);
        Motorista mresult = (Motorista) result.next();
        
        mresult.setCpf(ccpf);
        mresult.setNome(nnome);
        mresult.setEndereco(eendereco);
    }
    
    public void deleteMotorista(int codMot){
        abrirBanco();
        Motorista m = new Motorista();
        m.setCodMot(codMot);
        ObjectSet result = db.queryByExample(m);
        Motorista mresult = (Motorista) result.next();
        db.delete(mresult);
        fecharBanco();
    }
    
    public void deleteProduto(int codPro){
        abrirBanco();
        Produto p = new Produto();
        p.setCodPro(codPro);
        ObjectSet result = db.queryByExample(p);
        Produto presult = (Produto) result.next();
        db.delete(presult);
        fecharBanco();
    }
    
    public void deleteCliente(int codCli){
        abrirBanco();
        Cliente cli = new Cliente();
        cli.setCodCli(codCli);
        ObjectSet result = db.queryByExample(cli);
        Cliente cresult = (Cliente) result.next();
        db.delete(cresult);
        fecharBanco();
        
    }
    
    public void deleteEntrega(int numVen){
        abrirBanco();
        Entrega e = new Entrega();
        e.setNumVen(numVen);
        ObjectSet result = db.queryByExample(e);
        Entrega eresult = (Entrega) result.next();
        db.delete(eresult);
        fecharBanco();
        
    }
     public void deleteVendedor(int codVdd){
        abrirBanco();
        Vendedor v = new Vendedor();
        v.setCodVdd(codVdd);
        ObjectSet result = db.queryByExample(v);
        Vendedor vresult = (Vendedor) result.next();
        db.delete(vresult);
        fecharBanco();
        
    }

    

    
   

   

  
    
}
