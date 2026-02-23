public class Livro extends Material{

    public Livro(String id, String titulo){
        super(id, titulo);
    }

    @Override
    public int getPrazoEmDias(){
        return 7;
    }
    
}
