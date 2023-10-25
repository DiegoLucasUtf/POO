import javax.swing.JOptionPane;;

public class Strings {
    public static void main(String[] args) throws Exception {

        String frase = JOptionPane.showInputDialog( "Digite uma frase: " );

        if ( frase == null ) {

            JOptionPane.showMessageDialog(null, 
                "Você apertou cancelar.", "Cancelamento de processo",
                JOptionPane.INFORMATION_MESSAGE);
            
                System.exit(0);

        }

        // Método que mede o tamanho da String
        int comprimento = frase.length();

        JOptionPane.showMessageDialog(null, " A frase: '" + frase + "' possui " + comprimento + " caracteres" );
        
        // Método para converter toda a String para letras MAIÚSCULAS
        JOptionPane.showMessageDialog( null,"Maiúsculas: " + frase.toUpperCase());

        // Método para converter toda a String para letras MINÚSCULAS
        JOptionPane.showMessageDialog( null,"Minúsculas: " + frase.toLowerCase());

    }


}
