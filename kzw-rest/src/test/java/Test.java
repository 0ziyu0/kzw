import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kzw.common.pojo.KZWResult;
import com.kzw.pojo.TbItem;
import com.kzw.rest.service.ItemCatService;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
		
		ItemCatService bean = ac.getBean(ItemCatService.class);
		
		KZWResult resultList = bean.getProductsById(3l);
		int page = 1;
		int curPage = page;
		int pageCount = 0;
		int recordCount = 0;
		int begin = 0;
		int end = 0;
		int rows = 1;
		
		List<TbItem> list = (List<TbItem>) resultList.getData();
		for (TbItem tbItem : list) {
			System.out.println(tbItem.getTitle());
		}
		/*List<TbItem> result = new ArrayList<>();
		if(list.size() > 0) {
			recordCount = list.size();
			pageCount = (recordCount / rows);
			if(recordCount % rows > 0) {
				pageCount++;
			}
			begin = (page-1)*rows;
			if(begin < 0) {
				begin = 0;
			}
			end = page*rows;
			if(end > list.size()) {
				end = list.size();
			}
			
			for(int i = begin; i < end; i++) {
				TbItem tbItem = list.get(i);
				result.add(tbItem);
			}
		}
		for (TbItem tbItem : result) {
			System.out.println(tbItem.getTitle());
		}*/
		
		
	}
}
