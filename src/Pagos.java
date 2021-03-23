public class Pagos extends Empleado {

    // Constructor
    public Pagos(int categoria, int horas, int extras, int salario) {
        super(categoria, horas, extras, salario);
    }


    public static void main(String[] args){

        Empleado Salary = new Empleado(0, 0,0, 0);
        Salary.CapturaDatos();
        Salary.CalculoExtras();
        Salary.TarifaCategoria();

    }
}
