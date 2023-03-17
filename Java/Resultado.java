public class Resultado {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Eduardo", 24, "Mato Grosso");
        System.out.println(p);
        
        Funcionario f = new Funcionario("Thiago", 20, "São Paulo");
        System.out.println(f);
        
        Cliente c = new Cliente("Pedro", 40, "Rio de Janeiro");
        System.out.println(c);
    }
}