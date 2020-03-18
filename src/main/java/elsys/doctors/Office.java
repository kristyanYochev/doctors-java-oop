package main.java.elsys.doctors;

import java.util.*;

public class Office {
    private final Doctor doctor;
    private final Nurse nurse;
    private final Map<String, PatientProfile> profiles;

    public Office(Doctor doctor, Nurse nurse) {
        this.doctor = doctor;
        this.nurse = nurse;
        this.profiles = new HashMap<>();
    }

    public void visit(Patient patient, Set<Symptom> symptoms) {
        Diagnose diagnose;
        try {
            diagnose = doctor.diagnose(symptoms);
        } catch (DiagnoseUnknownException ex) {
            System.out.println("Could not diagnose patient.");
            return;
        }
        Prescription prescription = doctor.prescribe(diagnose);
        Visit visit = new Visit(new Date(), symptoms, prescription);

        PatientProfile profile;
        if (profiles.containsKey(patient.getEGN())) {
            profile = profiles.get(patient.getEGN());
        } else {
            profile = new PatientProfile(patient);
            profiles.put(patient.getEGN(), profile);
        }
        profile.addVisit(visit);
    }

    public List<PatientProfile> getProfilesByName() {
        List<PatientProfile> profilesByName = new ArrayList<>(this.profiles.values());

        Collections.sort(profilesByName, new Comparator<PatientProfile>() {
            @Override
            public int compare(PatientProfile p1, PatientProfile p2) {
                return p1.getPatient().getFullName().compareTo(p2.getPatient().getFullName());
            }
        });

        return profilesByName;
    }

    public List<PatientProfile> getProfilesByEGN() {
        List<PatientProfile> profilesByEGN = new ArrayList<>(this.profiles.values());

        Collections.sort(profilesByEGN, new Comparator<PatientProfile>() {
            @Override
            public int compare(PatientProfile p1, PatientProfile p2) {
                return p1.getPatient().getEGN().compareTo(p2.getPatient().getEGN());
            }
        });

        return profilesByEGN;
    }

    public List<PatientProfile> getProfilesByNumberOfVisits() {
        List<PatientProfile> profilesByNumberOfVisits = new ArrayList<>(this.profiles.values());

        Collections.sort(profilesByNumberOfVisits, new Comparator<PatientProfile>() {
            @Override
            public int compare(PatientProfile p1, PatientProfile p2) {
                return p1.getNumberOfVisits() - p2.getNumberOfVisits();
            }
        });

        return profilesByNumberOfVisits;
    }
}
