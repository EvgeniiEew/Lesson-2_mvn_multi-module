package by.home.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LibTest {
    Lib lib = new Lib();

    @Test
    public void getNameOfElectronicCatalog() {
        this.lib.setNameOfElectronicCatalogs("2h3");
        assertEquals("2h3", this.lib.getNameOfElectronicCatalogs());
    }

    @Test
    public void setNameOfElectronicCatalogs() {
        this.lib.setNameOfElectronicCatalogs("2h4");
        assertNotNull(this.lib.getNameOfElectronicCatalogs());
    }
}
