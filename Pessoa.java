import java.util.Calendar;

//Declaração de uma classe pública
public class Pessoa {

    //Os atributos normalmente são privados, por questões de Encapsulamento
    private String nome;
    private char sexo;
    private String dataNascimento;

    //Método construtor padrão
    public Pessoa() {

    }

    //Método construtor versão com parâmetros
    public Pessoa(String nome, char sexo, String dataNascimento) {

        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    //Declaração e implementação do método que irá reunir todos os dados da Pessoa
    public String mostrarDados() {

        String s;
        if (this.sexo == 'F')
            s = "Feminino";
        else
            s = "Masculino";

        return "Nome: " + this.nome + "\n" + "Sexo: " + s + "\n"
        + "Data de nascimento: " + this.dataNascimento;
    }

    //Declaração e implementação do método que irá calcular a idade a patir do ano atual e data de nascimento
    public int idade() {

        //Utilizando Calendar - note a importação para a mesma - para pegar a data do sistema
        Calendar calendar = Calendar.getInstance();

        String data[] = this.dataNascimento.split("/");
        int ano = Integer.parseInt(data[2]);

        //Subtraindo o ano atual pelo ano de nascimento da pessoa cadastrada
        return calendar.get(Calendar.YEAR) - ano;

        /* Obs: esta implementação só considera o ano, e não o dia e mês. */
    }

    //Demais métodos getters e setters
    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setDataNascimento(String dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
}