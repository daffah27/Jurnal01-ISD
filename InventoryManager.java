import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class InventoryManager<T> {
    private ArrayList<T> inventoryList;

    public InventoryManager() {
        this.inventoryList = new ArrayList<>();
    }

    public void addItem(T item) {
        inventoryList.add(item);
    }

    public void removeItem(int index) {
        inventoryList.remove(index);
    }

    public void editItem(int index, T newItem) {
        inventoryList.set(index, newItem);
    }

    public ArrayList<T> getInventoryList() {
        return inventoryList;
    }

    // Menampilkan data berdasarkan urutan kode barang
    public void displayInventory() {
        // Mengurutkan berdasarkan kode barang
        Collections.sort(inventoryList, Comparator.comparing(item -> {
            if (item instanceof ATK) {
                return ((ATK) item).getKodeBarang();
            } else if (item instanceof Bag) {
                return ((Bag) item).getKodeBarang();
            }
            return "";
        }));

        // Menampilkan data
        for (T item : inventoryList) {
            System.out.println(item);
        }
    }
}

