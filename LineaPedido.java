
/**
 *  Describe una línea de un pedido
 *  En una línea de pedido se incluye un producto
 *  y el nº de unidades compradas de ese producto
 *   Oskar Contreras
 */
public class LineaPedido
{
    private Producto producto;
    private int cantidad;

    /**
     * Constructor  
     */
    public LineaPedido(Producto producto, int cantidad)    {
        this.producto = producto;
        this.cantidad = 0;
    }

    /**
     * accesor para el producto
     */
    public   Producto  getProducto() {
        return producto;
    }

    /**
     * accesor para la cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * obtiene una nueva línea de pedido copia idéntica de la actual
     */
    public LineaPedido  obtenerCopia() {
        LineaPedido pedido = new LineaPedido(this.producto,this.cantidad);
        return pedido;
        
    }

    /**
     * Representación textual de la línea de pedido
     * (ver enunciado)
     */
    public String toString() {
        return (producto.toString() + "%4d" + cantidad + "unidades");
    }
}
