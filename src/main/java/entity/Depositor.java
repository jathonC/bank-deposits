package entity;

import java.util.Objects;

public class Depositor {
    private String name;
    private int amount;
    private int profitability;
    private int term;

    public Depositor(String name, int amount, int profitability, int term) {
        this.name = name;
        this.amount = amount;
        this.profitability = profitability;
        this.term = term;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getProfitability() {
        return profitability;
    }

    public int getTerm() {
        return term;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProfitability(int profitability) {
        this.profitability = profitability;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Depositor depositor = (Depositor) o;
        return amount == depositor.amount
                && profitability == depositor.profitability
                && term == depositor.term
                && Objects.equals(name, depositor.name);
    }

    @Override
    public int hashCode() {
        int prime = 17;
        prime = 31 * prime + amount;
        prime = 31 * prime + profitability;
        prime = 31 * prime + term;
        return prime;
    }
}
