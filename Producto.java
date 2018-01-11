import java.time.LocalDate;

/**
 * Pruebas sobre la clase LocalDate
 * 
 * Fuentes:
 * https://docs.oracle.com/javase/8/docs/api/
 * https://www.solvetic.com/tutoriales/article/1345-trabajando-con-fechas-en-java-8/
 * https://www.aprenderaprogramar.com/foros/index.php?topic=5580.0
 *
 * @author Dasins
 * @version 11/1/2018
 */
public class Producto{
    // El lote del producto.
    private String lote;
    // Fecha de caducidad del producto.
    private LocalDate caducidad;

    // === Constructores ===
    /**
     * Constructor de objetos de la clase Producto.
     */
    public Producto()
    {
        lote = "";
        caducidad = null;
    }

    /**
     * Constructor de objetos de la clase Producto.
     * @param lote Fecha de fabricacion.
     * @param caducidad Fecha límite para un consumo optimo. (yyyy-mm-dd)
     */
    public Producto(String lote, String caducidad){
        this.lote = lote;
        this.caducidad = LocalDate.parse(caducidad);
    }
    
    // === Metodos Getter ===
    /**
     * @return Devuelve el lote del producto.
     */
    public String getLote(){
        return lote;
    }
    
    /**
     * @return Devuelve el lote del producto.
     */
    public LocalDate getCaducidad(){
        return caducidad;
    }
    
    // === Metodos Setter ===
    /**
     * Establece el lote producto.
     * @param lote Nueva lote del producto.
     */
    public void setLote(String lote) {
        this.lote = lote;
    }
    /**
     * Establece la fecha de caducidad del producto.
     * @param caducidad Nueva fecha límite para un consumo optimo. (yyyy-mm-dd)
     */
    public void setCaducidad(String caducidad) {
        this.caducidad = LocalDate.parse(caducidad);
    }
}
