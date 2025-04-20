public class Doctor extends Person
{
    private String Specialisation;
    private String contact_no;
    private Hospital hospital;
    public Patient patient;
    public boolean isAvailable = true;

    public Doctor(String name, int age, String contact_no, String Specialisation)
    {
        super(name, age);
        this.Specialisation = Specialisation;
        this.contact_no = contact_no;
    }

    public void assignPatient(Patient p)
    {
        this.patient = p;
        isAvailable = false;
    }

    public void unAssignPatient(Patient p)
    {
        if(!isAvailable && p.equals(this.patient))
        {
        this.patient = null;
        isAvailable = true;
        }
    }

    @Override
    public void displayRole()
    {
        System.out.println("ROLE: DOCTOR");
    }

    public String getContact()
    {
        return contact_no;
    }

    public void setHospital(Hospital hospital)
    {
        this.hospital = hospital;
    }

    public String getSpecialisation()
    {
        return Specialisation;
    }

    public String toString()
    {       
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("NAME: "+getName());
        System.out.println("SPECIALISATION: "+getSpecialisation());
        System.out.println("CONTACT: "+getContact());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        return "";
    }

}
