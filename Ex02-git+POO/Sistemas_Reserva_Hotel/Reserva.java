package Sistemas_Reserva_Hotel;

public class Reserva {

    //Atributos
    public int id;
    public Hospede hospede;
    public Quarto quarto;
    public int diarias;

    //Construtor
    public Reserva() {
    }

    //Métodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getDiarias() {
        return diarias;
    }

    public void setDiarias(int diarias) {
        this.diarias = diarias;
    }

    public void CalcularTotal() {
        double total = diarias * quarto.getPreco_diaria;
        System.out.println(total);
    }

    public void FinalizarReserva() {

    }
}