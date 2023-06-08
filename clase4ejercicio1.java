import javax.swing.JOptionPane;
public class clase4ejercicio1{
    public static void main(String[] args){
        String empleados1 = JOptionPane.showInputDialog("ingrese la cantidad de empleados: ");
        double empleados = Integer.parseInt(empleados1);
        double total = 0;
        for(int i=0;i<empleados;i++){
            String salario1 = JOptionPane.showInputDialog("ingrese los salarios de los empleados: ");
            int salario = Integer.parseInt(salario1);
            Double invalidez = salario * 0.0925;
            double seguro = salario * 0.0508;
            total += invalidez+seguro;
        }
        JOptionPane.showMessageDialog(null,"la empresa debera abonar "+total+" por conceptos de SEM y IVM");
    }
}