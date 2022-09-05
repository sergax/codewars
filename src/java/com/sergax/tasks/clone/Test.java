package com.sergax.tasks.clone;

import java.util.List;
import java.util.Objects;

class CellNumber {
    String number;
    double coverage;

    public CellNumber(String number, double coverage) {
        this.number = number;
        this.coverage = coverage;
    }

}

class Adress {
    int id;
    String name;

    public Adress(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Customer implements Cloneable {
    String id;
    int age;
    Adress adress;
    List<CellNumber> cellNumber;

    public Customer(String id, int age, Adress adress, List<CellNumber> cellNumber) {
        this.id = id;
        this.age = age;
        this.adress = adress;
        this.cellNumber = cellNumber;
    }

    public int hashCode() {
        return Objects.hash(this.id, this.age, this.adress, this.cellNumber);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                id.equals(customer.id) &&
                adress.equals(customer.adress) &&
                cellNumber.equals(customer.cellNumber);
    }

    @Override
    protected Customer clone() throws CloneNotSupportedException {
        int id1 = this.adress.id;
        String name = this.adress.name;
        Adress adress1 = new Adress(id1, name);
        List<CellNumber> cellNumbers = this.cellNumber;
        return new Customer(this.id, this.age, adress1, cellNumbers);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", age=" + age +
                ", adress=" + adress +
                ", cellNumber=" + cellNumber +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Adress adress = new Adress(11, "Street");
        Customer customer = new Customer(
                "123",
                66,
                adress,
                List.of(new CellNumber("123456", 3.14D))
        );
        Customer clonCastomer = null;
        try {
            clonCastomer = customer.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        adress.setName("New Name");

        System.out.println(customer);
        System.out.println(clonCastomer);
        System.out.println(customer.equals(clonCastomer));
    }
}