# 📒 Address Book System (Java | GitFlow Based Development)

## 📌 Project Overview

The **Address Book System** is a Java console-based application developed incrementally using the **GitFlow branching strategy**.

Each Use Case (UC1–UC13) was implemented in a separate feature branch and merged into the `develop` branch while retaining feature history.

This project demonstrates:

* Object-Oriented Programming (OOP)
* Collections Framework
* Java Streams API
* Sorting & Grouping
* File I/O Operations
* Git Version Control (Feature-based workflow)

---

## 🏗️ Project Architecture

```
AddressBookMain  →  AddressBookSystem  →  AddressBook  →  Contact
(UI Layer)          (Multi-Book Mgmt)      (Logic)         (Model)
```

### Class Responsibilities

* **Contact**

  * Stores contact details
  * Overrides `equals()` and `hashCode()` for duplicate checking
  * Overrides `toString()` for formatted display

* **AddressBook**

  * Manages list of contacts
  * Add, Edit, Delete
  * Duplicate validation
  * Search, Group, Sort
  * Uses Java Streams

* **AddressBookSystem**

  * Manages multiple address books
  * Stores them in a `Map<String, AddressBook>`

* **FileIOService**

  * Reads and writes address book data to file using Java File I/O

* **AddressBookMain**

  * Console-based UI
  * Menu-driven program

---

## 🚀 Features Implemented (Use Cases)

### UC1 – Create Contact

* Defined Contact class with required fields.

### UC2 – Add Contact

* Console-based input
* Object-oriented design

### UC3 – Edit Contact

* Edit existing contact using name.

### UC4 – Delete Contact

* Delete contact using name.

### UC5 – Multiple Contacts

* Store multiple contacts using `ArrayList`.

### UC6 – Multiple Address Books

* Support multiple address books using `HashMap`.

### UC7 – Prevent Duplicate Entries

* Duplicate validation using:

  * `equals()`
  * Java Streams (`anyMatch`)

### UC8 – Search by City/State

* Search across multiple address books using Streams.

### UC9 – View by City/State

* Group contacts using `Collectors.groupingBy`.

### UC10 – Count by City/State

* Count contacts using `Collectors.counting`.

### UC11 – Sort by Name

* Alphabetical sorting using `Comparator`.

### UC12 – Sort by City/State/Zip

* Sorting using Streams and Comparators.

### UC13 – File I/O

* Read and Write contacts to file using:

  * `BufferedReader`
  * `BufferedWriter`

---

## 🛠️ Technologies Used

* Java (JDK 8+)
* IntelliJ IDEA
* Git (GitFlow Strategy)
* Java Collections Framework
* Java Streams API
* Java File I/O

---

## 🌿 GitFlow Strategy Used

Branch Structure:

```
main
develop
feature/UC1-create-contact
feature/UC2-add-contact
feature/UC3-edit-contact
feature/UC4-delete-contact
feature/UC5-multiple-contacts
feature/UC6-multiple-addressbooks
feature/UC7-duplicate-check
feature/UC8-search-city-state
feature/UC9-group-by-location
feature/UC10-count-by-location
feature/UC11-sort-by-name
feature/UC12-sort-by-city-state-zip
feature/UC13-file-io
```

### Workflow Followed

1. Each Use Case implemented in a separate `feature/` branch.
2. Feature branch merged into `develop`.
3. Feature branches retained (not deleted).
4. Final merge from `develop` → `main`.

---

## ▶️ How to Run

1. Open project in IntelliJ.
2. Ensure JDK 8 or above.
3. Run `AddressBookMain.java`.
4. Use console menu to interact with system.

---

## 📂 Project Structure

```
src/
 ├── AddressBookMain.java
 ├── AddressBookSystem.java
 ├── AddressBook.java
 ├── Contact.java
 └── FileIOService.java
```

---

## 🎯 Learning Outcomes

This project demonstrates:

* Strong understanding of OOP concepts
* Practical use of Java Streams
* Data grouping & sorting techniques
* File handling using Java
* Clean Git branching strategy
* Code hygiene & modular architecture

---

## 👨‍💻 Author

Developed as part of structured Use Case implementation with GitFlow branching model.

---

## 📜 License

This project is for educational purposes.
