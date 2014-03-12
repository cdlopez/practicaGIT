/**
 *
 * @author bertoa
 */
public class GitAux {
    
    public void metodoAlumno1(){
        //Un conflicto que git resuelve automaticamente
	System.out.println("metodo 1");
    }
    
    public void metodoAlumno2(){
	System.out.println("metodo 2");
	System.out.println("modificado por CMLuis"); // Alumno 2 = CMLuis
    }
 
    public void metodoAlumno3(){
        System.out.println("metodo 3");
	System.out.printin("modificado por IgnacioM"); //alumno 3 = IgnacioM
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// Modificaciones CMLuis
	System.out.println("CMLuis inserta esta sentencia");
        //Un cambio conflictivo
	System.out.println("CONFLICTO");
	System.out.println("Arreglo conflicto 2");
    }
}
>>>>>>> 8bf1c73c29903522be22f82e95f7fe88dc474a25
