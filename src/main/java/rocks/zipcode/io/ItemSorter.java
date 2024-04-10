package rocks.zipcode.io;

import rocks.zipcode.io.comparators.IdComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items, comparator);

return items;

    }

}
