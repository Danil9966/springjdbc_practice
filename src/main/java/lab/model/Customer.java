package lab.model;

import java.util.List;

public class Customer implements Person {
    private String name;
    private boolean broke;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public Country getCountry() {
        return null;
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public float getHeight() {
        return 0;
    }

    @Override
    public boolean isProgrammer() {
        return false;
    }

    public boolean isBroke() {
        return broke;
    }

    @Override
    public List<String> getContacts() {
        return null;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(Person person) {
    }
}
