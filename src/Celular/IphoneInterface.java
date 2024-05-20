package Celular;

public class IphoneInterface implements AppTelefone, NavegadorInternet, ReprodutorMusical{
    public void ligar(){
        System.out.println("Ligando.....");
    }
    public void atender(){
        System.out.println("Atendendo a ligação");

    }
    public void IniciarCorreioVoz(){
        System.out.println("Iniciando o correio de voz");
    }
    public void AbirNavegador(){
        System.out.println("Abrindo navegador");
        exibirPagina();
    }

    public void exibirPagina(){
        System.out.println("Exibindo a pagina");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina");
    }
    public void adicionarAba(){
        System.out.println("Adicionando nova aba");
        exibirPagina();
    }
    public void tocar(){
        System.out.println("Tocando a musica");

    }
    public void pausar(){
        System.out.println("pausando a musica");
    }
    public void selecionarMusica(){
        System.out.println("Selecionando a musica");
    }
    

    
}

