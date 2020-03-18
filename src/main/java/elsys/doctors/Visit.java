package main.java.elsys.doctors;

import java.util.Date;
import java.util.Set;

public class Visit {
    private final Date date;
    private final Set<Symptom> symptoms;
    private final Prescription prescription;

    public Visit(Date date, Set<Symptom> symptoms, Prescription prescription) {
        this.date = date;
        this.symptoms = symptoms;
        this.prescription = prescription;
    }
}
