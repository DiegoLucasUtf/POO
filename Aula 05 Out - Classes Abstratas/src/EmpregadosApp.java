public class EmpregadosApp {

    public static void imprimeRendimentos ( Empregado nome ) {

        System.out.printf( "%s\nRecebeu: R$%.2f\n", nome, nome.Rendimentos() );

    }

    public static void main(String[] args) throws Exception {

        // A linha abaixo não funciona pois a Classe empregado é uma classe abstrata
            //Empregado e = new Empregado( "João", "da Silva", "123456789-11" );

        Empregado João = new EmpregadoAssalariado ("João", "da Silva", "123456789-11", 1499.99 );
        imprimeRendimentos(João);

        Empregado  Roberto = new EmpregadoComissionado ("Roberto", "Freitas", "987654321-00", 20000.92, 0.01 );
        imprimeRendimentos(Roberto);

        Empregado Francisco = new EmpregadoBaseMaisComissao("Francisco", "Jorge", "123459876-12", 16754.99, 0.01, 4000 );
        imprimeRendimentos(Francisco);

        // Empregados Processados Polimorficamente
        Empregado [] empregados = new Empregado[3];
        empregados[0] = EmpregadoAssalariado;
        empregados[1] = EmpregadoComissionado;
        empregados[2] = EmpregadoBaseMaisComissao;

        for ( Empregado emp : empregados ) {

           System.out.println( emp );

           if ( emp instanceof EmpregadoBaseMaisComissao ) {

            EmpregadoBaseMaisComissao empBC = (EmpregadoBaseMaisComissao) emp;

            // Aumenta o salário base em 10%
            empBC.setSalarioBase ( empBC.getSalarioBase() * 1.1 );
            System.out.printf ( "Novo Salário Base com aumento de 10%%:" + "R$%,.2f\n", empBC.getSalarioBase() );

           }

           System.out.printf("Recebeu? %,.2f\n\n", emp.imprimeRendimentos() );

        }

        // Obtendo os tipos de cada objeto do vetor empregados
        System.out.println ( "\n\n OBTENDO OS TIPOS DE CADA OBJETO DO VETOR empregados " );

        for ( Empregado emp : empregados ) {

            System.out.printf ( "Este empregado é um: %s\n", emp.getClass().getNome() );

        }
    
    }

}
