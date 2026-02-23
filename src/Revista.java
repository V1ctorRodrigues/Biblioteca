public class Revista extends Material {

    public Revista(String id, String titulo){
        super(id, titulo);
    }
    
    @Override
    public int getPrazoEmDias(){
        return 3;
    }
}
