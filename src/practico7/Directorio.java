package practico7;

import java.util.*;

public class Directorio {

    private Map<Long, Cliente> directorio = new HashMap<>();

    public void agregarCliente(Long tel, Cliente cli) {
        directorio.put(tel, cli);
    }

    public Cliente buscarCliente(Long tel) {
        if (directorio.containsKey(tel)) {
            return directorio.get(tel);
        } else {
            return null;
        }
    }

    public Set<Long> buscarTelefono(String ape) {
        HashSet<Long> telefonos = new HashSet<>();
        for (Long tel : directorio.keySet()) {

            Cliente cli = directorio.get(tel);
            if (cli.getApellido().equals(ape)) {
                telefonos.add(tel);
            }
        }
        return telefonos;
    
/*----------------------- metodo alternativo --------------------------
    /*for(Map.Entry<Long,Cliente> cl: cliente.entrySet()){
          long clave=cl.getKey();
          String apellido=cl.getValue().getApellido();
          if(apellido.equals(ape)){
              telefonos.add(clave);
          }
        }
-----------------------------------------------------------------------*/
    }
    public List<Cliente> buscarClientes(String ciu){
        ArrayList<Cliente> clientes=new ArrayList<>();
        for(Long key: directorio.keySet()){
            Cliente cli=directorio.get(key);
            if(cli.getCiudad().equals(ciu)){clientes.add(cli);}
        }
        return clientes;
    }
    public void borrarCliente(long dni) {
        Long telefono = new Long(dni);
        Set<Long> claves = new HashSet<Long>();
        claves = directorio.keySet();
        Iterator it = claves.iterator();
        while (it.hasNext()) {
            telefono = (long) it.next();
            Long doc = directorio.get(telefono).getDni();
            if (doc == dni) {
                it.remove();
            }
        }
    }

    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }

}
