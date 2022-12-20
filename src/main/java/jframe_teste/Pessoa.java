package jframe_teste;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private String email;

    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static List<Pessoa> criaLista(){
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa( "Elaine Martins",00, "elaine@elaimne.com"));
        listaPessoas.add(new Pessoa( "Fulano de Tal" ,22, "fulano@fulano.com" ));
        listaPessoas.add(new Pessoa( "Andr� Marques" ,33, "andre@andre.com"   ));
        listaPessoas.add(new Pessoa( "Jose Antonio"  ,44, "jose@jose.com"     ));
        listaPessoas.add(new Pessoa( "Joao da Silva" ,55, "joao@joao.com"     ));

        return listaPessoas;
    }
}
