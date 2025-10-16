package livroJava.Livro;


public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePaginas;


    public Livro(String titulo,String autor, int anoPublicacao,int quantidadePaginas ){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao= anoPublicacao;
        this.quantidadePaginas=quantidadePaginas;

    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor= autor;
    }

    public int GetAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao= anoPublicacao;
    }

    public int getQuantidadePaginas(){
        return quantidadePaginas;
        
    }
    public void setQuantidadePaginas(int quantidadePaginas){
        this.quantidadePaginas=quantidadePaginas;
    }

    //calcular tempo de leitura
    public int calcularTempoLeitura(){
        return quantidadePaginas;
    }
    // Metodos para exibir informações :
    public void exibirInformacoes(){
        System.out.println("Titulos: "+titulo);
        System.out.println("Autor :"+autor);
        System.out.println("Ano de Publicação "+anoPublicacao);
        System.out.println("Paginas "+quantidadePaginas);
        System.out.println("Tempo estimado de leitura "+calcularTempoLeitura()+"Minutos");
    }










}
