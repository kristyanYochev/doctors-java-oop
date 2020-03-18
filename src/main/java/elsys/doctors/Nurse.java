package main.java.elsys.doctors;

public class Nurse extends MedicBase {
    public Nurse(String first_name, String last_name, int experience) {
        super(first_name, last_name, experience);
    }

    public void vaccinate(Patient patient, VaccineType vaccineType) {
        System.out.println("Vaccinated " + patient + " with " + vaccineType.toString());
    }
}
