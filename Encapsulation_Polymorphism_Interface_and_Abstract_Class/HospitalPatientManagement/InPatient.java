package Encapsulation_Polymorphism_Interface_and_Abstract_Class.HospitalPatientManagement;

public class InPatient extends Patient {

    public InPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void calculateBill(){
        setBillAmount((int)(Math.random() * 100000) + 10000);
        System.out.println("In Patient calculated bill: " + getBillAmount());
    }
}