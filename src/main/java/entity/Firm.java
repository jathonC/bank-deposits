package entity;
import java.util.Objects;

public abstract class Firm {

    private String id;

    private String name;
    private String country;

    private Depositor depositor;
            //= new ArrayList<Depositor>();


    public Firm() {
    }

    public Firm(String id, String name, String country, Type type, Depositor depositors) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.depositor = depositors;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Depositor getDepositor() {
        return depositor;
    }

    public void setDepositor(Depositor depositor) {
        this.depositor = depositor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Firm firm = (Firm) o;
        return id == firm.id
                && name.equals(firm.name)
                && country.equals(firm.country)
                && Objects.equals(depositor, firm.depositor);
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        result = 31 * result + ((name == null) ? 0 : name.hashCode());
        result = 31 * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "firm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", depositors=" + depositor +
                '}';
    }
}
