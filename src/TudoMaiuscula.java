public class TudoMaiuscula extends ProcessadorTexto {

    @Override
    protected char[] converterCaracteres(char[] chars) {
        char[] resultado = new char[chars.length];
        
        // Lógica específica: Iterar e converter para caixa alta
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toUpperCase(chars[i]);
        }
        
        return resultado;
    }
}