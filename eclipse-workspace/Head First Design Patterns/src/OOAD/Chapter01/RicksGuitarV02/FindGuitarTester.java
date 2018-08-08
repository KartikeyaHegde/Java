package OOAD.Chapter01.RicksGuitarV02;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("", 0, "Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like this guitars");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + "guitar:\n" + guitar.getBackWood() + "back and sides\n" + guitar.getTopWood() + "top.\n You can have it for only $" + guitar.getPrice() + "!\n");
            }
        } else {
            System.out.println("Sorry, Erin we have nothing for you");
        }
    }
        private static void initializeInventory (Inventory inventory)
        {
            inventory.addGuitar("V95693", 1499.95, "Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
            inventory.addGuitar("V95612", 1250.60, "Stratocastor", Builder.FENDER, Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
        }
    }


