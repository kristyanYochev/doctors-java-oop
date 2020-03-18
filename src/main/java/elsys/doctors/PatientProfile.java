package main.java.elsys.doctors;

import java.util.ArrayList;
import java.util.List;

public class PatientProfile {
    private final Patient patient;
    private final List<Visit> visits;

    public PatientProfile(Patient patient) {
        this.patient = patient;
        this.visits = new ArrayList<>();
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public Patient getPatient() {
        return patient;
    }

    public int getNumberOfVisits() {
        return visits.size();
    }
}
