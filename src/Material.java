public abstract class Material{
    private String id;
    private String titulo;
    private int quantidade;

    public String getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getQuantidade(){
        return quantidade;
    }

    public Material(String id, String titulo, int quantidade) {
        this.titulo = titulo; this.id = id; this.quantidade = quantidade;
    }

    public boolean emprestar(){
        if(quantidade<=0){
            return false;
        }else{
            quantidade--;
            return true;
        }
    }

    public boolean devolver(){
        quantidade++;
        return true;
    }
  
    public abstract int getPrazoEmDias();
}