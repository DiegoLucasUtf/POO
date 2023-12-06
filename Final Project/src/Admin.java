public class Admin extends Pessoa {

    public Admin ( ) {

        super( 0, "",  "", "" );
        this.email = "";

    }
    

    private String email;


    // Setters da Classe
    public void setEmail ( String email ) {

        this.email = email;

    }


    // Getters da Classe
    public String getEmail() {

        return email;

    }
    
}
