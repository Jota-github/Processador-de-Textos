public abstract class ProcessadorTexto {

    // Template Method: Define o esqueleto do algoritmo.
    // É 'final' para que a ordem dos passos não seja alterada.
    public final String processar(String entrada) {
        if (entrada == null) return null;
        
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresConvertidos = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresConvertidos);
        
        return resultado;
    }

    // Passo comum 1: Extrair
    private char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    // Passo comum 2: Juntar
    private String juntarCaracteres(char[] chars) {
        return new String(chars);
    }

    // Passo abstrato: A ser implementado pelas subclasses
    protected abstract char[] converterCaracteres(char[] chars);
}