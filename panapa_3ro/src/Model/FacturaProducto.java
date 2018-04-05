
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class FacturaProducto extends Facturas implements Serializable{
    
    private ArrayList<Producto> Productos = new ArrayList<>();
    
    public FacturaProducto(String Id, Date Fecha, double Total, ArrayList<Producto> Productos, double Pago) {
        super(Id, Fecha, Total, Pago);
        this.Productos =  (ArrayList<Producto>) Productos.clone();
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }
}
