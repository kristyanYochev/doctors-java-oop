package main.java.elsys.doctors;

import java.util.HashSet;
import java.util.Set;

public enum Diagnose {
    COVID_19(covid19_symptoms(), Prescription.QUARANTINE),
    COLD(cold_symptoms(), Prescription.COLDREX),
    STRESS(stress_symptoms(), Prescription.VACATION);

    private static Set<Symptom> covid19_symptoms() {
        Set<Symptom> symptoms = new HashSet<>();
        symptoms.add(Symptom.HIGH_TEMPERATURE);
        symptoms.add(Symptom.COUGHING);
        symptoms.add(Symptom.DIFFICULTY_BREATHING);
        return symptoms;
    }

    private static Set<Symptom> cold_symptoms() {
        Set<Symptom> symptoms = new HashSet<>();
        symptoms.add(Symptom.HIGH_TEMPERATURE);
        symptoms.add(Symptom.COUGHING);
        symptoms.add(Symptom.VOMITING);
        return symptoms;
    }

    private static Set<Symptom> stress_symptoms() {
        Set<Symptom> symptoms = new HashSet<>();
        symptoms.add(Symptom.HEADACHE);
        return symptoms;
    }

    private final Set<Symptom> symptoms;
    private final Prescription prescription;

    Diagnose(Set<Symptom> symptoms, Prescription prescription) {
        this.symptoms = symptoms;
        this.prescription = prescription;
    }

    public Set<Symptom> getSymptoms() {
        return symptoms;
    }

    public Prescription getPrescription() {
        return prescription;
    }
}
