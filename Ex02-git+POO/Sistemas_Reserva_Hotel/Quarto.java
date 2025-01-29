public class Quarto {

    //Atributos
    public int id;
    public String tipo;
    public double preco_diaria;
    public boolean disponivel;

    //Construtor
    public Quarto() {}
    public Quarto(int id, String tipo, double preco_diaria, boolean disponivel) {
        this.id=id;
        this.tipo=tipo;
        this.preco_diaria=preco_diaria;
        this.disponivel=disponivel;
    }

    //Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco_diaria() {
        return preco_diaria;
    }

    public void setPreco_diaria(double preco_diaria) {
        this.preco_diaria = preco_diaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void MarcarIndisponivel() {
        disponivel = false;
    }

    public void MarcarDisponivel() {
        disponivel = true;
    }

    public void ExibirDetalhes() {
        System.out.println(getId());
        System.out.println(getTipo());
        System.out.println(getPreco_diaria());
        System.out.println(isDisponivel());
    }
}