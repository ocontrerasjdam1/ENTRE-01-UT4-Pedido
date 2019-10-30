

/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
   private Fecha fecha;
    private Producto producto;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido()    {
       this.fecha = fecha;
       this.cliente = cliente;
       this.linea1 = linea1;
        this.linea2 = linea2;
        this.producto = producto;
        
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha  getFecha() {
         return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente  getCliente() {
         return cliente;
    }
    
    
    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public  double getImporteAntesIva() {
         double srt = linea1.getCantidad() * producto.getPrecio() + 
          linea2.getCantidad() * producto.getPrecio();
         return srt;
         
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public  double getIva() {
         return producto.getPrecio()* IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public  double getImporteTotal() {
         double srt = linea1.getCantidad() * producto.getPrecio() * IVA +
           linea2.getCantidad() * producto.getPrecio() * IVA;
         return srt;
         
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        return ("Fecha pedido :" + fecha +
                "\nDatos del cliente" + 
                "\n" + cliente.toString() + 
                "\n" + 
                "\n**** Articulos en el pedido ****" + "\n" + 
                linea1.toString() + "\n" + linea2.toString() +  "\n" + 
                "\n**** A pagar ****" + "\n" + 
                "\nImporte sin IVA : " + getImporteAntesIva() + "€" + 
                "\nIVA :" + getIva() + "€" +
                "\nImporte total :" + getImporteTotal() + "€");
    }
    
    
    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public void masAntiguoQue(Pedido otro) {
         // boolean str = true;
         
            
            
    }
    
     /**
     * devuelve una referencia al pedido actual
     */
    public  String getPedidoActual() {
        return toString();
    }

}
