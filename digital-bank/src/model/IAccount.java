package model;

public interface IAccount {
    void withDrawMoney(double value);
    void depositMoney(double value);
    void transferMoney(double value, IAccount destinAccount);
    void printExtract();
}
