package Encapsulation_Polymorphism_Interface_and_Abstract_Class.HospitalPatientManagement;

public class OutPatient extends Patient {

    public OutPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void calculateBill(){
        setBillAmount((int)(Math.random() * 1000000) + 100000);
        System.out.println("Out Patient calculated bill: " + getBillAmount());
    }
}
