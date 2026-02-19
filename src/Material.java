public abstract class Material{
    private String id;
    private String titulo;
    private boolean disponivel = true;

    public String getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public boolean isDisponivel(){
        return disponivel;
    }
    public Material(String id, String titulo) {
        this.titulo = titulo;
        this.id = id;
    }
    public boolean emprestar(){
        if(disponivel){
            disponivel = false;
            return true;
        }
            return false;
    }
    public boolean devolver(){
        if(!disponivel){
            disponivel = true;
            return true;
        }
            return false;
    }
}