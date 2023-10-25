public class testaFuncionario {
    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Diego Lucas", "44715257866", 8000.00);
        System.out.println ( func1.toString() );

        // Não pode fazer o contrário, tem que criar da Super Classe "Funcionário" para a Subclasse "Gerente"
        Funcionario ger1 = new Gerente( "Diego Dallaqua", null, 12000 );
        System.out.println ( ger1.toString() );

        Gerente ger2 = new Gerente("Diego Hattori", null, 12000, null, 5 );
        System.out.println ( ger2.toString() );

        func1.reajustarSalario(0.1);
        ger1.reajustarSalario(0.1);
        ger2.reajustarSalario(0.1);

        System.out.println ( "\n\n\n" + func1.toString() );
        System.out.println ( ger1.toString() );
        System.out.println ( ger2.toString() );

        // É possível criar um vetor de funcionários
        Funcionario[] arrayFunc = new Funcionario[2];
            arrayFunc[0] = new Funcionario("Priscila Dallaqua", "1234567", 8000 );
            arrayFunc[1] = new Gerente("Gustavo Dallaqua", null, 12000, null, 8 );

    }
}
