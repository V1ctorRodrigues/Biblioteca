public class Livro extends Material{

    public Livro(String id, String titulo, int quantidade){
        super(id, titulo, quantidade);
    }

    @Override
    public int getPrazoEmDias(){
        return 7;
    }
    
}
