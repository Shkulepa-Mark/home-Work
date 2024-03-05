package HomeWork_5;

public class Patient {
    private String name;
    private TreatmentPlan treatmentPlan;

    public Patient(String name, TreatmentPlan treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public String getName() {
        return name;
    }

    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }
}
