package Modelos;

public class Producto
{

    private int id;
    private String nombre;
    private String ruta;

    public Producto()
    {
    }

    public Producto(int id, String nombre, String ruta)
    {
        this.id = id;
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getRuta()
    {
        return ruta;
    }

    public void setRuta(String ruta)
    {
        this.ruta = ruta;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

}
