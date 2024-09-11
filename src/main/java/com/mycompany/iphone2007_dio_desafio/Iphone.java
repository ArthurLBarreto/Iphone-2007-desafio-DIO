package com.mycompany.iphone2007_dio_desafio;



public class Iphone implements Musica, NavegadorInternet, AparelhoTelefonico {

    private boolean conexaoInternet;
    private boolean chipAtivo;

    @Override
    public void navegarNaInternet() {
if(isConexaoInternet()){
    System.out.println("Você está navegando na internet");
}else{
    System.out.println("Voce Não possui conexão com a internet");
}
    }

   

    @Override
    public void fazerLigacao(String numeroParaLigar, String mensagem) {

        if(isChipAtivo()){
            System.out.println("Ligação para o número "+numeroParaLigar+" foi bem sucedida\nVocê falou: "+mensagem+". A respota foi: Ok, eu vou pensar");
        }else{
            System.out.println("Seu chip foi cancelado, por favor ativio ");
        }
        
    }

    @Override
    public void receberLigacao(String numeroLigando, boolean aceitarLigacao) {
        if (isChipAtivo()) {
            if (aceitarLigacao) {
                System.out.println("Você aceitou a ligação\nA pessoa do outro lado falou: Pague o que me deve. E depois desligou.");
            }else{
                System.out.println("Você recusou a ligação");
            }
        }else{
            System.out.println("Impossivel receber ligação, o chip não está ativo");
        }
    }

    @Override
    public void ouvirMusica(String nomeMusica) {
        System.out.println("Você está ouvindo: "+nomeMusica);
       
    }

     public boolean isConexaoInternet() {
        return conexaoInternet;
    }

    public void setConexaoInternet(boolean conexaoInternet) {
        this.conexaoInternet = conexaoInternet;
    }

    public boolean isChipAtivo() {
        return chipAtivo;
    }

    public void setChipAtivo(boolean chipAtivo) {
        this.chipAtivo = chipAtivo;
    }
    
    
    
    public static void main(String[] args) {
        
        Iphone iphoneTeste = new Iphone();
        
        iphoneTeste.setConexaoInternet(true);
        iphoneTeste.setChipAtivo(true);
        
        iphoneTeste.navegarNaInternet();
        iphoneTeste.fazerLigacao("Steve Jobs", "Me Contrata ai por favor");
        iphoneTeste.receberLigacao("Steve Jobs", true);
        iphoneTeste.ouvirMusica("Sonhar");
        
    }
    
}
