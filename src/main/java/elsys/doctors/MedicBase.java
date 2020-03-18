package main.java.elsys.doctors;

public abstract class MedicBase {
    protected final String first_name;
    protected final String last_name;
    protected final int experience;

    public MedicBase(String first_name, String last_name, int experience) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.experience = experience;
    }
}
