package practico7;

public class PruebaDirectorio {

    public static void main(String[] args) {
        
        Cliente clien1=new Cliente("Mario", "Rosales", "San Martin 233", "San Luis", 34254651);
        Cliente clien2=new Cliente("Ana", "Figo", "Mitre 1755", "San Luis", 24570234);
        Cliente clien3=new Cliente("Rosendo", "Gil", "Suipacha 560", "Villa mercedes", 21989567);
        Cliente clien4=new Cliente("Florencia", "Romulo", "Tucuman 234", "San Luis", 28643865);
        Cliente clien5=new Cliente("Maria", "Lopez", "Maipu 890", "San Luis", 36392734);
        Cliente clien6=new Cliente("Pedro", "Alaniz", "Chile 1678", "Villa Mercedes", 34567212);
        Cliente clien7=new Cliente("Nicolas", "Barroso", "Corrientes 650", "Merlo", 41750974);
        
        Directorio listao=new Directorio();
        
        listao.agregarCliente((long)265728739, clien1);
        listao.agregarCliente((long)265765342, clien2);
        listao.agregarCliente((long)266487995, clien3);
        listao.agregarCliente((long)266445342, clien4);
        listao.agregarCliente((long)266476812, clien5);
        listao.agregarCliente((long)266566349, clien6);
        listao.agregarCliente((long)261453214, clien7);
        
         
         System.out.println(listao.buscarTelefono("Rosales"));
         System.out.println(listao.buscarCliente((long)265728739));
         listao.borrarCliente(34254651);
         System.out.println(listao.buscarClientes("San Luis"));
         System.out.println();
         System.out.println(listao.getDirectorio());
    }
    
}
