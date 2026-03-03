import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBooks = new HashMap<>();

    public void addAddressBook(String name) {
        addressBooks.put(name, new AddressBook());
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }
    public void searchByCity(String city) {
        addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .filter(c -> c.getCity().equalsIgnoreCase(city))
                .forEach(System.out::println);
    }
    public Map<String, AddressBook> getAllAddressBooks() {
        return addressBooks;
    }
}