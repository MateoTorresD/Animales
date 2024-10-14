//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Animal vaca = new Animal();
        Animal vaca = new Animal("Mamifero", "Holstein", 34.5f, 5);
        /*vaca.setTipo("Mamifero");
        vaca.setRaza("Holstein");
        vaca.setPeso(34.5f);
        vaca.setEdad(5);*/

        System.out.println("Datos del animal\n" + vaca.verDetalle());
    }
}