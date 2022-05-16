package challenge4version1;

public class Trabajador {
    
    //Inserte acá los atributos
    
    private String nombre;
    private String CC;
    private double salarioPorHora;
    private int horasTrabajadas;
    private int diaNacimiento;
    private int mesNacimiento;
    private int yearsNacimiento;
    
    //Inserte acá el método constructor

    public Trabajador(String nombre, String CC, double salarioPorHora, int horasTrabajadas, int diaNacimiento, int mesNacimiento, int yearsNacimiento) {
        this.nombre = nombre;
        this.CC = CC;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.yearsNacimiento = yearsNacimiento;
    }
    
    //Methods
    
    public int calcularEdad(){
        return 2021 - this.yearsNacimiento;
    }
    
    public double salarioQuincenal(){
        return this.salarioPorHora * this.horasTrabajadas;
    }
    
    //Getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int getYearsNacimiento() {
        return yearsNacimiento;
    }

    public void setYearsNacimiento(int yearsNacimiento) {
        this.yearsNacimiento = yearsNacimiento;
    }
    
}
