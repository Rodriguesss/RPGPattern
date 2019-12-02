package Jogo;

public class MinhaConta {
    
    public static void main(String[] args) {
        Personagem Merlin = new Personagem();
        Classe classe;
                             
        try {
            classe = Merlin.equipaClasse("Mago");
            if (classe.VerificaClasse()) {
                classe.nomeClasse();                
            }
        } catch (ClasseInvalidaException ex) {
            System.err.println("Impossivel criar esta classe.");
        }
        
        System.out.println("");
        Arma arma1 = new CajadoDeFogo();  
        Merlin.trocarArma(arma1);
        Merlin.nomeArma();
        Merlin.pesoArma();
        Merlin.descricaoArma();
        
        
        System.out.println("");
        Benção up = new UparComBenção();
        up.subirNivel();
        
    }
}
