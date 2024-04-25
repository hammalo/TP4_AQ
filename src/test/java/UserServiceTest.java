import org.example.User;
import org.example.UserRepository;
import org.example.UserService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


import static org.mockito.Mockito.verify;
public class UserServiceTest {
    @Test
    public void testGetUserById() {
        // Créer un objet mock pour UserRepository
        UserRepository mockRepository = mock(UserRepository.class);

        // Créer un utilisateur fictif pour les tests
        long userId = 254;
        User testUser = new User(userId, "louai hamma");

        // Définir le comportement attendu lors de l'appel à findUserById avec l'id 123
        when(mockRepository.findUserById(userId)).thenReturn(testUser);

        // Créer une instance de UserService avec le mockRepository
        UserService userService = new UserService(mockRepository);

        // Appeler la méthode getUserById avec l'id 123
        User result = userService.getUserById(userId);

        // Vérifier que la méthode findUserById sur l'objet mock est appelée avec le bon argument
        verify(mockRepository).findUserById(userId);

        // Vérifier que le résultat est bien celui attendu
        assertEquals(testUser, result);
    }
}
