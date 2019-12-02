package Jogo;

public class Personagem {
    
    private Arma tipoArma;
    
    public Personagem(){
        tipoArma = new Canivete();
    }
    
    public  Classe equipaClasse(String classeDesejada) throws ClasseInvalidaException {
        if (classeDesejada.equalsIgnoreCase("Guerreiro")) {
            return new Guerreiro();
        } else if (classeDesejada.equalsIgnoreCase("Mago")) {
            return new Mago();
        }
        throw new ClasseInvalidaException();
    }
    
    public void trocarArma(Arma novaArma){
        this.tipoArma = novaArma;
    }
    
    public void nomeArma(){
        tipoArma.nome();
    }
    
    public void pesoArma(){
        tipoArma.peso();
    }
    
    public void descricaoArma(){
        tipoArma.descricao();
    }
}
