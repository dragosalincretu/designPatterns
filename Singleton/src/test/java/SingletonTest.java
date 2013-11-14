import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

/**
 * User: Dragos Alin Cretu
 * Date: 2013/11/14
 * Time: 11:16 PM
 */
public class SingletonTest {
    @Test
    public void testGetVisitNumber() {
        assertThat(Singleton.getInstance.getVisitNumber()).isEqualTo(0);
        assertThat(Singleton.getInstance.getVisitNumber()).isEqualTo(1);
        assertThat(Singleton.getInstance.getVisitNumber()).isEqualTo(2);
        assertThat(Singleton.getInstance.getVisitNumber()).isEqualTo(3);
        Singleton.getInstance.getVisitNumber();
        Singleton.getInstance.getVisitNumber();
        Singleton.getInstance.getVisitNumber();
        Singleton.getInstance.getVisitNumber();
        assertThat(Singleton.getInstance.getVisitNumber()).isEqualTo(8);
    }
}
