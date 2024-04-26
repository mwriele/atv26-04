import java.util.ArrayList;
import java.util.Date;

class CarrinhoDeCompras {
    private int numCarrinho;
    private ArrayList<ItemCarrinho> itens;

    public CarrinhoDeCompras(int numCarrinho) {
        this.numCarrinho = numCarrinho;
        this.itens = new ArrayList<>();
    }

    public void adicionarItemCarrinho(ItemCarrinho item) {
        itens.add(item);
    }

    public void atualizarQuantidade(int numProduto, int novaQuantidade) {
        for (ItemCarrinho item : itens) {
            if (item.getNumProduto() == numProduto) {
                item.setQuantidade(novaQuantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado no carrinho.");
    }

    public void verDetalhesCarrinho() {
        for (ItemCarrinho item : itens) {
            System.out.println("Número do Produto: " + item.getNumProduto() + ", Quantidade: " + item.getQuantidade());
        }
    }

class ItemCarrinho {
    private int numProduto;
    private int quantidade;

    public ItemCarrinho(int numProduto, int quantidade) {
        this.numProduto = numProduto;
        this.quantidade = quantidade;
    }

    public int getNumProduto() {
        return numProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

class Cliente {
    private String nomeCliente;
    private String endereco;
    private String infoCartaoCredito;
    private float saldoConta;

    public Cliente(String nomeCliente, String endereco, String infoCartaoCredito, float saldoConta) {
        this.nomeCliente = nomeCliente;
        this.endereco = endereco;
        this.infoCartaoCredito = infoCartaoCredito;
        this.saldoConta = saldoConta;
    }
}

class Usuario {
    private String numUsuario;
    private String senha;
    private String statusLogin;
    private Date dataRegistro;

    public Usuario(String numUsuario, String senha, String statusLogin, Date dataRegistro) {
        this.numUsuario = numUsuario;
        this.senha = senha;
        this.statusLogin = statusLogin;
        this.dataRegistro = dataRegistro;
    }

}

class Administrador {
    private String nomeAdmin;
    private String email;

    public Administrador(String nomeAdmin, String email) {
        this.nomeAdmin = nomeAdmin;
        this.email = email;
    }
}

class Pedido {
    private int numPedido;
    private String dataCriacao;
    private String dataFrete;
    private String nomeCliente;
    private String numCliente;
    private String status;
    private String numFrete;

    public Pedido(int numPedido, String dataCriacao, String dataFrete, String nomeCliente, String numCliente, String status, String numFrete) {
        this.numPedido = numPedido;
        this.dataCriacao = dataCriacao;
        this.dataFrete = dataFrete;
        this.nomeCliente = nomeCliente;
        this.numCliente = numCliente;
        this.status = status;
        this.numFrete = numFrete;
    }
    
}

class InformacoesEnvio {
    private int numFrete;
    private String tipoFrete;
    private int precoFrete;
    private int numRegiaoFrete;

    public InformacoesEnvio(int numFrete, String tipoFrete, int precoFrete, int numRegiaoFrete) {
        this.numFrete = numFrete;
        this.tipoFrete = tipoFrete;
        this.precoFrete = precoFrete;
        this.numRegiaoFrete = numRegiaoFrete;
    }
}

class DetalhesPedido {
    private int numPedido;
    private int numProduto;
    private String nomeProduto;
    private int quantidade;
    private float precoUnidade;
    private float subtotal;

    public DetalhesPedido(int numPedido, int numProduto, String nomeProduto, int quantidade, float precoUnidade, float subtotal) {
        this.numPedido = numPedido;
        this.numProduto = numProduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
        this.subtotal = subtotal;
    }

}
