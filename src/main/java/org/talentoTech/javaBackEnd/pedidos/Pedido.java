package org.talentoTech.javaBackEnd.pedidos; 
import org.talentoTech.javaBackEnd.productos.Producto; 
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;

public class Pedido {
    private static int contador = 1; 
    private Map<Integer, itemPedido> items; 

    public Pedido(){
        this.items = new HashMap<>();
    }

    public Pedido(Producto prod, int cantDeseada){
        this.items = new HashMap<>();
        this.agregarItem(prod, cantDeseada); 
    }

    public void agregarItem (Producto prod, int cantDeseada){
        itemPedido newItem = new itemPedido(prod, cantDeseada);
        newItem.setProductoId(contador);
        this.items.put(newItem.getProductoId(), newItem);
        contador ++; 
    }


    public itemPedido getProductItem(int id){
        return this.items.get(id); 
    }
    
    public void pedidoConfirmado(){
           for (itemPedido item : items.values()) {
                item.disminuirStock(); 
        }
    }
    public void mostrarPedidoTotal(){
        for (itemPedido item : items.values()) {
            System.out.println(item); 
        }
    }
    public void eliminarItem(int id){
        this.items.remove(id); 
    }
    public double costoTotalDelPedido(){
        return this.items.values().stream()
            .mapToDouble(itemPedido::costoItem) 
            .sum();
    }

}