/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/14
 * Time: 10:19 PM
 */
public enum Singleton {
    getInstance;

    private int visit=0;

    public int getVisitNumber() {
        return visit++;
    }
}
