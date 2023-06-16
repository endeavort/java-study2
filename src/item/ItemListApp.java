package item;

public class ItemListApp {

    public static void main(String[] args) {
        ItemList itemList = new ItemList();

        for (Item item : itemList.list) {
            System.out.println(item.getName() + ":" + item.getPrice());
        }
    }
}
