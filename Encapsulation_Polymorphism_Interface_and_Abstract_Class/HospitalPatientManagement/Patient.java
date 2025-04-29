package Encapsulation_Polymorphism_Interface_and_Abstract_Class.HospitalPatientManagement;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Patient implements IMedicalRecord {
    private static int totalPatient = 0;
    private final int patientID;
    private String name;
    private int age;
    private int billAmount;
    private final ArrayList<String> record;

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getBillAmount(){
        return billAmount;
    }
    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public Patient(String name, int age) {
        this.patientID = ++totalPatient;
        this.name = name;
        this.age = age;
        this.billAmount = 0;
        this.record = new ArrayList<>();
    }

    public abstract void calculateBill();

    public void getPatientDetails(){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Override
    public void addRecord(){
        record.add("Record added at " + String.valueOf(LocalTime.now()));
    }

    @Override
    public void viewRecord(){
        for (String record : record){
            System.out.println(record);
        }
    }
}