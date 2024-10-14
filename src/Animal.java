public class Animal {
    private String tipo;
    private String raza;
    private float peso;
    private int edad;

    public Animal(){

    }

    public Animal(String tipo) {
        this.tipo = tipo;
    }

    public Animal(String tipo, String raza) {
        this(tipo);
        this.raza = raza;
    }

    public Animal(String tipo, String raza, float peso) {
        this(tipo, raza);
    }

    public Animal(String tipo, String raza, float peso, int edad) {
        this(tipo, raza, peso);
    }


    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String verDetalle(){
        String dv = "El animal es del tipo: "+this.getTipo()+ "\n" + "El animal es de la raza: " + getRaza() + "\n"+
                "El animal pesa: " + getPeso() + "\n" + "El animal tiene: " + getEdad() + " anios";
        return dv;
    }
}




