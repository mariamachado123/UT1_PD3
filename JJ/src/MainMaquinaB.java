public class MainMaquinaB {
    public static void main(String[] args) {
        Gato miGato = new Gato("Mishi");
        System.out.println(miGato.getNombre());
        miGato.maullar();
        System.out.println(miGato.respondeA("Mishi"));
    }
}
