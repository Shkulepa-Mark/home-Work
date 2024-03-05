package HomeWork_5;

public class Clinic {
    public static void assignDoctor(Patient patient) {
        int planCode = patient.getTreatmentPlan().getCode();
        Doctor doctor;

        if (planCode == 1) {
            doctor = new Surgeon();
        } else if (planCode == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }

        System.out.println("Patient " + patient.getName() + " made an appointment with the doctor");
        doctor.treat();
    }
}
