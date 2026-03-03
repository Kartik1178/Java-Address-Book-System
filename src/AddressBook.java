import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
public class AddressBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.equals(contact));

        if (exists) {
            System.out.println("Duplicate Contact!");
        } else {
            contacts.add(contact);
        }
    }

    public List<Contact> getContacts() {
        return contacts;
    }
    public void editContact(String firstName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)) {
                c.setCity("UpdatedCity");
                System.out.println("Contact Updated");
                return;
            }
        }
        System.out.println("Contact Not Found");
    }
    public void deleteContact(String firstName) {
        contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(firstName));
    }
    public Map<String, List<Contact>> groupByCity() {
        return contacts.stream()
                .collect(Collectors.groupingBy(Contact::getCity));
    }

}