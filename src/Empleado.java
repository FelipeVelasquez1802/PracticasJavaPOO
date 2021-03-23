import java.util.Scanner;

public class Empleado {

    // Variables
    private int Categoria, Horas, Extra, Salario;


    // Constructor
    public Empleado(int categoria, int horas, int extra, int salario) {

        Categoria = categoria;
        Horas = horas;
        Extra = extra;
        Salario = salario;
    }

    // Getter & Setter
    public int getHoras() {
        return Horas;
    }

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

    public int getExtra() {
        return Extra;
    }


    public int getSalario() {
        return Salario;
    }

    public void setSalario(int salario) {
        Salario = salario;
    }

    // Capturar datos del empleado
    public void CapturaDatos() {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Categoria es?");
        Categoria = sc.nextInt();
        setCategoria(Categoria);
        System.out.println("¿Cuantas horas trabajó?");
        Horas = sc.nextInt();
        System.out.println("¿Cuantas Extras trabajó?");
        Extra = sc.nextInt();

    }

    //  Formula Calculo Salarial
    public void CalculoExtras() {

        int HorasTotales = Salario * getHoras();

        if (getExtra() != 0) {
            HorasTotales += (Salario * 0.25) + Salario;
            setSalario(HorasTotales);
        } else {
            Salario = HorasTotales;
        }
    }

    // Funcion Salida
    public void MensajeSalida() {
        System.out.println("El empleado trabajo: " + getHoras() + " y " + getExtra() + " horas extra, por lo tanto su salario es de: " + getSalario());
    }

    //Case que evalua la categoria
    public void TarifaCategoria() {
        switch (getCategoria()) {

            case 1: {
                setSalario(12000);
                CalculoExtras();
                MensajeSalida();
                break;
            }
            case 2: {
                setSalario(17000);
                CalculoExtras();
                MensajeSalida();
                break;
            }
            case 3: {
                setSalario(22000);
                CalculoExtras();
                MensajeSalida();
                break;
            }
        }
    }


}
