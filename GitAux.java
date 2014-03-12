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
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// Modificaciones CMLuis
	System.out.println("CMLuis inserta esta sentencia");
        //Un cambio conflictivo
	System.out.println("CONFLICTO");
    }
}
