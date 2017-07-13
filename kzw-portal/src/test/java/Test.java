import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kzw.common.pojo.KZWResult;
import com.kzw.portal.pojo.Products;
import com.kzw.portal.service.ProductsService;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
		
		ProductsService service = ac.getBean(ProductsService.class);
		
		KZWResult result = service.getProductsList(0l);
		List<Products> list = (List<Products>) result.getData();
		
		for (Products tbItem : list) {
			System.out.println(tbItem.getItem().getTitle());
		}
		
		System.out.println(list);
	}
}
