package OOPS.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(18);
        son.career("Engineer");

        Daughter daughter=new Daughter(21);
        daughter.career("Doctor");

        // Parent mom=new Parent(); ERROR:For abstract classes ,object can't be created
    }
}
