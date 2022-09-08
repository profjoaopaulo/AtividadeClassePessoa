import javax.swing.JOptionPane;

public class TestePessoa {
    
    public static void main(String[] args) {
        
        //Instanciação dos objetos da classe Pessoa
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa();

        //Configuração dos atributos do objeto pessoa
        pessoa.setNome("Kedna");
        pessoa.setSexo('F');
        pessoa.setDataNascimento("01/11/2000");

        //Configuração dos atributos do objeto pessoa1
        pessoa1.setNome("Tiago");
        pessoa1.setSexo('M');
        pessoa1.setDataNascimento("01/11/1995");

        //Imprimindo os valores dos atributos
        /*System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Nome: " + pessoa.getSexo());
        System.out.println("Nome: " + pessoa.getDataNascimento());*/

        //Duas formas (via terminal e via JOptionPane) de visualizar os dados dos objetos (pessoa e pessoa1)
        System.out.println("Dados:\n" + pessoa1.mostrarDados()  + "\n" + pessoa1.toString() + "\nIdade: " + pessoa1.idade());
        JOptionPane.showMessageDialog(null, pessoa.mostrarDados() + "\n" + pessoa.toString() + "\nIdade: " + pessoa.idade(), "Dados da Pessoa", JOptionPane.INFORMATION_MESSAGE);
    }
}
