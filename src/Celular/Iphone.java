package Celular;

public class Iphone {
    public static void main(String[] args) {
        IphoneInterface iphone= new IphoneInterface();
        iphone.AbirNavegador();
        iphone.adicionarAba();
        iphone.ligar();
        iphone.IniciarCorreioVoz();
        iphone.selecionarMusica();
        iphone.pausar();
    }
}
