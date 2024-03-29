package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    public int divider;

    public DivisibleByFilter(int divider) {
        this.divider = divider;
    }

    @Override
    public boolean accept(Integer number) {
        return number % divider == 0;
    }
}
