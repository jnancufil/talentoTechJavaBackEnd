package org.talentoTech.javaBackEnd.productos; 

public abstract class Producto {
    private int id; 
    private String nombre; 
    private double precio; 
    private int stockDisponible; 

    public Producto(){}
    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre; 
        this.precio = precio; 
        this.stockDisponible = stock; 
    }

    public int getId(){
        return this.id; 
    }

    public String getNombre(){
        return this.nombre; 
    }
    public Double getPrecio(){
        return this.precio; 
    }
    public int getStockDisponible(){
        return this.stockDisponible; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }
    public void setPrecio(int precio){
        this.precio = precio; 
    }
    public void setStock(int stock){
        this.stockDisponible = stock; 
    }
    public void setId(int id){
        this.id = id; 
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | " + nombre +
                " | $" + precio +
                " | Stock: " + stockDisponible; 
    }


    public void mostrarProducto() {
        System.out.println("ID: " + id +
                " | " + nombre +
                " | $" + precio +
                " | Stock: " + stockDisponible);
    }

    public boolean hayStock(int cantDeseada){
        return (cantDeseada <= this.stockDisponible) && (cantDeseada >= 0); 
    }

    

}
