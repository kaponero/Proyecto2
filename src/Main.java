public class Main {
    public static void main(String[] args) {

        var numeroIf = -50;
        var numeroWhile = 0;
        var estacion = "Primavera";

        if (numeroIf > 0) {
            System.out.println("Es positivo");
        }
        else if (numeroIf < 0){
            System.out.println("Es negativo");
        }
        else
            System.out.println("Es cero");

        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile<4);

        for (var numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }


}