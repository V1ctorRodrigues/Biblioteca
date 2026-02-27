import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private String usuarioId;
    private String materialId;

    public enum StatusEmprestimo {ATIVO, DEVOLVIDO};
    
    LocalDate hoje = LocalDate.now();
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataDeHoje = hoje.format(formatarData);

    
    public String DataDeEmprestimo(){
        return dataDeHoje;
    }

    public String DataDeDevolucao(){
        
    }
    
    
}
