package Lista7;

public class Conversor {

    public static double gramasParaQuilogramas(double gramas) {
        return gramas / 1000.0;
    }

    public static double gramasParaLibras(double gramas) {
        return gramas / 453.59237;
    }

    public static double gramasParaOnças(double gramas) {
        return gramas / 28.3495231;
    }


    public static double quilogramasParaGramas(double quilogramas) {
        return quilogramas * 1000.0;
    }


    public static double quilogramasParaLibras(double quilogramas) {
        return quilogramas * 2.20462;
    }

    public static double quilogramasParaOnças(double quilogramas) {
        return quilogramas * 35.274;
    }

    public static double librasParaGramas(double libras) {
        return libras * 453.59237;
    }

    public static double librasParaQuilogramas(double libras) {
        return libras / 2.20462;
    }

    public static double librasParaOnças(double libras) {
        return libras * 16;
    }

    public static double onçasParaGramas(double onças) {
        return onças * 28.3495231;
    }

    public static double onçasParaQuilogramas(double onças) {
        return onças / 35.274;
    }

    public static double onçasParaLibras(double onças) {
        return onças / 16.0;
    }

    public static void main(String[] args) {
        System.out.println("100 Gramas para Quilogramas: " + gramasParaQuilogramas(100));
        System.out.println("100 Gramas para Libras: " + gramasParaLibras(100));
        System.out.println("100 Gramas para Onças: " + gramasParaOnças(100));
        System.out.println("100 Quilograma para gramas : " + quilogramasParaGramas(100));
        System.out.println("100 Quilograma para Libras: " + quilogramasParaLibras(100));
        System.out.println("100 Quilograma para Onças: " + quilogramasParaOnças(100));
        System.out.println("100 Libras para Gramas: " + librasParaGramas(100));
        System.out.println("100 Libras para Onças: " + librasParaOnças(100));
        System.out.println("100 Libras para Quilogramas: " + librasParaQuilogramas(100));
        System.out.println("100 Onças para Gramas: " + onçasParaGramas(100));
        System.out.println("100 Onças para Quilogramas: " + onçasParaQuilogramas(100));
        System.out.println("100 Onças para Libras: " + onçasParaLibras(100));
    }
}
