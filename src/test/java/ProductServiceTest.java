import org.example.Product;
import org.example.ProductApiClient;
import org.example.ProductService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class ProductServiceTest {
    @Test
    public void testGetProduct() {
        // Création du mock pour ProductApiClient
        ProductApiClient productApiClientMock = mock(ProductApiClient.class);

        // Création d'un objet ProductService avec le mock
        ProductService productService = new ProductService(productApiClientMock);

        // Données de test
        String productId = "547";
        Product expectedProduct = new Product();

        // Configuration du mock pour simuler le comportement
        when(productApiClientMock.getProduct(productId)).thenReturn(expectedProduct);

        // Appel de la méthode à tester
        Product actualProduct = productService.getProduct(productId);

        // Vérification des résultats
        assertEquals(expectedProduct, actualProduct);
    }
}
