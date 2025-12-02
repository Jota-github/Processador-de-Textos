public class Main {
    public static void main(String[] args) {
        String textoOriginal = "Ola Mundo! Exemplo de Template Method.";
        
        System.out.println("Texto Original: " + textoOriginal);
        System.out.println("------------------------------------------------");

        // Testando Maiúscula
        ProcessadorTexto maiuscula = new TudoMaiuscula();
        String textoMaiusculo = maiuscula.processar(textoOriginal);
        System.out.println("Maiúscula: " + textoMaiusculo);

        // Testando Minúscula
        ProcessadorTexto minuscula = new TudoMinuscula();
        String textoMinusculo = minuscula.processar(textoOriginal);
        System.out.println("Minúscula: " + textoMinusculo);
    }
}