public class AdaptadorPinoQuadrado implements PinoRedondo {
    private PinoQuadrado pinoQuadrado;

    public AdaptadorPinoQuadrado(PinoQuadrado pinoQuadrado) {
        this.pinoQuadrado = pinoQuadrado;
    }

    public double getRaio() {

        return pinoQuadrado.getLargura() / Math.sqrt(2);
    }
}
