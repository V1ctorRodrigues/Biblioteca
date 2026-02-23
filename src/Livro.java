public class Livro extends Material{
    private int quantidade;

    public int getQuantidade(){
        return quantidade;
    }

    public Livro(String id, String titulo, int quantidade){
        super(id, titulo);
        this.quantidade = quantidade;
    }

    public int emprestar(int quantidade){
        this.quantidade = quantidade;
        int contador = quantidade;

        if(quantidade<=0){
            System.out.println("Livros indisponíveis no momento");
            return quantidade;
        } else{
            System.out.println("Empréstimo realizado");
            contador=contador-1;
            return contador;
        }
    }

    @Override
    public int getPrazoEmDias(){
        return 7;
    }
    
}
