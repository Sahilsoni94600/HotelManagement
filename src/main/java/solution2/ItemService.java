package solution2;

import java.util.List;

public interface ItemService {

    Item findByCode(List<Item> items, String code);
}
