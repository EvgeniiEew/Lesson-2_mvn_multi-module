package by.home.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {

    private User user = new User();


    @Test
    public void testGetId() {
        // when(this.user.getId()).thenReturn("String");
        assertEquals(null, this.user.getId());
    }

    @Test
    public void testGetFirstName() {
        //  when(user.getFirstName()).thenReturn("MOkito");
        assertEquals(null, this.user.getFirstName());
    }

    @Test
    public void Test_GetLast_name() {
        assertEquals(null, this.user.getLastName());

    }

    @Test
    public void setId() {
        // doCallRealMethod().when(user).setId("3");
        this.user.setId("3");
        //user().setID("3");
        assertEquals("3", this.user.getId());
    }

    @Test
    public void setFirstName() {
        this.user.setFirstName("k3");
        assertEquals("k3", this.user.getFirstName());
    }

    @Test
    public void setLastName() {
        this.user.setLastName("2");
        assertEquals("2", this.user.getLastName());
    }
}
