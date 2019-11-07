package solution2;

import java.util.ArrayList;
import java.util.List;

public class ItemFactory {

    List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();

        items.addAll(getAllSoup());
        items.addAll(getAllBread());
        items.addAll(getAllRice());
        items.addAll(getAllVegetables());

        return items;
    }

    List<Item> getAllSoup() {

        List<Item> items = new ArrayList<>();

        Item vegClearSoup = new Item();
        vegClearSoup.setCode("VCS");
        vegClearSoup.setType("Soup");
        vegClearSoup.setName("Vegetable Clear Soup");
        vegClearSoup.setPrice(60);
        items.add(vegClearSoup);

        Item vegNoodleSoup = new Item();
        vegNoodleSoup.setCode("VNS");
        vegNoodleSoup.setType("Soup");
        vegNoodleSoup.setName("Vegetable Noodle Soup");
        vegNoodleSoup.setPrice(60);
        items.add(vegNoodleSoup);

        Item vegHotSourSoup = new Item();
        vegHotSourSoup.setCode("VHSS");
        vegHotSourSoup.setType("Soup");
        vegHotSourSoup.setName("Vegetable Hot and Sour Soup");
        vegHotSourSoup.setPrice(60);
        items.add(vegHotSourSoup);

        Item vegSweetCornSoup = new Item();
        vegSweetCornSoup.setCode("VSCS");
        vegSweetCornSoup.setType("Soup");
        vegSweetCornSoup.setName("Vegetable Sweeet Corn Soup");
        vegSweetCornSoup.setPrice(60);
        items.add(vegSweetCornSoup);

        return items;
    }

    List<Item> getAllBread() {
        List<Item> items = new ArrayList<>();

        Item tandooriRoti = new Item();
        tandooriRoti.setCode("TR");
        tandooriRoti.setType("Bread");
        tandooriRoti.setName("Tandoori Roti");
        tandooriRoti.setPrice(18);
        items.add(tandooriRoti);

        Item butterTandooriRoti = new Item();
        butterTandooriRoti.setCode("BTR");
        butterTandooriRoti.setType("Bread");
        butterTandooriRoti.setName("Butter Tandoori Roti");
        butterTandooriRoti.setPrice(25);
        items.add(butterTandooriRoti);

        Item plainNan = new Item();
        plainNan.setCode("PN");
        plainNan.setType("Bread");
        plainNan.setName("Plain Nan");
        plainNan.setPrice(33);
        items.add(plainNan);

        Item butterNan = new Item();
        butterNan.setCode("BN");
        butterNan.setType("Bread");
        butterNan.setName("Butter Nan");
        butterNan.setPrice(42);
        items.add(butterNan);

        return items;
    }

    List<Item> getAllRice() {
        List<Item> items = new ArrayList<>();

        Item pulao = new Item();
        pulao.setCode("P");
        pulao.setType("Rice");
        pulao.setName("Pulao");
        pulao.setPrice(50);
        items.add(pulao);

        Item vegPulao = new Item();
        vegPulao.setCode("VP");
        vegPulao.setType("Rice");
        vegPulao.setName("Veg Pulao");
        vegPulao.setPrice(80);
        items.add(vegPulao);

        Item rice = new Item();
        rice.setCode("R");
        rice.setType("Rice");
        rice.setName("Rice");
        rice.setPrice(40);
        items.add(rice);

        Item vegFriedRice = new Item();
        vegFriedRice.setCode("VFR");
        vegFriedRice.setType("Rice");
        vegFriedRice.setName("Veg Fried Rice");
        vegFriedRice.setPrice(60);
        items.add(vegFriedRice);

        return items;
    }

    List<Item> getAllVegetables() {
        List<Item> items = new ArrayList<>();

        Item dalFry = new Item();
        dalFry.setCode("DF");
        dalFry.setType("Vegetable");
        dalFry.setName("Dal Fry");
        dalFry.setPrice(60);
        items.add(dalFry);

        Item dalMakhani = new Item();
        dalMakhani.setCode("DM");
        dalMakhani.setType("Vegetable");
        dalMakhani.setName("Dal Makhani");
        dalMakhani.setPrice(80);
        items.add(dalMakhani);

        Item mixVeg = new Item();
        mixVeg.setCode("MV");
        mixVeg.setType("Vegetable");
        mixVeg.setName("Mix Veg");
        mixVeg.setPrice(70);
        items.add(mixVeg);

        Item kadhaiPaneer = new Item();
        kadhaiPaneer.setCode("KP");
        kadhaiPaneer.setType("Vegetable");
        kadhaiPaneer.setName("Kadhai Paneer");
        kadhaiPaneer.setPrice(100);
        items.add(kadhaiPaneer);

        return items;
    }
}
