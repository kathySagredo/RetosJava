public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        var nombreUsuario = "  Ubaldo Acosta Soto  ";
        System.out.println("nombreUsuario = " + nombreUsuario);
        nombreUsuario = nombreUsuario.trim();
        var nombre = nombreUsuario.substring(0,6);
        var apellido1 = nombreUsuario.substring(7,13);
        var apellido2 = nombreUsuario.substring(14);
        var nombreUsuarioNormalizado = nombre.concat(".").concat(apellido1).concat(".").concat(apellido2).toLowerCase();
        System.out.println("nombreUsuarioNormalizado = " + nombreUsuarioNormalizado);

        var nombreEmpresa = "Global Mentoring";
        var extension = ".com.mx";
        System.out.println("nombreEmpresa = " + nombreEmpresa);
        System.out.println("extension = " + extension);
        nombreEmpresa = nombreEmpresa.toLowerCase().trim();
        var cad1 = nombreEmpresa.substring(0,6);
        var cad2 = nombreEmpresa.substring(7);
        var dominioNormalizado = cad1.concat(cad2).concat(extension);
        System.out.println("dominioNormalizado = " + dominioNormalizado);
        
        var emailFinal = nombreUsuarioNormalizado.concat("@").concat(dominioNormalizado);
        System.out.println("emailFinal = " + emailFinal);
    }
}
