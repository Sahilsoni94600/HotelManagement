package solution2;

import java.util.List;

public class ItemServiceImpl implements ItemService {

    @Override
    public Item findByCode(List<Item> items, String code) {

        for (Item item : items) {
            if (code.equals(item.getCode())) {
                return item;
            }
        }
        return null;
    }
}

/**/