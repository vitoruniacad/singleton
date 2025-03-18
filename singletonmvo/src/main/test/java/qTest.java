import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class qTest {

    @Test
    void testSame() {
        q instance1 = q.getInstance();
        q instance2 = q.getInstance();


        assertSame(instance1, instance2);
    }
    @Test
    void testqPositions() {
        q status = q.getInstance();


        assertEquals("Uma Impressão na Fila", status.getqPositions());
    }

}