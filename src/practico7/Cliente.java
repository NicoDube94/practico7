package practico7;

public class Cliente {
    private String nombre,apellido,direccion,ciudad;
    private long dni;
    public Cliente(String nombre, String apellido, String direccion, String ciudad,long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getDni() {
        return dni;
    }
    @Override
    public String toString(){
        return "{ nombre : "+nombre+", apellido :"+apellido+", direccion : "+direccion+", ciudad : "+ciudad+", dni : "+dni+" }";
    }
}
