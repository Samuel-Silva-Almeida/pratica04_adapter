public class Principal {
    public static void main(String[] args) {

        BuracoRedondo buraco = new BuracoRedondo(5.0);

        PinoRedondo pinoRedondo = new PinoRedondoConcreto(4.0);
        System.out.println("Pino redondo encaixa? " + buraco.encaixa(pinoRedondo));

        PinoQuadrado pinoQuadrado = new PinoQuadrado(5.0);
        AdaptadorPinoQuadrado adaptador = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino quadrado encaixa? " + buraco.encaixa(adaptador));

        PinoQuadrado pinoQuadradoGrande = new PinoQuadrado(6.0);
        AdaptadorPinoQuadrado adaptadorGrande = new AdaptadorPinoQuadrado(pinoQuadradoGrande);
        System.out.println("Pino quadrado grande encaixa? " + buraco.encaixa(adaptadorGrande));
    }
}
