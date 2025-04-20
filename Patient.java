public class Patient extends Person
{
    private String bloodGroup;
    private String disease;
    private String contact_no;
    private Hospital hospital;
    private Doctor doc;

    public void appointDoc(Doctor d)
    {
        this.doc = d;
    }

    public void unAppointDoc(Doctor d)
    {
        this.doc = null;
    }

    public void getDocNAME()
    {
        System.out.println(doc.getName());
    }

    public Patient(String name, int age, String contact_no, String bloodGroup, String disease)
    {
        super(name, age);
        this.bloodGroup = bloodGroup;
        this.disease = disease;
        this.contact_no = contact_no;
    }

    public void setHospital(Hospital hospital)
    {
        this.hospital = hospital;
    }

    public String getContact()
    {
        return contact_no;
    }

    @Override
    public void displayRole()
    {
        System.out.println("ROLE: PATIENT");
    }
    
    public String getBloodGroup()
    {
        return bloodGroup;
    }

    public String getDisease()
    {
        return disease;
    }

    public String toString()
    {   
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("NAME: "+getName());
        System.out.println("DISEASE: "+getDisease());
        System.out.println("BLOODGROUP: "+getBloodGroup());
        System.out.println("AGE: "+getAge());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        return "";
    }
}
