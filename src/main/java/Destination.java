public enum Destination {

    //    The objects/values that we can use:
    MADRID,
    BALI,
    BORABORA,
    BRAZIL,
    DUBAI,
    BULGARIA,
    ITALY,
    MALDIVES,
    MOROCCO,
    NEWYORK,
    PORTUGAL,
    MALTA,
    SYDNEY,
    CYPRUS;

    public static boolean destinationCheck(String destination) {
        destination = destination.toUpperCase();
        for (Destination location : Destination.values()) {
            if (location.name().equals(destination)) {
                return true;
            }
        }
        return false;
    }



}
