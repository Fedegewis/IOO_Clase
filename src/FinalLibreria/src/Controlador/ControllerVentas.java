package src.Controlador;

import src.Extras.FacturaDTO;
import src.Extras.ProductoFacturaDTO;
import src.Extras.ProductoRemitoDTO;
import src.Extras.RemitosEmitidosDTO;
import src.Negocio.Cliente;
import src.Negocio.Factura;
import src.Negocio.Producto;

import java.time.LocalDate;


import java.util.*;

/**
 * 
 */
public class ControllerVentas {
    private ArrayList<Remito> remitos = new ArrayList<Remito>();
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    private ArrayList<Factura> facturas = new ArrayList<Factura>();
    /**
     * Default constructor
     */
    public ControllerVentas() {
        productos.add(new Producto(1, "Producto 1", 1000));
        productos.add(new Producto(2, "Producto 2", 2000));
        productos.add(new Producto(3, "Producto 3", 3000));
        productos.add(new Producto(4, "Producto 4", 4000));
        productos.add(new Producto(5, "Producto 5", 5000));

    }

    /**
     * @return
     */
    public List<RemitosEmitidosDTO> consultarRemitosEmitidos() {
        // TODO implement here
        return null;
    }

    Producto getProducto(int id)
    {
        for (Producto p: this.productos){
            if (p.getProductoID() == id)
                return p;
        }
        return null;
    }
    Factura getFactura(int numero)
    {
        for (Factura f: this.facturas){
            if (f.getNumero() == numero)
                return f;
        }
        return null;
    }
    public int agregarRemito(String cuitCliente, RemitosEmitidosDTO remito)
    {
        //Cliente unCliente = ClienteController.getInstance().getCliente(cuitCliente);
        Cliente unCliente = null;
        Remito r =new Remito(unCliente, this.remitos.size() + 1, LocalDate.now());

        for (ProductoRemitoDTO pr: remito.productos) {
            Producto p = getProducto(pr.productoID);
            r.agregarProducto(p, pr.cantidad, pr.precio);
        }

        return this.remitos.size();
    }

    public int agregarFactura(String cuitCliente, FacturaDTO factura)
    {
        //Cliente unCliente = ClienteController.getInstance().getCliente(cuitCliente);
        Cliente unCliente = null;
        Factura f =new Factura(unCliente, factura.sucursalID, factura.numero, factura.fchEmision);

        for (ProductoFacturaDTO pr: factura.productos) {
            Producto p = getProducto(pr.productoID);
            f.agregarProducto(p, pr.cantidad, pr.precio);
        }

        return this.remitos.size();
    }
    /**
     * @param fchDesde 
     * @param fchHasta
     */
    public int productoMasVendido(LocalDate fchDesde, LocalDate fchHasta) {
        ArrayList<ProductoRemitoDTO> consolidado = new ArrayList<ProductoRemitoDTO>();
        for (Remito r: this.remitos) {
            if (r.getFecha().isAfter(fchDesde) && r.getFecha().isBefore(fchHasta)) {
                ArrayList<ProductoRemitoDTO> lista = r.getListaProductos();

                for (ProductoRemitoDTO prod: lista) {
                    boolean encontrado = false;
                    for (ProductoRemitoDTO prodConsoli: consolidado) {
                        if (prod.productoID == prodConsoli.productoID)
                        {
                            prodConsoli.cantidad += prod.cantidad;
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado)
                        consolidado.add(prod);
                }
            }
        }

        if (consolidado.size() == 0)
            return -1;
        else {
            ProductoRemitoDTO masvendido = consolidado.get(0);
            for (ProductoRemitoDTO p: consolidado) {
                if (p.cantidad > masvendido.cantidad)
                    masvendido = p;
            }
            return masvendido.productoID;
        }
    }
}