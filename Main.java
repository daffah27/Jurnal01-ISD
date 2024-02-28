public class Main {
    public static void main(String[] args) {
        InventoryManager<ATK> atkInventoryManager = new InventoryManager<>();

        atkInventoryManager.addItem(new ATK("A001", "Pulpen", "Pilot G2", 50));
        atkInventoryManager.addItem(new ATK("A002", "Pensil", "Faber-Castell 2B", 30));
        atkInventoryManager.addItem(new ATK("A003", "Spidol", "Snowman Board Marker", 20));
        atkInventoryManager.addItem(new ATK("A004", "Buku Tulis", "Sinar Dunia A4", 100));
        atkInventoryManager.addItem(new ATK("A005", "Kertas", "Kertas HVS A4", 200));

        System.out.println("Data ATK:");
        atkInventoryManager.displayInventory();

        InventoryManager<Bag> bagInventoryManager = new InventoryManager<>();

        bagInventoryManager.addItem(new Bag("C001", "Tempat Pensil", "Kotak Pensil Plastik", 50));
        bagInventoryManager.addItem(new Bag("C002", "Tas", "Tas Ransel", 40));
        bagInventoryManager.addItem(new Bag("C003", "Tempat Pensil", "Tempat Pensil Gantung", 30));
        bagInventoryManager.addItem(new Bag("C004", "Tempat Pensil", "Pouch Pensil", 20));
        bagInventoryManager.addItem(new Bag("C005", "Tempat Pensil", "Kotak Pensil Kayu", 10));

        System.out.println("\nData Bag:");
        bagInventoryManager.displayInventory();
    }
}