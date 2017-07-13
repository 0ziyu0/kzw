import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kzw.common.util.PageData;
import com.kzw.mapper.TbItemMapper;
import com.kzw.pojo.TbItem;
import com.kzw.service.ItemService;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
		
		ItemService service = ac.getBean(ItemService.class);
		TbItem item = new TbItem();
		item.setStatus((byte)2);
		item.setStoreId(2L);
		item.setCreatetime(new Date());
		item.setUpdatetime(new Date());
		
		PageData pageData = new PageData();
		PageData page = service.selectPage(pageData);
		List<TbItem> result = (List<TbItem>) page.getResult();
		for (TbItem tbItem : result) {
			System.out.println(tbItem.getBarcode());
			System.out.println(tbItem.getCreatetimeStr());
			System.out.println(tbItem.getTitle());
			
		}
	}
}
