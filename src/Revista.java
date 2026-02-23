public class Revista extends Material {

    public Revista(String id, String titulo, int quantidade){
        super(id, titulo, quantidade);
    }
    
    @Override
    public int getPrazoEmDias(){
        return 3;
    }
}
