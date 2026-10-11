package org.talentoTech.javaBackEnd.service;
import org.talentoTech.javaBackEnd.pedidos.Pedido;
import org.talentoTech.javaBackEnd.productos.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class ProductoService{
    //asumo que cuando el servicio este terminado, podria trabajar con una lista de pedidos. por el momento, dejo un unico pedido. 
    private Pedido pedido; 
    private Map<Integer, Producto> productosEnStock; 



public ProductoService(){
    this.pedido = new Pedido(); 
    this.productosEnStock = new HashMap<>();
} 




public Producto buscarProducto(int id){
    return this.productosEnStock.get(id); 
}

public void actualizarProducto (int id, double precio, int stock){
    //no tengo en claro si hay que actualizar el stock disponible, y tambien los prodctos que ya estna cargados en el pedido.
}

public void eliminarProducto (int id){
    //incompleto
    this.productosEnStock.remove(id); 
    
}
public void confirmarPedido(){
    this.pedido.pedidoConfirmado(); 

}