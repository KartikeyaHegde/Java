package OOAD.Chapter01.RicksGuitarV02;

public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINGS, OLSON, RYON, PRS;

    @Override
    public String toString() {
        switch(this)
        {
            case FENDER:
                return "fender";
            case MARTIN:
                return "martin";
            case GIBSON:
                return "gibson";
            case COLLINGS:
                return "Collings";
            case RYON:
                return "ryon";
            case OLSON:
                return "olson";
            case PRS:
                return "prs";

            default: return "unspecified";


        }
    }
}
