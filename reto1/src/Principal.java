import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Scanner;
public class Principal{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        Paciente paciente1 = new Paciente();
        System.out.println("Ingresa nombre del paciente: ");
        paciente1.nombre= obj.next();
        System.out.println("Edad del paciente: ");
        paciente1.edad= obj.nextInt();
        System.out.println("numero expediente: ");
        paciente1.NumExpediente= obj.next();

        paciente1.mostrarInformacion();
    }
}