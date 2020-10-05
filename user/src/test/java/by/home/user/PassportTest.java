package by.home.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PassportTest {
    @Mock
    User user;

    @InjectMocks
    Passport passport;

    @Test
    public void getNumberUser() throws Exception {
        when(user.getId()).thenReturn("1"); //статически заимпортить When
        assertEquals("11", passport.getNumberUser());

        }
    }

