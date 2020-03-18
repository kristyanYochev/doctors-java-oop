package main.java.elsys.doctors;

import java.util.Set;

public class Doctor extends MedicBase {
    public Doctor(String first_name, String last_name, int experience) {
        super(first_name, last_name, experience);
    }

    public Diagnose diagnose(Set<Symptom> symptoms) throws DiagnoseUnknownException {
        for (Diagnose diagnose : Diagnose.values()) {
            if (diagnose.getSymptoms().containsAll(symptoms)) {
                return diagnose;
            }
        }

        throw new DiagnoseUnknownException();
    }

    public Prescription prescribe(Diagnose diagnose) {
        return diagnose.getPrescription();
    }
}
