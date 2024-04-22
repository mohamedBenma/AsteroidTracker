package src.main;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;

public class AsteroidTest {

    @Test
    public void testAsteroidCreation() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Asteroid asteroid = new Asteroid("Bennu", sdf.parse("2023-01-01"), 500.0, 100000.0, true);

            assertNotNull(asteroid);
            assertEquals("Bennu", asteroid.getName());
            assertEquals(500.0, asteroid.getDiameter(), 0.001);
            assertEquals(100000.0, asteroid.getMissing_approach(), 0.001);
            assertTrue(asteroid.isHazardous());
        } catch (Exception e) {
            fail("Creating asteroid failed with an exception");
        }
    }

    @Test
    public void testSetName() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Asteroid asteroid = new Asteroid("Bennu", sdf.parse("2023-01-01"), 500.0, 100000.0, true);
            asteroid.setName("Ceres");
            assertEquals("Ceres", asteroid.getName());
        } catch (Exception e) {
            fail("Setting name failed with an exception");
        }
    }

    @Test
    public void testSetDiameter() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Asteroid asteroid = new Asteroid("Bennu", sdf.parse("2023-01-01"), 500.0, 100000.0, true);
            asteroid.setDiameter(725.0);
            assertEquals(725.0, asteroid.getDiameter(), 0.001);
        } catch (Exception e) {
            fail("Setting diameter failed with an exception");
        }
    }
}
mvn