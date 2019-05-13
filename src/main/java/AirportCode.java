public enum AirportCode {
    GLA("Glasgow International Airport"),
    EDI("Edinburgh Airport"),
    LCY("London City Airport");

    private final String name;

     AirportCode(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
