package model.bean;
public class Cliente {
    private int CPF_Cliente;
    private String nome;
    private String rua;
    private String bairro;
    private String cidade;
    
    
    
    public int getCPF_Cliente() {
        return CPF_Cliente;
    }

    public void setCPF_Cliente(int CPF_Cliente) {
        this.CPF_Cliente = CPF_Cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    

}
