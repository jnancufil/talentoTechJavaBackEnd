package org.talentoTech.javaBackEnd.pedidos;

import org.talentoTech.javaBackEnd.productos.Producto;

public class itemPedido{


    private int cantidadDeseada; 
    private Producto producto; 


    public itemPedido(Producto prod, int cantDeseada){
        if(!prod.hayStock(cantDeseada)){
            throw new IllegalArgumentException("No hay stock suficiente.");
        }
        this.cantidadDeseada = cantDeseada; 
        this.producto = prod; 
    }

    public double costoItem(){
        return producto.getPrecio()*this.cantidadDeseada; 
    }

    public void disminuirStock(){
        if(this.producto.hayStock(this.cantidadDeseada)){
            this.producto.setStock(this.producto.getStockDisponible()-this.cantidadDeseada); 
        }
        
    }

    public String mostrarItem(){
        return this.producto.toString()+
                "| cantidad deseada: " + this.cantidadDeseada;              
    }

    public int getProductoId(){
        return this.producto.getId(); 
    }
    public void setProductoId(int id){
        this.producto.setId(id);
    }
}