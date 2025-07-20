package classes;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private boolean isClosed = false;
    private List<Item> itemList = new ArrayList<>();

/*    public void addItem(Item item){
        itemList.add(item);
    }*/

    public void addItem(long id, double price, String name) {
        itemList.add(new Item(id, price, name));
    }

    public Bill createBill() {

        class BillValidator {
            boolean isReadyToCreateBill() {
                return isClosed == true;
            }
        }
        BillValidator billValidator = new BillValidator();
        if (billValidator.isReadyToCreateBill()) {
            var bill = new Bill();
            bill.numberOfItems = itemList.size();
            bill.totalCost = itemList.stream().mapToDouble(i -> i.price).sum();
            bill.id = 0;
        }
        return null;
    }

    public void closed() {
        isClosed = true;

        System.out.println("Order resume: ");
        for (var item :
                itemList) {
            item.print();
        }

    }

    static class Bill {
        private long id;
        private double totalCost;
        private int numberOfItems;

    }

    //class Item {
    private class Item {
        private long id;
        private double price;
        private String name;

        public Item(long id, double price, String name) {
            this.id = id;
            this.price = price;
            this.name = name;
        }

        private void print() {
            System.out.println("Item: id " + id + ", price " + price + " name " + name);
        }
    }
}
