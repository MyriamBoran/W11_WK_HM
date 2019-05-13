public enum Model {
    BOEING747(234),
    BOMBARDIER(202),
    EMBRAER(200);


    private final int capacity;

    Model(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

}
