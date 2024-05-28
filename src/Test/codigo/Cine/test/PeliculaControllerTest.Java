import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PeliculasControllerTest {

    @Test
    public void testObtenerPeliculas() {
        // Arrange
        PeliculasController controller = PeliculasController.getInstancia();

        // Act
        List<PeliculaView> peliculaViews = controller.obtenerPeliculas();

        // Assert
        assertNotNull(peliculaViews);
        assertFalse(peliculaViews.isEmpty());
        assertTrue(peliculaViews.get(0) instanceof PeliculaView);
    }
}