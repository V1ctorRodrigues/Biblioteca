public class MidiaDigital extends Material{

    MidiaDigital(String id, String titulo, int quantidade){
        super(id, titulo, quantidade);
    }

    public int getPrazoEmDias(){
        return 2;
    }
    
}
