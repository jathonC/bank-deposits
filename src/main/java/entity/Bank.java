package entity;

import java.util.Objects;

public class Bank extends Firm {

    private Type type;
    public Bank() {
        super();
    }

    public Bank(String id, String name, String country, Type type, Depositor depositors, Type type1) {
        super(id, name, country, type, depositors);
        this.type = type1;
    }

    @Override
    public String toString() {
        return "firm{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", country='" + super.getCountry() + '\'' +
                ", depositors=" + super.getDepositor() +
                "type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (!super.equals(o)){
            return false;
        }
        Bank bank = (Bank) o;
        return type == bank.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
