package ExercicioFabricaDeBolos.bolo2;

public class BoloFactory {
    
    public enum bolos{
        Abacaxi, Choconinho, FlorestaNegra, Prestigio 
    }

    public Forma getBolos(bolos b) {
        Forma f = null;

        switch (b) {
            case Abacaxi:
                f = new Abacaxi();
                break;
            
            case Choconinho:
                f = new Choconinho();
                break;

            case FlorestaNegra:
                f = new FlorestaNegra();
                break;

            case Prestigio:
                f = new Prestigio();
                break;
            default:
                break;
        }
        return f;
    }
}
