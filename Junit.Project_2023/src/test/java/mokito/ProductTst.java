//package mokito;
//
//import static org.junit.Assert.assertEquals;
//
//import java.security.Provider.Service;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//import mockitotest.ServiceImpl;
//
//public class ProductTst {
//   
////	Service service = Mockito.mock(Service.class);
////	Product product = new Product(service);
//	
//	
//	
//	//Use of Spy:
//	ServiceImpl obj = new ServiceImpl();
//	Service service = Mockito.spy(obj);
//	
//	@Test
//	public void testGetTotalCost(){
//		int expectedCost = 600;
//		//Mockito.when(service.totalProduct()).thenReturn(20);
//		//Mockito.when(service.productPrice()).thenReturn(10);
//		//assertEquals(expectedCost,product.getTotalCost());
//		
//		assertEquals(expectedCost,service.totalProduct()*service.productPrice());
//	}
//}
