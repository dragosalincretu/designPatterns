public enum Singleton {
    getInstance;

    private int visit=0;

    public int getVisitNumber() {
        return visit++;
    }
}
